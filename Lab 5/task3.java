//task3
import java.util.Scanner;
public class task3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Number: ");
            int number = sc.nextInt();
            if (number % 2 != 0) {
                break;
            }
            int count = 0;
            for (int i = 1; i<=number; i++) {
                if (number%i == 0) {
                    count++;
                }
            }
            System.out.println(number + " has " + count + " divisors");
        }
    }
}