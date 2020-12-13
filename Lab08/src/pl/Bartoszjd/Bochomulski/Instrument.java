package pl.bartoszjd.bochomulski;

import java.time.LocalDate;
import java.util.Objects;

abstract class Instrument {
    private final String producent;
    private final LocalDate rokProdukcji;

    public Instrument(String producent, int rokProdukcji)
    {
        this.producent = producent;
        String data = rokProdukcji + "-01-01";
        this.rokProdukcji = LocalDate.parse(data);
    }

    public abstract void dzwiek();

    public String getProducent() {
        return producent;
    }

    public int getRokProdukcji() {
        return rokProdukcji.getYear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrument that = (Instrument) o;
        return Objects.equals(producent, that.producent) &&
                Objects.equals(rokProdukcji, that.rokProdukcji);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": Instrument wyprodukowany przez " + producent + " w " + getRokProdukcji() + " roku.";
    }
}
