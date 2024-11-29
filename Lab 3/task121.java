import java.util.Scanner;

public class task121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount the customer needs to pay (Taka): ");
        int amountToPay = sc.nextInt();
        
        System.out.print("Enter the amount the customer gave (Taka): ");
        int amountGiven = sc.nextInt();

        if (amountGiven < amountToPay) {
            System.out.println("Please pay " + (amountToPay - amountGiven) + " taka more.");
        } else {
            int change = amountGiven - amountToPay;
            System.out.println("The returned amount is " + change + " taka.");

            int num100 = change / 100;
            System.out.println("100 taka note: " + num100);
            change %= 100;

            int num50 = change / 50;
            System.out.println("50 taka note: " + num50);
            change %= 50;

            int num20 = change / 20;
            System.out.println("20 taka note: " + num20);
            change %= 20;

            int num10 = change / 10;
            System.out.println("10 taka note: " + num10);
            change %= 10;

            int num5 = change / 5;
            System.out.println("5 taka coin: " + num5);
            change %= 5;

            int num2 = change / 2;
            System.out.println("2 taka coin: " + num2);
            change %= 2;

            int num1 = change;
            System.out.println("1 taka coin: " + num1);
        }
    }
}
