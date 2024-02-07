package Eksamenstræning;
//lav en klasse med filmName, width og height
//
public class ImageTeacher {
    String filmName;
    int width;
    int height;

    public boolean test() {
        if(filmName.endsWith(".png")) return true;
        if(filmName.endsWith(".jpeg")) return true;
        if(filmName.endsWith(".gif")) return true;
        if(filmName.endsWith(".")) return true;
        return false;
    }
    public boolean isPortrait() {
        return height<width;
    }
}
