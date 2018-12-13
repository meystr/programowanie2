package pl.sda.zadanie2;

import java.util.ArrayList;
import java.util.List;

public class Osoba {

    private String imie;
    private List<Zwierze> listaZwierzat = new ArrayList<>();
    private List<Jedzenie.TypJedzenia> listaJedzenia = new ArrayList<>();
    private KontenerNaJedzenie glod;

    public Osoba(String imie) {
        this.imie = imie;
    }

    public void nakarm() {

    }

    public void dodajDoLodowki(Jedzenie.TypJedzenia lodowka) {
        listaJedzenia.add(lodowka);

    }

    public void dodajZwierze(Zwierze zwierzeDoDodania) {
        listaZwierzat.add(zwierzeDoDodania);
    }

    public String przedstawSie() {

        return "Nazywam się: " + imie + " mam zwierzęta: " + listaZwierzat.toString() + " w lodówce mam: " + listaJedzenia.toString();
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie ='" + imie + " ," + ", listaZwierząt=" + listaZwierzat +
                ", lodówka=" + listaJedzenia +
                '}';
    }
}
