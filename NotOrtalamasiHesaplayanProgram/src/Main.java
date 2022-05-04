import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int math, physic, chem, turkish, hist, music;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");
        math = scanner.nextInt();

        System.out.println("Fizik Notunuz: ");
        physic = scanner.nextInt();

        System.out.println("Kimya Notunuz: ");
        chem = scanner.nextInt();

        System.out.println("Türkçe Notunuz: ");
        turkish = scanner.nextInt();

        System.out.println("Tarih Notunuz: ");
        hist = scanner.nextInt();

        System.out.println("Müzik Notunuz: ");
        music = scanner.nextInt();

        int total = math + physic + chem + turkish + hist + music;
        float average = total / 6;

        System.out.println(average >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");


    }
}
