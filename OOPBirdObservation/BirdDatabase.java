package OOPBirdObservation;


import java.util.ArrayList;


//This class handle everything in the database
//Whenever we input add,all,one or observations this class will call a method

public class BirdDatabase {

    private ArrayList<Bird> birds; //We declare a ArrayList to handle the birds we see

    public BirdDatabase() { //Constructor
        this.birds = new ArrayList<>(); //Initialize the ArrayList
    }

    public void addBird(Bird bird) { //addBird method. Takes our Bird class in as parameter.
        birds.add(bird);
    }

    public void printDatabase() { //printDatabase method. Use a for each loop to print all the birds we have in the ArrayList
        for (Bird b : birds) {
            System.out.println(b);
        }
    }

    public void printBird(String name) { //printBird method. Use a for each loop to go through our ArrayList. If input is equals to one we have in list, print only 1 bird
        for (Bird b : birds) {
            if (b.getName().equals(name)) {
                System.out.println(b);
            }
        }
    }
    //observation method. Takes a String name as parameter from Bird class.
    //Use a for each loop to go through the ArrayList
    //add to observation method from Bird class, if the same name is typed

    public void observations(String name) {
        for (Bird b : birds) {
            if (b.getName().equals(name)) {
                b.observation();
            }
        }
    }
}

