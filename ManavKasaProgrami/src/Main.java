import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        final double armut = 2.14,
                    elma = 3.67,
                    domates = 1.11,
                    muz = 0.95,
                    patlıcan = 5.00;

        int kilo, total=0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? :");
        kilo = scanner.nextInt();
        total += kilo * armut;

        System.out.print("Elma Kaç Kilo ? :");
        kilo = scanner.nextInt();
        total += kilo * elma;

        System.out.print("Domates Kaç Kilo ? :");
        kilo = scanner.nextInt();
        total += kilo * domates;

        System.out.print("Muz Kaç Kilo ? :");
        kilo = scanner.nextInt();
        total += kilo * muz;

        System.out.print("Patlıcan Kaç Kilo ? :");
        kilo = scanner.nextInt();
        total += kilo * patlıcan;

        System.out.print("Toplam Tutar : " + total + " TL");



    }
}
