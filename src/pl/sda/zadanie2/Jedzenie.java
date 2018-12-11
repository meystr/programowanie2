package pl.sda.zadanie2;

public class Jedzenie {

    TypJedzenia typJedzenia;

    public Jedzenie(TypJedzenia typJedzenia) {
        this.typJedzenia = typJedzenia;
    }

    public enum TypJedzenia {
        ZOLTY_SER("Żółty ser"),
        CHLEB("Chleb"),
        MLEKO("Mleko"),
        WODA("Woda");

        private final String jedzenie;

        TypJedzenia(String jedzenie) {
            this.jedzenie = jedzenie;
        }

        @Override
        public String toString() {
            return jedzenie;
        }
    }

    @Override
    public String toString() {
        return typJedzenia.toString();
    }
}
