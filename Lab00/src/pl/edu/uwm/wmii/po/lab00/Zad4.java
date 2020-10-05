package pl.edu.uwm.wmii.po.lab00;

public class Zad4 {
    public static void main(String[] args) {
        float saldo = 100;
        for(int i = 1;i<=3;i++)
        {
            saldo *= 1.06;
            System.out.println("Saldo po " + i + " roku: "+ saldo);
        }

    }
}
