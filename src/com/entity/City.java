package com.entity;

import java.util.ArrayList;

public class City {

    private ArrayList<Road> roads;
    private double costOfArrivingByHighway;
    private double costOfArrivingByRailway;
    private int marker;
    private int previousTypeOfRoad;

    public City() {
        roads = new ArrayList<>();
        costOfArrivingByHighway = Double.MAX_VALUE;
        costOfArrivingByRailway = Double.MAX_VALUE;
        marker = 0;
        previousTypeOfRoad = -1;
    }

    public int getPreviousTypeOfRoad() {
        return previousTypeOfRoad;
    }

    public void setPreviousTypeOfRoad(int previousTypeOfRoad) {
        this.previousTypeOfRoad = previousTypeOfRoad;
    }

    public int getMarker() {
        return marker;
    }

    public void setMarker(int marker) {
        this.marker = marker;
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

    public double getCostOfArrivingByRailway() {
        return costOfArrivingByRailway;
    }

    public void setCostOfArrivingByRailway(double costOfArrivingByRailway) {
        this.costOfArrivingByRailway = costOfArrivingByRailway;
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
