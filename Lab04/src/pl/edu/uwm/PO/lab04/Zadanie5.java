package pl.edu.uwm.PO.lab04;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;


public class Zadanie5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Wprawadz kapital poczatkowy: ");
        double k = s.nextDouble();
        System.out.print("Wprawadz zadeklarowany okres oszczedzania w latach: ");
        int n = s.nextInt();
        System.out.print("Wprowadz wartosc stopy procentowej: ");
        double p = s.nextDouble();

        System.out.printf("Konto: %s", konto(n,k,p).toPlainString());
    }

    public static BigDecimal konto(int n, double k, double p)
    {
        BigDecimal saldo = new BigDecimal(k);
        BigDecimal odsetki = new BigDecimal(p);
        for(int i = 0; i < n; i++){
            saldo = saldo.add(saldo.multiply(odsetki));
        }
        saldo = saldo.setScale(2, RoundingMode.HALF_UP).stripTrailingZeros();
        return saldo;
    }
}
