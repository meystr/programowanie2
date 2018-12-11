package pl.sda.zadanie2;

public class Ptak extends Zwierze {
    public Ptak(String nazwa) {
        super(nazwa);
    }

    @Override
    public String przedstawSie() {
        return super.przedstawSie();
    }

    @Override
    public String dajGlos() {
        String glos ="Cwir ćwir";
        return glos;
    }

    @Override
    public String zrobTrick() {
        String trick ="ptak - trick.";
        return trick;
    }

    @Override
    public String toString() {
        return "Ptak{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }
}
