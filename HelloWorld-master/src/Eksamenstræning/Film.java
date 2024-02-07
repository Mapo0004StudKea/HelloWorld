package Eksamenstræning;

import java.util.Calendar;
import java.util.Date;

public class Film {
    String filmTitel;
    int udgivelsesår;
    Producer producer;

    public Film(String filmTitel,int udgivelsesår) {
        this.filmTitel=filmTitel;
        this.udgivelsesår=udgivelsesår;
    }

    public Film(String filmTitel) {
        this.filmTitel=filmTitel;
        this.udgivelsesår = Calendar.getInstance().get(Calendar.YEAR);
    }

    public void kobleProducer(Producer producer) {
        this.producer = producer;
    }

    public int getUdgivelsesår() {
        return udgivelsesår;
    }

    public String getFilmTitel() {
        return filmTitel;
    }

    public Producer getProducer() {
        return producer;
    }
    public static void main(String[] args) {
        Film film1 = new Film("Inception", 2010);
        Film film2 = new Film("The Dark Knight");

        Producer producer1 = new Producer("Christopher Nolan");
        Producer producer2 = new Producer("Some Other Producer");

        film1.kobleProducer(producer1);
        film2.kobleProducer(producer2);

        System.out.println("Film 1:");
        System.out.println("Title: " + film1.getFilmTitel());
        System.out.println("Release Year: " + film1.getUdgivelsesår());
        System.out.println("Producer: " + film1.getProducer().getProducerName());

        System.out.println();

        System.out.println("Film 2:");
        System.out.println("Title: " + film2.getFilmTitel());
        System.out.println("Release Year: " + film2.getUdgivelsesår());
        System.out.println("Producer: " + (film2.getProducer() != null ? film2.getProducer().getProducerName() : "Unknown"));
    }
}

class Producer {
    String producerName;

   public Producer(String producerName) {
        this.producerName=producerName;
    }

    public String getProducerName() {
        return producerName;
    }
}