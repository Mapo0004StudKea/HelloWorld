package VIII_Klasser_Og_Objekter.Live_Programming.BankApp;

public class BankApp_2 {
    public static void main(String[] args) {
        Account2 a1 = new Account2(1, "Joe Pass", 5);
        Account2 a2 = new Account2(2, "Jimmy hendriks", 7);
        Account3 a3 = new Account3(3, "Bob Nobs", 5, 1000);
/*
        a1.accountNo=1;
        a1.owner="Joe Pass";
        a1.balance=0;
        a1.interestRate=5;

        a2.accountNo=2;
        a2.owner="Jimmy Hendrik";
        a2.balance=0;
        a2.interestRate=7;
 */
        a1.deposit(100);
        a1.withdraw(50);
        /*
        a1.balance=100;
        System.out.println("Kontonr: "+a1.accountNo+"\t"+a1.owner+"\t"+a1.balance);
        System.out.println("Kontonr:     "+a1.accountNo);
        System.out.println("Ejer:        "+a1.owner);
        System.out.println("Indestårnde: "+a1.balance);
         */
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}

class Account2 {
    private int accountNo;
    private String owner;
    private double balance; //indestående
    private double interestRate; //årlige rente i %

    //Constructor skal have samme navn som klassen.
    //skal være inde i klassen.
    //metode i en klasse med samme navn, bliver brugt til at initializere objektet
    Account2(int an, String ow, double ir) {
        accountNo=an;
        owner=ow;
        interestRate=ir;
        balance=0;
    }

    void setOwner(String newName) {
        owner=newName;
    }

    void deposit(double amount) {
        balance = balance+amount;
    }

    void withdraw(double amount) {
        balance = balance-amount;
    }
    @Override
    public String toString() {
        return "Kontonr: "+accountNo+"\t"+owner+"\t"+balance;
    }
}
    class Account3 {
        private int accountNo;
        private String owner;
        private double balance; //indestående
        private double interestRate; //årlige rente i %

        Account3(int ko, String ve, double pu, double th) {
            accountNo = ko;
            owner = ve;
            interestRate = pu;
            balance = th;
        }


        @Override
        public String toString() {
            return "Kontonr: " + accountNo + "\t" + owner + "\t" + balance;
        }
    }