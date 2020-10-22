package pl.edu.uwm.PO.lab04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Podaj znak: ");
        char z = s.next().charAt(0);

        System.out.printf("Wynik funkcji count: %d", count("plik.txt", z));
        
    }

    public static int count(String nazwaPliku, char znak)
    {
        int wynik = 0;
        try
        {
            File plik = new File("C:\\Users\\autos\\IdeaProjects\\PO156357\\Lab04\\src\\pl\\edu\\uwm\\PO\\lab04\\" + nazwaPliku);
            Scanner zawartosc = new Scanner(plik);

            while (zawartosc.hasNextLine()) {
                String line = zawartosc.nextLine();
                for(int i = 0; i < line.length();i++)
                {
                    if(line.charAt(i) == znak) {wynik++;}
                }
            }
            zawartosc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie ma takiego pliku");
            e.printStackTrace();
        }
        return wynik;
    }
}
