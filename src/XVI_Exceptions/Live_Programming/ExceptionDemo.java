package XVI_Exceptions.Live_Programming;

public class ExceptionDemo {
    public static void main(String[] args) {
        Klippekort k1=new Klippekort("A123");
        System.out.println(k1);

        while (true){
            System.out.println(k1);
            try {
                k1.klip();
            } catch (KlippekortException ex){
                ex.printStackTrace();
                System.out.println(ex);
                break;
            }
        }
        System.out.println("Tak for idag");
    }
}

class Klippekort {
    int antalKlip=10;        // Resterende antal klip tilbage på kortet
    String id;

    Klippekort(String id){
        this.id=id;
    }

    void klip() throws KlippekortException {
        if (antalKlip==0) throw new KlippekortException(id);
        antalKlip--;
    }

    @Override
    public String toString() {
        return "Klippekort "+id+" antalKlip="+antalKlip;
    }
}

class KlippekortException extends Exception {
    String id;

    KlippekortException(String id){
        this.id=id;
    }

    @Override
    public String toString() {
        return "KlippekortException for kort "+id;
    }
}