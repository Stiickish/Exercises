package OOPHealthStation;

import OOPDecreasingCounter.Person;

public class HealthStation {


    private int weighingsCounter = 0; //Setting a counter to 0 so we can count how many has been weigthed

    public int weigh(Person person) {
        //The method receives a person as a parameter, and it is meant to return
        //to its caller the weighr of that person. The weighr information can be
        //found by calling a suitable method of the Person person.
        //return the weight of the person passed as the parameter
        weighingsCounter = weighingsCounter + 1;
        return person.getWeight();
    }

    public void feed(Person person) { //Feed method
        //It is possible to modify the state of the object that i received as a parameter
        //Write a method called feed, that takes Person person as paramters.
        //It should increase the weight of the parameter person by one.

        //Sets a new weight by taking person class and getting the weight
        //variabel, and plus it with 1. Everytime we call a certain name and method
        //the person will gain +1 in weight.
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {

        //Create a new method called weighings. It should tell how many weighings
        //the health station has performed.
        return weighingsCounter;
    }
}

