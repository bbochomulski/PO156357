package pl.edu.uwm.obiektowe.s156357.kolo1;

public class Pracownik extends Osoba{
    private String stanowisko;
    private double pensja;

    public Pracownik(){
        super("","","");
    }
    public Pracownik(Osoba o, String stanowisko, double pensja){
        super(o.getImie(), o.getNazwisko(), o.getDataUrodzenia());
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    public double getPensja() {
        return pensja;
    }

    @Override
    public String toString() {
        return super.toString() + "Jest pracownikiem na stanowisku "+this.stanowisko+" z pensją "+ String.format("%.2f", this.pensja) +" zł";
    }
}
