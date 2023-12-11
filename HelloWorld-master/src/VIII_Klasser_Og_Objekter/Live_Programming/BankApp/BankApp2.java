package VIII_Klasser_Og_Objekter.Live_Programming.BankApp;

import java.time.LocalDate;
import java.util.ArrayList;

public class BankApp2 {
    //'static' for en metode betyder at... man behøver ikke objekter for at kalde metoden.
    // indikere variable som er synlig for alle klasser, der er kun en kopi i stedet for at der er en kopi i alle objekter.
    // når man sætter 'static' på main knytter sig ikke til et bestemt objekt.
    //'new' betyder man laver nye objekter
    public static void main(String[] args) {
        //int a=5;
        Account a1=new Account("Joe Pass", 5);
        Account a2=new Account("Jimmy Hendrix", 7);

        a1.deposit(500);
//      a1.withdraw();
        a2.deposit(1000);
        a2.withdraw(500);

        a1.annualInterest();
        a2.annualInterest();
        /*
        a1.setOwner("Carsten");

        a1.accountNo=1;
        a1.owner="Joe Pass";
        a1.balance=0;
        a1.interestRate=5;
        System.out.println(a1);
        System.out.println(a2);
         */
        a1.printTransactions();
        a2.printTransactions();
    }
}

class Account {
    //'static' er ikke en variable som de andre,
    private static int noOfAccounts = 0;
    private final int accountNo;
    private String owner;
    private double balance;         // Indestående
    private final double interestRate;    // Årlig rente i %
    ArrayList<Transaction> transactions = new ArrayList<>();

    //Konstrukter: metode som bliver udført når der bliver oprettet et nyt objekt
    Account(String ow, double ir){
        noOfAccounts++;
        accountNo = noOfAccounts;
        owner=ow;
        interestRate=ir;
        balance=0;
    }

    void setOwner(String newName){
        owner=newName;
    }

    void deposit(double amount){
        balance=balance+amount;
        transactions.add(new Transaction("Indsat: ", amount, balance));
    }

    void withdraw(double amount){
        balance=balance-amount;
        transactions.add(new Transaction("Hævet: ", amount, balance));
    }
    //
    @Override
    public String toString() {
        return "Kontonr: "+accountNo+"\t"+owner+"\t"+balance;
    }

    void annualInterest() {
        double amount = balance*interestRate/100;
        balance = balance+amount;
        transactions.add(new Transaction("Renter: ", amount, balance));
    }

    void printTransactions() {
        System.out.println(this);
        System.out.println("Text\tDato\t\tBeløb\tSaldo");
        for (Transaction t: transactions)
            System.out.println(t);
        System.out.println();
    }
}

class Transaction {
    String text;
    LocalDate date;
    double amount;
    double newbalance;

    Transaction (String text, double amount, double newbalance) {
        //'this' er en reference variable, that references the Transaction class. 'peger på det nuværende objekt'
        this.text = text;
        this.amount = amount;
        this.newbalance = newbalance;
        date = LocalDate.now();
    }
    @Override
    public String toString() {
        return text+"\t"+date+"\t"+amount+"\t"+newbalance;
    }
}
