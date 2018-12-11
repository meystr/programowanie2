package pl.sda.zadanie2;


public class Pies extends Zwierze {


    public Pies(String nazwa) {
        super(nazwa);
    }

    @Override
    public String przedstawSie() {
        return super.przedstawSie();
    }

    @Override
    public String dajGlos() {
        String glosPsa = "Whou Whou!";
        return glosPsa;
    }

    @Override
    public String zrobTrick() {
        String trick = "pies - trick";
        return trick;

    }

    @Override
    public String toString() {
        return "Pies{" +
                "nazwa='" + nazwa + '\'' +
                '}';
    }
}
