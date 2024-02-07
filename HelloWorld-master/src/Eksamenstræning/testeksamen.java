package Eksamenstræning;

public class testeksamen {
}
//Lav en klasse der indeholder filmName, width og height
class Image{
    String filmName;
    int width;
    int height;

    //Lav
    public boolean test() {
        boolean tjek=false;
        if(filmName.contains(".gif")) {
            tjek=true;
        }
        if(filmName.contains(".jpeg")) {
            tjek=true;
        }
        if(filmName.endsWith(".png")) {
            tjek=true;
        }
        return tjek;
    }
    public boolean test2() {
        boolean tjek = false;
        if (height > width) {
            tjek=true;
        }
        return tjek;
    }

}

