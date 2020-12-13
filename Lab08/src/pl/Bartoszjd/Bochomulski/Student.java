package pl.bartoszjd.bochomulski;

class Student extends Osoba {
    public Student(String nazwisko, String imiona, String dataUrodzenia, char plec, String kierunek, double sredniaOcen) {
        super(nazwisko, imiona, dataUrodzenia, plec);
        this.kierunek = kierunek;
        this.sredniaOcen = sredniaOcen;
    }

    public String getOpis() {
        return "kierunek studiów: " + kierunek;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    private String kierunek;
    private double sredniaOcen;
}
