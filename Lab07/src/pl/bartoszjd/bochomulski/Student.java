package pl.bartoszjd.bochomulski;

public class Student extends Osoba {
    private String kierunek;

    public Student(String nazwisko, int rokUrodzenia, String kierunek) {
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;
    }

    @Override
    public String toString() {
        return "Uczen " + super.getNazwisko() +
                " urodzony w " + super.getRokUrodzenia() +
                " roku na kierunku " + kierunek;
    }

    public String getKierunek() {
        return kierunek;
    }
}
