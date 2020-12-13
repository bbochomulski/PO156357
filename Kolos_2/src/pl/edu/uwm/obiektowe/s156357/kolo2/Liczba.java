package pl.edu.uwm.obiektowe.s156357.kolo2;

public class Liczba<T> implements Comparable<Liczba<T>>{
    private Number value;

    public Liczba(T value) {
        this.value = (Number) value;
    }

    public Number getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.value.toString();
    }

    @Override
    public int compareTo(Liczba<T> o) {
        Double self = value.doubleValue();
        Double obj = o.getValue().doubleValue();
        return self.compareTo(obj);
    }
}
