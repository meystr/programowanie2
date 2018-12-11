package pl.sda.zadanie2;

public abstract class Zwierze {
    String nazwa;
    private KontenerNaJedzenie kontener;

    public Zwierze(String nazwa) {
        this.nazwa = nazwa;
    }

    abstract public String dajGlos();

    public String przedstawSie() {
        return this.nazwa;
    }

    abstract public String zrobTrick();

    @Override
    public String toString() {
        return "Zwierze{" +
                "nazwa='" + nazwa + '\'' +
                ", kontener=" + kontener +
                '}';
    }
}
