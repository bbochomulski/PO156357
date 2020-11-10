package pl.imiajd.Bochomulski;

public class Fortepian extends Instrument {
    public Fortepian(String producent, int rokProdukcji) {
        super(producent, rokProdukcji);
    }

    public void dzwiek()
    {
        System.out.println("*Dzwieki fortepianu*");
    }
}
