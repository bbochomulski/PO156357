package pl.edu.uwm.wmii.po.lab00;

public class Zad3 {
    public static void main(String[] args) {
        int iloczyn = 1;
        for(int i = 1;i<=10;i++)
        {
            iloczyn *= i;
        }
        System.out.println("Iloczyn pierwszych 10 liczb całkowitych: " + iloczyn);
    }
}
