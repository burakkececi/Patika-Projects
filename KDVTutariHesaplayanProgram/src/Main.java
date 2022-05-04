import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        double amount=0 , totalAmount=0, kdvRateLess1000=0.18, kdvRateHigher1000=0.8;

        Scanner scanner = new Scanner(System.in);

        boolean flag = false;
        while (!flag){
            System.out.println("Tutarı giriniz: ");
            amount = scanner.nextDouble();
            if(amount >= 0)
                flag = true;
            else
                System.out.println("Hatalı tuşlama yaptınız! \n");
        }

        double kdvAmount;

        if(amount <=1000)
            kdvAmount = amount * kdvRateLess1000;
        else
            kdvAmount = amount * kdvRateHigher1000;

        totalAmount = amount + kdvAmount;

        System.out.printf("KDV'siz Fiyat = %.1f; \n" +
                          "KDV'li Fiyat = %.1f; \n" +
                          "KDV Tutarı = %.1f;", amount, totalAmount, kdvAmount);



    }
}
