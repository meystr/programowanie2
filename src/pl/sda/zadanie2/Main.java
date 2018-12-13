package pl.sda.zadanie2;

public class Main {
    public static void main(String[] args) {

        Osoba remek = new Osoba("Remek");

        Pies pies = new Pies("Burek");
        Ptak ptak = new Ptak("Cwirek");
        Kot kot = new Kot("Fifi");

        remek.dodajZwierze(pies);
        remek.dodajZwierze(ptak);
        remek.dodajZwierze(kot);

        KontenerNaJedzenie lodowka = new KontenerNaJedzenie();
   /*     lodowka.dodaj(Jedzenie.TypJedzenia.CHLEB);
        lodowka.dodaj(Jedzenie.TypJedzenia.ZOLTY_SER);
        lodowka.dodaj(Jedzenie.TypJedzenia.MLEKO);
        lodowka.dodaj(Jedzenie.TypJedzenia.WODA);*/

        remek.dodajDoLodowki(Jedzenie.TypJedzenia.ZOLTY_SER);
        remek.dodajDoLodowki(Jedzenie.TypJedzenia.WODA);
        remek.dodajDoLodowki(Jedzenie.TypJedzenia.MLEKO);

        System.out.println(remek.przedstawSie());


/*
        Thread thread = new Thread();
        new MyThread().start();
        for (int i = 11; i < 20; i++) {
            System.out.println(i);
        }
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println(i);

                }
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();
        try {
            thread1.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/

    }
}
