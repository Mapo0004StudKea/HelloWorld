package Eksamenstræning;

import java.util.Random;

public class User2 {
    String fullName;
    String userID;
    User2(String fullName) {
        this.fullName=fullName;
        this.userID = createUserID(fullName);
    }
    public String getFullName() {
        return fullName;
    }

    public String getUserID() {
        return userID;
    }

    public boolean validUserID() {
        //String lowercaseUserID = userID.toLowerCase();
        if (userID.matches("[a-z]{4}\\d{4}$")) {
            return true;
        }
        return false;
    }

    public String createUserID(String fullName) {
        String firstName = fullName.substring(0, Math.min(fullName.length(), 2)).toLowerCase();
        String lastName = fullName.substring(fullName.lastIndexOf(' ') + 1).substring(0, Math.min(2, fullName.length())).toLowerCase();

        Random random = new Random();
        int randomInt = 1000+random.nextInt(9000);
        String randomDigits = String.valueOf(randomInt);

        return firstName+lastName+randomDigits;
    }

    public static void main(String[] args) {
        User2 user2 = new User2("Jon Doe");
        System.out.println("full Name: "+user2.getFullName());
        System.out.println("User ID: "+user2.getUserID());
        System.out.println("Is Valid UserID: "+user2.validUserID());
    }
}
