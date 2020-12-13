package pl.bartoszjd.bochomulski;

public class Nauczyciel extends Osoba {
    private int pensja;

    public Nauczyciel(String nazwisko, int rokUrodzenia, int pensja) {
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return "Nauczyciel " + super.getNazwisko() +
                " urodzony w " + super.getRokUrodzenia() +
                " roku i zarabiajacy " + pensja + " zl.";
    }

    public int getPensja() {
        return pensja;
    }
}
