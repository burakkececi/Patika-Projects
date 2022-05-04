import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        double a, b, c, u;
        double areaTriangular;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the side lengths of triangle.");

        System.out.print("a = ");
        a = scanner.nextDouble();

        System.out.print("b = ");
        b = scanner.nextDouble();

        System.out.print("c = ");
        c = scanner.nextDouble();

        u = (a+b+c) / 2;
        areaTriangular = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println("Area of Triangular Is : " + areaTriangular);
    }
}
