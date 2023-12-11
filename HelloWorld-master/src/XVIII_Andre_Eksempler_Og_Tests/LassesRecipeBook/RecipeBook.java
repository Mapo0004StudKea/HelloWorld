package XVIII_Andre_Eksempler_Og_Tests.LassesRecipeBook;

import java.util.*;

public class RecipeBook {
    private final Map<String, Recipe> recipeMap; //Dette er en "Mappe" der bruges til at gemme opskrifterne. Den har strings som er opskrifterne og nøgler som værdier.
    private final List<String> shoppingList; //En liste der bruges til at gemme ingredienser som tilføjes til indkøbslisten.
    private final Scanner scanner;

    public RecipeBook() { //Konstruktør
        this.recipeMap = new HashMap<>(); //Opretter en ny instans af RecipeBook og initialiserer recipeMap som en tom HashMap-
        this.shoppingList = new ArrayList<>(); //Opretter shoppingList som en tom ArrayList.
        this.scanner = new Scanner(System.in);
    }

    public void addRecipe(String title, List<String> ingredients, String instructions) {
        Recipe recipe = new Recipe(title, ingredients, instructions);
        recipeMap.put(title, recipe);
    } // Den tager en titel, en liste med ingredienser og en fremgangsmåde og opretter derefter et Recipe-objekt, som tilføjes til recipeMap.

    public Recipe findRecipe(String title) {
        return recipeMap.get(title);
    } //Denne metode giver mulighed ti at søge efter recipes. Den returnerer opskriften, hvis den findes i recipeMap, ellers returnerer den null.

    public void addToShoppingList(String ingredient) {
        shoppingList.add(ingredient);
    } //Denne metode giver dig mulighed for at tilføje ingredienser til indkøbslisten ved at tilføje dem til shoppingList.

    public void displayShoppingList() {
        System.out.println("Indkøbsliste:");
        for (String item : shoppingList) {
            System.out.println(item);
        }
    } // Denne metode udskriver indholdet af indkøbslisten til konsollen.

    public void addCommentToRecipe() {
        System.out.print("Søg efter opskrift (titel): ");
        String searchTitle = scanner.nextLine();
        Recipe foundRecipe = findRecipe(searchTitle);
        if (foundRecipe != null) {
            System.out.println("Titel: " + foundRecipe.getTitle());
            System.out.println("Ingredienser: " + foundRecipe.getIngredients());
            System.out.println("Fremgangsmåde: " + foundRecipe.getInstructions());

            System.out.print("Skriv din kommentar: ");
            String userComment = scanner.nextLine();
            System.out.print("Vurdering (1-5): ");
            double userRating = scanner.nextDouble();
            scanner.nextLine(); // Ryd inputbuffer

            foundRecipe.addComment("Bruger", userComment, userRating);
            System.out.println("Kommentar tilføjet!");
        } else {
            System.out.println("Opskrift ikke fundet.");
        }
    }

    public static void main(String[] args) { // Opretter en instans af RecipeBook og en Scanner til at læse brugerens input.
        RecipeBook recipeBook = new RecipeBook();
        Scanner scanner = new Scanner(System.in);

        while (true) { // Uendelig løkke, som giver brugeren mulighed for at vælge forskellige ting.
            System.out.println("Velkommen til din digitale opskriftsbog!");
            System.out.println("1. Tilføj opskrift");
            System.out.println("2. Søg efter opskrift");
            System.out.println("3. Tilføj til indkøbsliste");
            System.out.println("4. Vis indkøbsliste");
            System.out.println("5. Tilføj en kommentar til opskrift");
            System.out.println("0. Afslut");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Ryd inputbuffer

            switch (choice) {
                case 1:
                    System.out.print("Titel: ");
                    String title = scanner.nextLine();
                    System.out.print("Ingredienser (adskilt med komma): ");
                    String ingredientsInput = scanner.nextLine();
                    List<String> ingredients = Arrays.asList(ingredientsInput.split(","));
                    System.out.print("Fremgangsmåde: ");
                    String instructions = scanner.nextLine();
                    recipeBook.addRecipe(title, ingredients, instructions);
                    break;

                case 2:
                    System.out.print("Søg efter opskrift (titel): ");
                    String searchTitle = scanner.nextLine();
                    Recipe foundRecipe = recipeBook.findRecipe(searchTitle);
                    if (foundRecipe != null) {
                        System.out.println("Titel " + foundRecipe.getTitle());
                        System.out.println("Ingredienser: " + foundRecipe.getIngredients());
                        System.out.println("Fremgangsmåde: " + foundRecipe.getInstructions());
                        System.out.println("Kommentarer:");

                        for (Recipe.Comment comment : foundRecipe.getComments()) {
                            System.out.println("Bruger: " + comment.getUser());
                            System.out.println("Kommentar: " + comment.getComment());
                            System.out.println("Rating: " + comment.getRating());
                        }
                        System.out.println("Gennemsnitlig Rating: " + foundRecipe.getAverageRating());
                    } else {
                        System.out.println("Opskrift ikke fundet.");
                    }
                    break;

                case 3:
                    System.out.print("Tilføj til indkøbsliste (ingrediens): ");
                    String ingredient = scanner.nextLine();
                    recipeBook.addToShoppingList(ingredient);
                    break;

                case 4:
                    recipeBook.displayShoppingList();
                    break;

                case 5:
                    recipeBook.addCommentToRecipe();
                    break;

                case 0:
                    System.out.println("Farvel!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Ugyldigt valg. Prøv igen.");
                    break;
            }
        }
    }
} //Brugeren vælger en mulighed ved at indtaste et tal
// Derefter udføres den tilsvarende handling i overensstemmelse med valget ved hjælp af en switch-sætning.
// Den uendelige løkke kan stoppes ved at indtaste 0.