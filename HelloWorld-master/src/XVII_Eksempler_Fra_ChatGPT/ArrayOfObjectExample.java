package XVII_Eksempler_Fra_ChatGPT;

import java.util.Arrays;

public class ArrayOfObjectExample {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Alice", 25);
        people[1] = new Person("Bob", 30);
        people[2] = new Person("Charlie", 35);

        /*
        1. Iterere gennem arrayet:
        Du kan bruge en løkke, f.eks. en for-løkke eller en foreach-løkke,
        til at gennemgå alle objekter i arrayet og udføre operationer på dem. Her er et eksempel på,
        hvordan du kan udskrive information om hver person i people-arrayet:
         */
        for (Person person : people) {
            System.out.println("Navn: " + person.name + ", Alder: " + person.age);
        }

        /*
        2. Søg efter et bestemt objekt:
        Du kan søge i arrayet efter et objekt med en bestemt egenskab.
        For eksempel, hvis du vil finde personen med navnet "Alice," kan du gøre det sådan:
         */
        for (Person person : people) {
            if (person.name.equals("Alice")) {
                System.out.println("\nAlice er fundet, hendes alder er " + person.age);
                break; // Stopper søgningen, når objektet er fundet
            }
        }
        /*
        3. Tilføj eller fjern objekter:
        Du kan tilføje eller fjerne objekter fra arrayet.
        Her er et eksempel på, hvordan du kan tilføje en ny person til arrayet:
         */

        Person newPerson = new Person("David", 40);
        Person[] updatedPeople = Arrays.copyOf(people, people.length + 1);
        updatedPeople[people.length] = newPerson;
        people = updatedPeople;

        /*
        4. Opdater objekter:
        Du kan også opdatere egenskaberne på objekter i arrayet.
        For eksempel kan du ændre alderen for "Bob" som følger:
         */
        for (Person person : people) {
            if (person.name.equals("Bob")) {
                person.age = 31; // Opdaterer Bob's alder til 31
                break; // Stopper søgningen, når objektet er fundet og opdateret
            }
        }

        for (Person person : people) {
            System.out.println("Navn: " + person.name + ", Alder: " + person.age);
        }
    }

}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

