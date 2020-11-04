package pl.imiajd.bochomulski;

public class Adres {
    private String ulica;
    private int numer_domu;
    private int numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;

    public Adres(String ulica, int numer_domu, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = -1;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;

    }

    public Adres(String ulica, int numer_domu, int numer_mieszkania, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public void pokaz(){

        System.out.printf("%s, %s\n", this.kod_pocztowy, this.miasto);
        if(this.numer_mieszkania == -1){
            System.out.printf("%s %d", this.ulica, this.numer_domu);
        }
        else {
            System.out.printf("%s %d/%d", this.ulica, this.numer_domu, this.numer_mieszkania);
        }
    }

    public boolean przed(String kod){
        // funkcja zwraca true jeśli adres podany w zmiennej jest "po" adresie obiektu
        int adres = Integer.parseInt(this.kod_pocztowy.replaceAll("[^0-9.]", ""));
        int adres2 = Integer.parseInt(kod.replaceAll("[^0-9.]", ""));
        return adres > adres2;
    }
}
