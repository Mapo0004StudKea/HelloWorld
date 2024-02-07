package Eksamenstræning;

import java.util.ArrayList;

public class User {
    String username;
    int userID;
    enum Role {Admin, Editor, Reader};
}

class Users {
    ArrayList<User> users = new ArrayList<>();

    public void createUsers() {
        while (true) {
            for(User user : users) {
                user.userID++;
            }
        }
    }
    public void adminUsers() {

    }
}
