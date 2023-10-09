package XVII_Eksempler_Fra_ChatGPT;

public class Brik {
    private String farve;
    private int x;
    private int y;

    public Brik(String farve, int x, int y) {
        this.farve = farve;
        this.x = x;
        this.y = y;
    }

    public boolean kanFlytteTil(int xNy, int yNy) {
        return xNy >= 1 && xNy <= 8 && yNy >= 1 && yNy <= 8;
    }
}

class Bonde extends Brik {
    public Bonde(String farve, int x, int y) {
        super(farve, x, y);
    }

    @Override
    public boolean kanFlytteTil(int xNy, int yNy) {
        if (super.kanFlytteTil(xNy, yNy)) {
            // Tilføj logik for, hvordan en bonde kan flytte her
            // Eksempelvis kan en bonde flytte én trin fremad
            // eller to trin fremad på sin første tur.
            return true; // Implementer logikken her
        }
        return false;
    }
}

class Taarn extends Brik {
    public Taarn(String farve, int x, int y) {
        super(farve, x, y);
    }

    @Override
    public boolean kanFlytteTil(int xNy, int yNy) {
        if (super.kanFlytteTil(xNy, yNy)) {
            // Tilføj logik for, hvordan en tårn kan flytte her
            // Eksempelvis kan en tårn flytte vandret eller lodret
            return true; // Implementer logikken her
        }
        return false;
    }
}