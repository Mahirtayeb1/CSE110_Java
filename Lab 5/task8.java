import java.util.Scanner;

public class task8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Start: ");
        int start = sc.nextInt();
        System.out.print("End: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers: ");
        for (int num = start; num <= end; num++) {
            int number = num;
            int orgNumber = number;
            int sum = 0;
            int numOfDigits = Integer.toString(number).length();
            while (number > 0) {
                int digit = number % 10;
                sum += Math.pow(digit, numOfDigits);
                number /= 10;
            }
            if (sum == orgNumber) {
                System.out.println(orgNumber);
            }
        }
    }
}