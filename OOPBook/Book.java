package OOPBook;

public class Book {

    //private variabels
    private String name;
    private int pages;
    private int publicationYear;

    //Constructor for book class
    public Book(String name, int pages, int publicationYear) {
        this.name = name;
        this.pages = pages;
        this.publicationYear = publicationYear;

    }
    //Getter

    public String getName() {
        return name;
    }
    //Getter

    public int getPages() {
        return pages;
    }
    //Getter

    public int publicationYear() {
        return publicationYear;
    }
    //toString method

    public String toString() {
        return name + ", " + pages + " pages, " + publicationYear;
    }

}

