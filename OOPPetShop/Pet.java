package OOPPetShop;

public class Pet {

//private variabels

    private String name;
    private String breed;

    public Pet(String name, String breed) { //constructor for pet
        this.name = name;
        this.breed = breed;
    }

    public String getName() {   //getter for name, so Person class can use it
        return name;
    }

    public String getBreed() {  //getter for breed, so Person class can use it
        return breed;
    }

}

