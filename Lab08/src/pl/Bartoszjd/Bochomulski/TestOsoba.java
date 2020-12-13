package pl.bartoszjd.bochomulski;

import java.time.LocalDate;

public class TestOsoba
{
    public static void main(String[] args)
    {
        Osoba[] ludzie = new Osoba[2];

        ludzie[0] = new Pracownik("Kowalski","Jan Janusz", "1998-01-13", 'M', 50000, LocalDate.now());
        ludzie[1] = new Student("Nowak", "Anna Maria", "1998-03-10",'K', "informatyka", 4.25);

        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() +" " + p.getImiona());
            System.out.println("Urodzony: "+ p.getDataUrodzenia());
            if (p instanceof Pracownik)
            {
                System.out.println("Zatrudniony: " + ((Pracownik) p).getDataZatrudnienia());
            }
            if (p instanceof Student)
            {
                System.out.println("Srednia ocen: " + ((Student) p).getSredniaOcen());
            }
            System.out.println(p.getOpis()+"\n");

        }
    }
}


