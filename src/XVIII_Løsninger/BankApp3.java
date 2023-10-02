package XVIII_Løsninger;
// Eksempel BankApp.BankApp3. Nedarvning, polymorfi
// OBS: Benytter class BankApp.Account fra BankApp.BankApp2
// Bj�rn Christensen, 2/10-2020

import java.time.LocalDate;
import java.util.Random;
/*
public class BankApp3 {
	public static void main(String[] args) {
		Account k1=new Account("Bob", 0.5);
		k1.deposit(100);
		k1.anualInterest();
		System.out.println(k1);
		
		Account k2=new Indlaan("Jill", 1);
		k2.withdraw(50);
		System.out.println(k2);
		
		Account k3=new Kredit("John", 0.5, 1000);
		k3.withdraw(800);
		System.out.println(k3);
		
		Account k4=new HoejrenteKonto("Sue", 5, 2000, 2020, 4, 1);	// Bundet indtil 1/4
		k4.deposit(100);
		k4.withdraw(100);
		System.out.println(k4);
		
		Account k5=new MilionaerKonto("Joe", 0);
		k5.deposit(100);
		k5.anualInterest();
		System.out.println(k5);
		
		Account k6=new BoerneOpsparing("Sam", 3, 2002, 3, 1);
		k6.deposit(1000);
		k6.withdraw(1000);
		System.out.println(k6);
	}
}


class Indlaan extends Account {
	Indlaan(String ow, double rate) {
		super(ow, rate);
	}
	
	void withdraw(double amount) {
		if (balance>=amount) {
			balance=balance-amount;
		} else {
			System.out.println("Ikke nok penge på kontoen");
		}
	}
}


class Kredit extends Account {
	double creditLimit;				// Er altid negativ
	
	Kredit(String ow, double rate, double limit) {
		super(ow, rate);
		creditLimit=-limit;
	}
	
	void withdraw(double amount) {
		if (balance-amount>=creditLimit) {
			balance=balance-amount;
		} else {
			System.out.println("Overtræk overskredet");
		}
	}
	
	@Override
	public String toString() {
		return super.toString()+" Kreditmax="+creditLimit;
	}	
}


class HoejrenteKonto extends Account {
	LocalDate releaseDate;

	HoejrenteKonto(String ow, double rate, double amount, int yy, int mm, int dd) {
		super(ow, rate);
		balance=amount;
		releaseDate=LocalDate.of(yy,mm,dd);
	}
	
	void deposit(double amount) {
		System.out.println("Det er ikke muligt at indsætte på denne konto");
	}
	
	void withdraw(double amount) {
		LocalDate today=LocalDate.now();
		if (today.isBefore(releaseDate)) {
			System.out.println("Saldo bundet indtil "+releaseDate);
		} else {
			balance=balance-amount;
		}
	}
}


class MilionaerKonto extends Account {
	double jackpot=1000000;	// Gevinst: 1.000.000 kr
	Random generator=new Random();

	MilionaerKonto(String ow, double rate) {
		super(ow, rate);
	}
	
	void anualInterest() {
		int winner=generator.nextInt(100000)+1;					// tal i [1;100000]
//		int winner=generator.nextInt(5)+1;					// tal i [1;100000]
		if (accountNo==winner) balance=balance+jackpot;
	}
}


class BoerneOpsparing extends Account {
	LocalDate releaseDate;

	BoerneOpsparing(String ow, double rate, int yy, int mm, int dd) {
		super(ow, rate);
		releaseDate=LocalDate.of(yy+18,mm,dd);
	}
	
	void withdraw(double amount) {
		LocalDate today=LocalDate.now();
		if (today.isBefore(releaseDate)) {
			System.out.println("Saldo bundet indtil "+releaseDate);
		} else {
			balance=balance-amount;
		}
	}
}

 */

