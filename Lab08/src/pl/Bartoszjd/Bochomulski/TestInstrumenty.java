package pl.bartoszjd.bochomulski;

import java.util.ArrayList;
public class TestInstrumenty {
    public static void main(String[] args) {

        ArrayList<Instrument> orkiestra = new ArrayList<>();
        orkiestra.add(new Flet("Altus", 1990));
        orkiestra.add(new Fortepian("Yamaha", 1994));
        orkiestra.add(new Skrzypce("Stradivarius", 1984));
        orkiestra.add(new Flet("Miyazawa", 1991));
        orkiestra.add(new Fortepian("Pleyel", 1993));

        for(Instrument p : orkiestra)
            p.dzwiek();

        for(Object instrument: orkiestra)
            System.out.println(instrument);

    }
}
