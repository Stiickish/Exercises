package OOPBirdObservation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author yelon
 */

//This class handles bird names and observations
//We make an overload on the constructor, so we don't have to use the observations, when we make a new object of bird. Otherwise it require 3 variables

public class Bird {

    private String name;
    private String latinBirdName;
    private int observation;

    //Overload the constructor
    public Bird(String name, String latinBirdName) {
        this.name = name;
        this.latinBirdName = latinBirdName;
        this.observation = 0;
    }

    public Bird(String name, String latinBirdName, int observation) {
        this.name = name;
        this.latinBirdName = latinBirdName;
        this.observation = observation;
    }

    public String getName() {
        return this.name;
    }

    public String getLatinBirdName() {
        return this.latinBirdName;
    }

    public void observation() {
        this.observation++;
    }

    public String toString() {
        return this.name + "(" + this.latinBirdName + ")" + this.observation + " observation";
    }
}
