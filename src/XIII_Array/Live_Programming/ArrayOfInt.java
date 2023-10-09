package XIII_Array.Live_Programming;

import java.lang.reflect.Array;

public class ArrayOfInt {
    public static void main(String[] args) {
        int[] num = new int[5];
        num[0]=32;
        num[1]=17;
        num[2]=-50;
        num[3]=-2;
        num[4]=12;

        //int[] num2 = new int[4,5,9,3,1,5,9,3,4,8,5];
        // num = {3, 7, 0, -10, 9}
        //System.out.println(num);
        for (int i=0;i<num.length;i++)
            System.out.println(num[i]);

        int s = sum(num);
        System.out.println("Sum = "+s);

        //for (int i=0;i<num2.length;i++)
          //  System.out.println(num[i]);

        //int s2 = sum(num2);
        //System.out.println("Sum = "+s2);
    }
    //static er... bliver ikke kaldt på et objekt.
    static int sum(int[] arr) {
        int result = 0;
        for (int i=0;i<arr.length;i++) result=result+arr[i];
        //arr[3] = 10000;
        return result;
    }
}
