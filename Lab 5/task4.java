//task4
import java.util.Scanner;
public class task4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sum = 0;
            int count = 0;
            while (count < y) {
                if (x % 2 != 0) { 
                    sum += x;
                    count++;
                }
                x++; 
            }
            System.out.println(sum);
        }
    }
}
