package com.entity;

public class Road {
    private int typeOfRoad;
    private double costOfRoad;
    private int nextCity;

    public Road() {
    }

    public Road(int typeOfRoad, double costOfRoad, int nextCity) {
        this.typeOfRoad = typeOfRoad;
        this.costOfRoad = costOfRoad;
        this.nextCity = nextCity;
    }

    public int getTypeOfRoad() {
        return this.typeOfRoad;
    }

    public void setTypeOfRoad(int typeOfRoad) {
        this.typeOfRoad = typeOfRoad;
    }

    public double getCostOfRoad() {
        return costOfRoad;
    }

    public void setCostOfRoad(double costOfRoad) {
        this.costOfRoad = costOfRoad;
    }

    public int getNextCity() {
        return nextCity;
    }

    public void setNextCity(int nextCity) {
        this.nextCity = nextCity;
    }

    public boolean equals(Road road) {
        return this.typeOfRoad == road.getTypeOfRoad();
    }
}
