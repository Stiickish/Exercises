package OOPPetShop;

public class Person {

    private String name;    //private String variabel
    private Pet pet;    //Object of pet class, so we can get name, breed etc.

    public Person(String name, Pet pet) {   //Person constructor
        this.name = name;
        this.pet = pet;
    }

    public Person(String name) {    //second person constructor --> overloading, calling the first one
        this(name, new Pet("Toothless", "dragon"));
    }

    public Person() {   //third person constructor --> overloading, calling the second constructor
        this("Lilo", new Pet("Stitch", "blue alien"));
    }

    @Override
    public String toString() {  //toString returning name and breed
        return this.name + ", has a friend called " + pet.getName() + "(" + pet.getBreed() + ")";
    }

}


