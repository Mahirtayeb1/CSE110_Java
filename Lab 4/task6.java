// Task 6

import java.util.Scanner;
public class task6{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Input number of terms: ");
    int n = sc.nextInt();
    int count = 1;
    int sum = 0;
    System.out.println("The odd numbers are:");
    for(int i = 0; i < n; i++){
      System.out.println(count);
      sum += count;
      count += 2;
    }
    System.out.println("The Sum of odd Natural Numbers up to " + n + " terms is: " + sum);
  }
}