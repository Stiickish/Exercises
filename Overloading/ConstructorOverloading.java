package Overloading;

public class ConstructorOverloading {

    //Hvordan man overloader en constructor.
    //Opgaven viser at man kan have 3 constructors, ud fra variablerne

    public static void main(String[] args) {    //Main

        Product tapeMeasure = new Product("Tape measure");  //Nyt objekt af Product vi kalder tapeMeasure

        Product plaster = new Product("Plaster", "home improvement section");   //Nyt objekt af Product vi kalder plaster

        Product tyre = new Product("Tyre", 5);  //Nyt objekt af Product vi kalder tyre

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);
    }
}

