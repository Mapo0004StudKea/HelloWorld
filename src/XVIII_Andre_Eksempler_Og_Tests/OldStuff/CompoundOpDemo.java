package XVIII_Andre_Eksempler_Og_Tests.OldStuff;

public class CompoundOpDemo {
    public static void main(String[] args) {

        int number = 5;

        //One way of adding 3 to the first number
        //after this line it will show 8
        number = number + 3;

        //another way of doing the same
        //after this the number will be 11
        number += 3;

        //a way to times the first number with 2
        //after this the number will be 22
        number *= 2;

        //how to devide the number with 2
        //after this the number will be 11
        number /= 2;

        //shows the modulus (remainder) of the number
        //it will show the remainder of the number devided by another.
        //in this case it will be 11/11=1
        //could be if one number was 6 and another was 4, then it would be 6/4 = 1.5 or a half so it would show 2.
        //so it will show 1
        number %=2;

        System.out.println(number);


    }
}
