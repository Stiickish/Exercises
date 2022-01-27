package OOPTelevisionProgram;

public class TelevisionProgram {


    private String name; //private String variabel
    private int duration; //private int variabel

    public TelevisionProgram(String name, int duration) { //Constructor
        this.name = name;
        this.duration = duration;
    }

    public boolean isAwesome() { //method. returns a boolean
        return this.name.contains("MasterChef");
    }

    public String getName() { //getter
        return name;
    }

    public int getDuration() { //getter
        return duration;
    }

    @Override
    public String toString() {  //toString method
        return this.name + ", " + this.duration + " minutes";
    }
}

