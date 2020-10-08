package pl.edu.uwm.PO.lab01;

import java.util.Scanner;

public class Zadanie2_5 {

    public Zadanie2_5() {
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj liczbe n: ");
        int n = s.nextInt();

        int pary = 0;
        float poprzednia = -1;

        for (int i = 1; i <= n; i++) {
            System.out.printf("Liczba %d: ", i);
            float liczba = s.nextFloat();
            if(poprzednia>0 && liczba>0) {pary += 1;}
            poprzednia = liczba;
        }
        System.out.printf("Ilosc par: %d",pary);
    }
}
