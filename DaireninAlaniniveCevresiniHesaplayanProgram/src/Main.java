import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        double radius, a;
        final double PI = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the radius : ");
        radius = scanner.nextDouble();

        System.out.println("Please enter the center angle of circle: ");
        a = scanner.nextDouble();

        double areaSector = (PI*(radius*radius) * a) / 360;

        System.out.println("The area of sector is: " + areaSector);
    }
}
