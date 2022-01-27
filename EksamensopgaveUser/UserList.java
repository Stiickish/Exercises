package EksamensopgaveUser;

import java.util.ArrayList;

public class UserList {

    ArrayList<User> contacts = new ArrayList<>();

    public void addUser(User u) {

        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).equals(u)){
                System.out.println("User already added to the list");
                return;
            }

        }
        System.out.println("Adding user " + u.toString());
        this.contacts.add(u);
    }
}

