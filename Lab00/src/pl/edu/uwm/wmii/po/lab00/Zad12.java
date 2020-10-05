package pl.edu.uwm.wmii.po.lab00;

public class Zad12 {
    public static void main(String[] args) {

        for(int i = 0;i<15;i++){
            for(int j = 0;j<60;j++)
            {
                if(i<=7 && j<=25) {System.out.print("*");}
                else System.out.print("-");
                if(j==59) {System.out.println();
                }
            }
        }

    }
}
