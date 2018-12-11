package pl.sda.zadanie2;

public class MyThread extends Thread {


    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            System.out.println(i);
        }
    }
}


/*    @Override
    public void run() {
        super.run();
        //System.out.println("Mój pierwszy wątek");
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
    }*/
