package com.entity;

import java.util.ArrayList;

public class City {

    private ArrayList<Road> roads;
    private double costOfArrivingByHighway;
    private double costOfArrivingByRailway;

    public City() {
        costOfArrivingByHighway = Double.MAX_VALUE;
        costOfArrivingByRailway = Double.MAX_VALUE;
    }

    public City(ArrayList<Road> roads, double costOfTravel) {
        this.roads = roads;
        this.costOfArrivingByHighway = costOfTravel;
    }

    public ArrayList<Road> getRoads() {
        return roads;
    }

    public void addRoad(Road road) {
        this.roads.add(road);
    }

    public double getCostOfArrivingByHighway() {
        return costOfArrivingByHighway;
    }

    public void setCostOfArrivingByHighway(double costOfArrivingByHighway) {
        this.costOfArrivingByHighway = costOfArrivingByHighway;
    }

    public void minCostOfHighway(double newCostOfArrivingByHighway) {
        if (this.costOfArrivingByHighway > newCostOfArrivingByHighway){
            this.costOfArrivingByHighway = newCostOfArrivingByHighway;
        }
    }

    public void minCostOfRailway(double newCostOfArrivingByRailway) {
        if (this.costOfArrivingByRailway > newCostOfArrivingByRailway){
            this.costOfArrivingByRailway = newCostOfArrivingByRailway;
        }
    }
}
