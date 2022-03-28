package com.entity;

import com.entity.Road;

import java.util.ArrayList;

public class City {
    private ArrayList<Road> roads;
    private double costOfTravel;

    public City() {
        costOfTravel = Double.MAX_VALUE;
    }

    public City(ArrayList<Road> roads, double costOfTravel) {
        this.roads = roads;
        this.costOfTravel = costOfTravel;
    }

    public ArrayList<Road> getRoads() {
        return roads;
    }

    public void addRoad(Road road) {
        this.roads.add(road);
    }

    public double getCostOfTravel() {
        return costOfTravel;
    }

    public void setCostOfTravel(double costOfTravel) {
        this.costOfTravel = costOfTravel;
    }

    public void minCost(double newCostOfTravel) {
        if (this.costOfTravel > newCostOfTravel){
            this.costOfTravel = newCostOfTravel;
        }
    }
}
