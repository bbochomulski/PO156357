package pl.edu.uwm.PO.lab01;

import java.util.Scanner;

public class Zadanie2_3 {

    public Zadanie2_3() {
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj liczbe n: ");
        int n = s.nextInt();

        int dodatnie = 0;
        int ujemne = 0;
        int zera = 0;

        for (int i = 1; i <= n; i++) {
            System.out.printf("Liczba %d: ", i);
            float liczba = s.nextFloat();

            if (liczba > 0) {
                dodatnie += 1;
            }
            if (liczba == 0) {
                zera += 1;
            }
            if (liczba < 0) {
                ujemne += 1;
            }
        }
        System.out.printf("Dodatnich: %d\nUjemnych: %d\nZer: %d", dodatnie, ujemne, zera);
    }
}
