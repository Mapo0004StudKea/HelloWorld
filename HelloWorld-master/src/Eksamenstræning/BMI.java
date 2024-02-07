package Eksamenstræning;

public class BMI {
    int height=160;
    int weight=80;
    int BMI = 0;

    public static void main(String[] args) {

    }
    public int calculate() {
        BMI=weight/height;
        System.out.println("Din BMI er: "+BMI+"kg/m^2");
        return BMI;
    }

    public boolean isUnderweight() {
        if(BMI < 18.5) {
            return true;
        }
        return false;
    }

    public boolean isOverweight() {
        if (BMI > 25) {
            return true;
        }
        return false;
    }

    public boolean isNormalWeight() {
        if (BMI <= 18.5 && BMI >= 25) {
            return true;
        }
        return false;
    }
}
