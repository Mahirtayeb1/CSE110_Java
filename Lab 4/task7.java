// Task 7

import java.util.Scanner;
public class task7{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    for(int i = 1; i <= 10; i++){
      System.out.println("Enter number: ");
      int n = sc.nextInt();
      sum += n;
      System.out.println("Sum= "+sum);
     
    }
  }
}