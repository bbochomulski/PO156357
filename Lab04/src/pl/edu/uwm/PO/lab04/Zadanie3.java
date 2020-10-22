package pl.edu.uwm.PO.lab04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Podaj wyraz: ");
        String str = s.next();

        System.out.printf("Wynik funkcji count: %d", count("plik.txt", str));

    }

    public static int count(String nazwaPliku, String str)
    {
        int wynik = 0;
        try
        {
            File plik = new File("C:\\Users\\autos\\IdeaProjects\\PO156357\\Lab04\\src\\pl\\edu\\uwm\\PO\\lab04\\" + nazwaPliku);
            Scanner zawartosc = new Scanner(plik);

            while (zawartosc.hasNextLine()) {
                String line = zawartosc.nextLine();
                for(int i = 0; i < line.length()-str.length();i++)
                {
                    if(line.charAt(i) == str.charAt(0))
                    {
                        boolean check = true;
                        for(int j = 1; j < str.length();j++)
                        {
                            if(line.charAt(i+j) != str.charAt(j))
                            {
                                check = false;
                                break;
                            }
                        }
                        if(check)
                        {
                            wynik++;
                        }
                    }
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
