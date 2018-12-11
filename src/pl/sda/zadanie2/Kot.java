package pl.sda.zadanie2;

public class Kot extends Zwierze{

    public Kot(String nazwa) {
        super(nazwa);
    }
    @Override
    public String przedstawSie() {
        return super.przedstawSie();
    }

    @Override
    public String dajGlos() {
        String glos="Miał Miał";
        return glos;
    }

    @Override
    public String zrobTrick() {
        String trick = "kot - trick";
        return trick;
    }

    @Override
    public String toString() {
        return "Kot{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }
}
