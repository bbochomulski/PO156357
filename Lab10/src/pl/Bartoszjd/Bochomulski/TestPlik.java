package pl.bartoszjd.bochomulski;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestPlik {
    public static void main(String[] args) {

            ArrayList<String> zawartosc = new ArrayList<>();
            Scanner s = new Scanner(System.in);
            while (s.hasNextLine())
                zawartosc.add(s.nextLine());
            s.close();

            System.out.println("Przed sortowaniem:");
            for (String linia: zawartosc)
                System.out.println(linia);
            Collections.sort(zawartosc);
            System.out.println("Po sortowaniu:");
            for (String linia: zawartosc)
                System.out.println(linia);
        }
    }

