package com.service;

import com.entity.City;

import java.io.FileNotFoundException;

public class Starter {


    public static void start(String nameOfInFile, String nameOfOutFile){
        try{
            City[] cities = Creator.creatMap(nameOfInFile);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
