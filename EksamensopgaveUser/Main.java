package EksamensopgaveUser;

public class Main {
    public static void main(String[] args) {

        User henrik = new User("Henrik", "Henriksen", "HH@gmail.com");
        User ib = new User("Ib", "Ibsen", "II@gmail.com");
        User henriette = new User("Henriette", "Henriksen", "HH@gmail.com");
        User henrik2 = new User("Rasmus","Syberg","HH@gmail.com");
        UserList userList = new UserList();
        userList.addUser(henrik);
        userList.addUser(henrik);
        userList.addUser(henrik2);


    }
}
