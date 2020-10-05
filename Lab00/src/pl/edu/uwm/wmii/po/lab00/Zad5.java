package pl.edu.uwm.wmii.po.lab00;

public class Zad5 {
    public static void main(String[] args) {
        String wyraz = "Bochomulski";
        linia(wyraz.length());
        System.out.println("| "+ wyraz +" |");
        linia(wyraz.length());

    }
    static void linia(int dlugosc){
        System.out.print("+-");
        for(int i = 0;i<dlugosc;i++) {System.out.print("-");}
        System.out.println("-+");
    }
}