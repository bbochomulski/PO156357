package pl.bartoszjd.bochomulski;

public class Student extends Osoba implements Cloneable, Comparable<Osoba>{

    private double sredniaOcen;

    public Student(String nazwisko, String dataUrodzenia, double sredniaOcen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"["+this.getNazwisko()+", "+this.getDataUrodzenia().toString()+", "+this.sredniaOcen+"]";
    }

    @Override
    public int compareTo(Osoba o) {
        int result = super.compareTo(o);
        double objectAvg = (double) ((Student)o).sredniaOcen;
        if (result == 0){
            if (this.sredniaOcen > objectAvg)
                return 1;
            if (this.sredniaOcen < objectAvg)
                return -1;
        }
        return result;
    }
}
