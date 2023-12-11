package III_Betingelser.SecondGo;

public class veksleprogram {
    public static void main(String[] args) {
        double dollar = 100;
        double kurs = 0.95;
        double kommission = 0.02;
        double minKommission = 0.5;

        double euro = dollar*kurs;
        double commission = euro * kommission;

        if (commission < minKommission) {
            commission = minKommission;
        }
        double totalEuro = euro - commission;
        System.out.println(dollar + " dollar bliver til " + totalEuro + " euro efter kommission.");
    }
}
