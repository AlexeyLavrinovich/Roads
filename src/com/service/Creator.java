package com.service;

import com.entity.City;
import com.entity.Road;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
            firstCity = scanner.nextInt();
            secondCity = scanner.nextInt();
            typeOfRoad = scanner.nextInt();
            cost = scanner.nextDouble();
            cities[firstCity].addRoad(new Road(typeOfRoad, cost, secondCity));
            cities[secondCity].addRoad(new Road(typeOfRoad, cost, firstCity));
        }
        return cities;
    }

    //breadth first search
    public static void bfs() {

    }

    public static void output(String nameOfFile) {
        try {
            PrintWriter writer = new PrintWriter(new File(nameOfFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
