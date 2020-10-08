package pl.edu.uwm.PO.lab01;

import java.util.Scanner;

public class Zadanie2_4 {

    public Zadanie2_4() {
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj liczbe n: ");
        int n = s.nextInt();

        float max = 0;
        float min = 0;

        for (int i = 1; i <= n; i++) {
            System.out.printf("Liczba %d: ", i);
            float liczba = s.nextFloat();

            if (liczba < min) {
                min = liczba;
            }
            if (liczba > max) {
                max = liczba;
            }
        }
        System.out.printf("Max: %f\nMin: %f",max,min);
    }
}
