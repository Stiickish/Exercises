package Overloading;

public class Product {

//privat variables
    private String name;
    private String location;
    private int weight;

    //First constructor of Product, includes everything
    public Product(String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }
    //Second constructor. Only name as parameter.
    public Product(String name) {
        this(name, "shelf", 1); //Calling location and weight from the first constructor
    }
    //Third constructor. Name and location variabels is included as parameters.
    public Product(String name, String location) {
        this(name, location, 1);    //Calling name and location from first constructor and weight from second
    }
    //Fourth constructor. Name and weight as parameters
    public Product(String name, int weight) {
        this(name, "shelf", weight);    //Calling name and weight from first constructor, location from third
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }
}

