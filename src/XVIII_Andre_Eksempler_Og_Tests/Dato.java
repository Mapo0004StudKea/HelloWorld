package XVIII_Andre_Eksempler_Og_Tests;

import java.util.Scanner;

public class Dato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            int year;
            do{
                System.out.println("Indtast et år mellem 2000 og 2999");
            }while ((year = scan.nextInt()) < 2000 || year > 2999);
            int month;
            do{
                System.out.println("Indtast en måned mellem 1 og 12");
            }while ((month = scan.nextInt()) < 1 || month > 12);
            boolean isLeapYear = false;
            if(year % 4 == 0){
                isLeapYear = true;
            }
            if(year % 100 == 0){
                isLeapYear = false;
            }
            if(year % 400 == 0){
                isLeapYear = true;
            }
            int daysInMonth;
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    daysInMonth = 31;
                    break;
                case 2:
                    if(isLeapYear){
                        daysInMonth = 29;
                    }else{
                        daysInMonth = 28;
                    }
                    break;
                default:
                    daysInMonth = 30;
            }
            int day;
            do{
                System.out.println("Indtast en dag mellem 1 og " + daysInMonth);
            }while ((day = scan.nextInt()) < 1 || day > daysInMonth);
            day++;
            if(day == daysInMonth + 1){
                day = 1;
                month++;
            }
            if(month == 13){
                month = 1;
                year++;
            }
            System.out.println("Dagen efter er: " + day + "/" + month + "-"
                    + year);
        }
    }
}
