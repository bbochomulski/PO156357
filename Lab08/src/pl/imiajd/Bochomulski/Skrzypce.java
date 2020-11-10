package pl.imiajd.Bochomulski;

public class Skrzypce extends Instrument {
    public Skrzypce(String producent, int rokProdukcji) {
        super(producent, rokProdukcji);
    }

    public void dzwiek()
    {
        System.out.println("*Dzwieki skrzypiec*");
    }
}
