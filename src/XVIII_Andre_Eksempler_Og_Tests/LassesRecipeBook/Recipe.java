package XVIII_Andre_Eksempler_Og_Tests.LassesRecipeBook;

import java.util.*;

class Recipe {
    private final String title; //Titel på opskrift
    private final List<String> ingredients; // Dette er en liste af strenge, der repræsenterer ingredienserne i opskriften.
    private final String instructions; // Dette er en streng, der indeholder instruktionerne for at tilberede opskriften.
    private List<Comment> comments; //Liste til at gemme kommentarer
    private double averageRating; //Gennemsnitlig vurdering
    // begge værdier er final, så de kan ikke ændres efter initalisering

    public Recipe(String title, List<String> ingredients, String instructions) {
        this.title = title;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.comments = new ArrayList<>(); //Inistaliserer kommentarlisten
        this.averageRating = 0.0; //Inistaliserer gennemsnitlig vurdering til 0.0.
    } // Denne konstruktør tager en liste af ingredienser og en streng med instruktioner som argumenter
    // Derefter opretter den en ny opskrift ved at initialisere ingredients og instructions.

    public String getTitle() {
        return title;
    }

    public String getInstructions() {
        return instructions;
    } // Denne metode returnerer instruktionerne for at tilberede opskriften som en streng.

    public String getIngredients() {
        return ingredients.toString();
    } // Denne metode returnerer ingredienserne som en streng, der repræsenterer hele listen af ingredienser.


    //Metode til at tilføje en kommentar til opskriften.
    public void addComment(String user, String comment, double rating) {
        Comment newComment = new Comment(user, comment, rating);
        comments.add(newComment);
        updateAverageRating(); //Opdatere
    }

    public List<Comment> getComments() { // Metode til at få liste over kommentarer
        return comments;
    }

    public double getAverageRating() {
        return averageRating;
    }

    // Opdatering til AverageRating
    private void updateAverageRating() {
        if (comments.isEmpty()) {
            averageRating = 0.0;
        } else {
            double totalRating = 0.0;
            for (Comment comment : comments) {
                totalRating += comment.getRating();
            }
            averageRating = (double) totalRating / comments.size();
        }
    } // Listen konverteres til en streng ved hjælp af toString()-metoden.

    public class Comment{
        private String user;
        private String comment;
        private double rating;

        public Comment(String user, String comment, double rating) {
            this.user = user;
            this.comment = comment;
            this.rating = rating;
        }

        public String getUser() {
            return user;
        }

        public String getComment() {
            return comment;
        }

        public double getRating() {
            return rating;
        }
    }
}