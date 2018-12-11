package pl.sda.zadanie2;

import java.util.ArrayList;
import java.util.List;

public class KontenerNaJedzenie {

    private List<Jedzenie.TypJedzenia> listaJedzenia = new ArrayList<>();

    public void dodaj(Jedzenie.TypJedzenia jedzenie) {
        listaJedzenia.add(jedzenie);
    }

    public void usun(Jedzenie.TypJedzenia jedzenie) {
        listaJedzenia.remove(jedzenie);
    }

    boolean czyJest(Jedzenie.TypJedzenia jedzenie) {
        if (listaJedzenia.size() > 0) {
            return true;
        }
        return false;
    }

    boolean czyPusty() {
        if (listaJedzenia.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "KontenerNaJedzenie{" +
                "listaJedzenia=" + listaJedzenia +
                '}';
    }

}
