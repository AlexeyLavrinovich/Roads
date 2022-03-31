package com.service;

import com.entity.City;
import com.entity.Road;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Creator {

    public static City[] creatMap(String nameOfFile) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(nameOfFile));
        City[] cities = new City[scanner.nextInt()];
        int numOfRoads = scanner.nextInt();
        int firstCity;
        int secondCity;
        int typeOfRoad;
        double cost;
        for (int i = 0; i < numOfRoads; i++) {
            firstCity = scanner.nextInt() - 1;
            secondCity = scanner.nextInt() - 1;
            typeOfRoad = scanner.nextInt();
            cost = scanner.nextDouble();
            if(cities[firstCity] == null)
                cities[firstCity] = createCity();
            else
                cities[firstCity].addRoad(new Road(typeOfRoad, cost, secondCity));
            if(cities[secondCity] == null)
                cities[secondCity] = createCity();
            else
                cities[secondCity].addRoad(new Road(typeOfRoad, cost, firstCity));
        }
        cities[scanner.nextInt() - 1].setMarker(1);
        cities[scanner.nextInt() - 1].setMarker(2);
        return cities;
    }

    public static City createCity(){
        return new City();
    }

    public static City findFirstCity(City[] cities){
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].getMarker() == 1)
                return cities[i];
        }
        return cities[0];
    }

    public static boolean checkType(int previousType, int newType) {
        return previousType == newType;
    }

    public static double minCost(double first, double second) {
        if (first >= second)
            return second;
        else
            return first;
    }

    //breadth first search
    public static void bfs(City[] cities) {
        ArrayList<City> route = new ArrayList<>();
        City city = new City();
        ArrayList<Road> roads;
        route.add(findFirstCity(cities));
        int previousType = -1;
        while(!route.isEmpty()){
            city = route.get(0);
            roads = city.getRoads();
            for (Road road : roads) {
                if (checkType(previousType, road.getTypeOfRoad())){
                    if(road.isHighway()) {
                        // TODO тут какая-то параша, надо поправить на минимальную стоимость
                        // TODO нужно добавить в класс City предыщий тип дороги
                        cities[road.getNextCity()].setCostOfArrivingByHighway(minCost(cities[road.getNextCity()].getCostOfArrivingByHighway(), road.getCostOfRoad() + city.getCostOfArrivingByHighway()));
                    }
                }
            }
        }
    }

    public static void output(String nameOfFile) {
        try {
            PrintWriter writer = new PrintWriter(new File(nameOfFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
