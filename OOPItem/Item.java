package OOPItem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {

    private String name; //Private String variabel
    private LocalDateTime createdAt; //Private time variabel, to set the local time

    public Item(String name) {  //Constructor
        this.name = name;   //Initializing
        this.createdAt = LocalDateTime.now(); //Initializing
    }

    public String getName() {   //Getter
        return name;
    }

    @Override
    public String toString() {  //toString method
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss"); //New object of local time

        return this.name + " (created at: " + formatter.format(this.createdAt) + ")"; //That returns the time the file is created
    }
}

