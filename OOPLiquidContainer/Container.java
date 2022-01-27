package OOPLiquidContainer;

public class Container {


    //Container variable
    private int container = 0;

    //Constructor
    public Container() {
        this.container = container;
    }

    //Method that returns the amount of liquid in a container as an Integer
    public int contains() {
        return container;

    }

    /*
    Add method which adds the amount of liquid given as a parameter from the container
    If the amount is negative, no liquid is removed. A container can never hold
    less than 0 units of liquid
     */
    public void add(int amount) {
        if (amount > 0) {
            container = container + amount;
        }
        if (container > 100) {
            container = 100;
        }
    }

    /*
    Method remove which removes the amount of liquid given as a parameter from the container.
    If the amount is negative, no liquid is removed. A container can never hold
    less than 0 units of liquid
     */
    public void remove(int amount) {
        if (amount > 0) {
            container = container - amount;
        }
        if (container < 0) {
            container = 0;
        }
    }

    public String toString() {
        return container + "/100";
    }
}


