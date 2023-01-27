package Donguler;

import java.util.Scanner;

public class KuvvetAlma {
    public static void main(String[] args) {
        int x, y;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kuvveti alınacak sayıyı giriniz : ");
        x = inp.nextInt();

        System.out.print(x + "\'in kaçıncı kuvveti alınacak : ");
        y = inp.nextInt();

        long outp = 1;
        for (int i = 1; i <= y; i++) {
            outp *= x;
        }
        System.out.println("Sonuç = " + outp);
    }
}
