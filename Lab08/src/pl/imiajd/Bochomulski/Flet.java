package pl.imiajd.Bochomulski;

public class Flet extends Instrument {
    public Flet(String producent, int rokProdukcji) {
        super(producent, rokProdukcji);
    }

    public void dzwiek()
    {
        System.out.println("*Dzwieki fletu*");
    }
}
