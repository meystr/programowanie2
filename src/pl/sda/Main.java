package pl.sda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        List<Integer> podanaLiczba = new ArrayList<Integer>();
        int ilosc = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj ilość liczb: ");
        ilosc = sc.nextInt();

        for (int i = 0; i < ilosc; i++) {
            System.out.println("Podaj liczbe: ");
            int next = sc.nextInt();

            if (i == 0 || (next >= lista.get(i-1) )) {
                lista.add(next);
            }
        }
    }

}