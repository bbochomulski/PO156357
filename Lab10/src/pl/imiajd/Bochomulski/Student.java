package pl.imiajd.Bochomulski;

public class Student extends Osoba implements Cloneable,Comparable<Osoba>{

    private double sredniaOcen;

    public Student(String nazwisko, String dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    @Override
    public int compareTo(Osoba o) {
        int result = super.compareTo(o);
        if (result == 0){
            System.out.println("test");
        }
        return result;
    }
}
