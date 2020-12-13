package pl.bartoszjd.bochomulski;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> studenci = new ArrayList<>(5);
        studenci.add(new Student("Kowalski", "1990-03-27",3.2));
        studenci.add(new Student("Nowak", "1998-01-13",4.0));
        studenci.add(new Student("Kowalski", "1975-03-27",3.0));
        studenci.add(new Student("Dijkstra", "1985-09-27",3.6));
        studenci.add(new Student("Bochomulski", "1998-01-13",3.8));

        System.out.println("Przed sortowaniem:");
        for (Student s : studenci)
            System.out.println(s);
        Collections.sort(studenci);
        System.out.println("Po sortowaniu:");
        for (Osoba o : studenci)
            System.out.println(o);
    }
}
