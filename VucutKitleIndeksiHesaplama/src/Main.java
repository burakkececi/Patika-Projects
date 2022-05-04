import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        double kilo, boy;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz  : ");
        kilo = scanner.nextDouble();

        System.out.print("Vücut Kitle İndeksiniz : " + (kilo * boy * boy));
    }
}
