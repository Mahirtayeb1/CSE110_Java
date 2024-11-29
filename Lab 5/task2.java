//task2
import java.util.Scanner;

public class task2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The value of N: ");
        int N = sc.nextInt();
        int y = 0;
        for(int i = 1; i <= N; i++) {
            int sum = 0;
            for(int j = 1; j <= i; j++) {
               sum += j;
            }
            y -= sum; 
        }
        System.out.println("The value of y: " + y);
    }
}