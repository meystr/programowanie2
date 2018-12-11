package pl.sda.zadanie2;

import java.util.ArrayList;
import java.util.List;

public class Osoba {

    private String imie;
    private List<Zwierze> listaZwierzat = new ArrayList<>();
    private Jedzenie.TypJedzenia lodowka;

    public Osoba(String imie) {
        this.imie = imie;
    }

    public void nakarm() {

    }

    public void dodajDoLodowki(Jedzenie.TypJedzenia lodowka) {
        this.lodowka = lodowka;
    }

    public void dodajZwierze(Zwierze zwierzeDoDodania) {
        listaZwierzat.add(zwierzeDoDodania);
    }

    public String przedstawSie() {

        return "Nazywam się: " + imie + " mam zwierzęta: " + listaZwierzat.toString() + " w lodówce mam: " + lodowka.toString();
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", listaZwierząt=" + listaZwierzat +
                ", lodówka=" + lodowka +
                '}';
    }
}
