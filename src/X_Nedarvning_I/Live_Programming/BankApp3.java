package X_Nedarvning_I.Live_Programming;

import java.time.LocalDate;
import java.util.ArrayList;

public class BankApp3 {
    public static void main(String[] args) {
        Account a1=new Indlaan("Joe Pass", 5);
        Account a2=new Hojrente("Jimmy Hendrix", 10, 10000, LocalDate.of(2023, 9, 25));

        ArrayList<Account> list=new ArrayList<Account>();
        list.add(a1);
        list.add(a2);

        for (Account a: list) a.printTransactions();
        for (Account a: list) a.deposit(100);
        for (Account a: list) a.printTransactions();
    }
}

class Indlaan extends Account {
    Indlaan(String ow, double ir){
        super(ow, ir);
    }

    public void withdraw(double amount){
        if (balance>=amount)
            super.withdraw(amount);
        else
            System.out.println("Du kan høst hæve "+balance+" kr.");
    }
}

class Hojrente extends Account {
    LocalDate releaseDate;

    Hojrente(String ow, double ir, double startBalance, LocalDate rd){
        super(ow, ir);
        super.deposit(startBalance);
        releaseDate=rd;
    }

    public void deposit(double amount) {
        System.out.println("Du kan ikke sætte penge ind på denne konto");
    }

    public void withdraw(double amount){
        if (releaseDate.isAfter(LocalDate.now()))
            System.out.println("Du kan først hæve efter "+releaseDate);
        else
            super.withdraw(amount);
    }
}









