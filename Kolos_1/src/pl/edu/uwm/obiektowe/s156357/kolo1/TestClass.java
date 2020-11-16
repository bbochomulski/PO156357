package pl.edu.uwm.obiektowe.s156357.kolo1;

import java.util.ArrayList;

public class TestClass {
    public static void main(String[] args) {
        ArrayList<Osoba> kolekcja = new ArrayList<>();
        Osoba o1 = new Osoba("Bartosz", "Bochomulski", "1998-01-13");
        Osoba o2 = new Osoba("Ryan", "Reynolds", "1978-01-03");
        Osoba o3 = new Osoba("Jan", "Kowalski", "1990-01-28");
        Osoba o4 = new Osoba("Michal", "Nowak", "1995-11-13");
        Osoba o5 = new Osoba("Kacper", "Dawid", "1998-12-13");
        Osoba o6 = new Osoba("Anna", "Krakowska", "1997-05-13");

        o1 = new Pracownik(o1, "informatyk", 4500.1234);
        o2 = new Pracownik(o2, "recepcjonista", 2500.123);
        o3 = new Pracownik(o3, "wozny", 2500.321);

        kolekcja.add(o1);
        kolekcja.add(o2);
        kolekcja.add(o3);
        kolekcja.add(o4);
        kolekcja.add(o5);
        kolekcja.add(o6);

        for(Osoba o : kolekcja)
            System.out.println(o.toString());

        double suma = 0;
        for(Osoba o : kolekcja){
            if(o.getClass() == Pracownik.class)
                suma += ((Pracownik) o).getPensja();
        }
        System.out.println("Suma pensji pracowników: " + suma);



    }
}
