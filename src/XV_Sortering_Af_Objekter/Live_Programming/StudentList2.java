package XV_Sortering_Af_Objekter.Live_Programming;

import java.io.*;
import java.util.ArrayList;

public class StudentList2 {
    public static void main(String[] args) throws IOException {
        FileReader fil = new FileReader("src\\XV_Sortering_Af_Objekter\\Live_Programming\\StudentList.txt");
        BufferedReader ind = new BufferedReader(fil);

        ArrayList<Student> list=new ArrayList<Student>();
        String linje = ind.readLine();
        while (linje != null)
        {
            String[] bidder = linje.split(",");
            Student s = new Student();
            s.id = bidder[0].substring(0,8);
            s.fornavn = bidder[1];
            s.efternavn = bidder[2];
            list.add(s);
            linje = ind.readLine();
        }
        fil.close();
       list.sort(null);
        for (Student s: list){
            System.out.println(s);
        }
      saveList(list);
    } // main

    static void saveList(ArrayList<Student> l) throws IOException {
        FileWriter fil = new FileWriter("src\\XV_Sortering_Af_Objekter\\Live_Programming\\StudentListSorted.txt");
        PrintWriter ud = new PrintWriter(fil);
        for (Student s: l){
            ud.println(s);
        }
        fil.close();
    }
}

class Student implements Comparable<Student>{
    String fornavn;
    String efternavn;
    String id;

    @Override
    public String toString() {
        return id+" "+fornavn+" "+efternavn;
    }

    @Override
    public int compareTo(Student o) {
        return id.compareTo(o.id);
    }
}