package XIV_Github;

import XVI_Eksempler_Fra_Bøger.Javabogen.Kapitel04.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class BankApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int choice;
            Account account = new Account("Test Person", 1);
            System.out.println("-------------------------------------------");
            System.out.println("|   Tast 1: Opret konto                   |");
            System.out.println("|   Tast 2: Kontoudskrift                 |");
            System.out.println("|   Tast 3: Indsæt penge                  |");
            System.out.println("|   Tast 4: Hæv penge                     |");
            System.out.println("|   Tast 5: Årlig rentetilskrivning       |");
            System.out.println("|   Tast 0: Afslut                        |");
            System.out.println("|                                         |");
            System.out.println("-------------------------------------------");
            System.out.print("\nVælg en af mulighederne: ");
            choice = scanner.nextInt();
            if (choice == 0) break;

            switch (choice) {

                case 1:
                    System.out.println("Du har valgt at oprette en konto.");

                    System.out.println("\nTest Person konto er oprettet.");
                    break;
                case 2:
                    account.printTransactions();
                    break;
                case 3:
                    System.out.println("Du har valgt at indsætte penge på konto");
                    account.deposit(100);
                    System.out.println("\nDer er nu laagt 100 kr ind på kontoen");
                    break;
                case 4:
                    System.out.println("Du har valgt at hæve penge");
                    account.withdraw(50);
                    System.out.println("\nDer er nu hævet 50 kr fra kontoen");
                    break;
                case 5:
                    //new Account("Test Person", 2);
                    System.out.println("Dette er en test"+account);
                    break;
            }

        }
/*
        Account a1=new Account("Joe Pass", 5);
        Account a2=new Account("Jimmy Hendrix", 7);

        a1.deposit(100);
        a1.withdraw(50);

        a1.anualInterest();
        a2.anualInterest();

        a1.printTransactions();
        a2.printTransactions();

 */
    }
} // BankApp2

class Account {
    protected static int noOfAccounts=0;
    protected int accountNo;
    protected String owner;
    protected double balance;         // Indestående
    protected double interestRate;    // Årlig rente i %
    protected ArrayList<Transaction> transactions=new ArrayList<Transaction>();

    Account(String ow, double ir){
        noOfAccounts++;
        accountNo=noOfAccounts;
        owner=ow;
        interestRate=ir;
        balance=0;
    }

    void deposit(double amount){
        balance=balance+amount;
        transactions.add(new Transaction("Indsat", amount, balance));
    }

    void withdraw(double amount){
        balance=balance-amount;
        transactions.add(new Transaction("Hævet", amount, balance));
    }

    void anualInterest(){
        double amount=balance*interestRate/100;
        balance=balance+amount;
        transactions.add(new Transaction("Renter", amount, balance));
    }

    void printTransactions(){
        System.out.println(this);
        System.out.println("Tekst\tDato\t\tBelob\tSaldo");
        for (Transaction t: transactions)
            System.out.println(t);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Kontonr: "+accountNo+"\t"+owner+"\t"+balance;
    }
} // Account

class Transaction {
    String text;
    LocalDate date;
    double amount;
    double newBalance;

    Transaction(String text, double amount, double newBalance){
        this.text=text;
        this.amount=amount;
        this.newBalance=newBalance;
        date=LocalDate.now();
    }

    @Override
    public String toString() {
        return text+"\t"+date+"\t"+amount+"\t"+newBalance;
    }
}