// Task 9

import java.util.Scanner;
public class task{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an Integer: ");
    int n = sc.nextInt();
    int count = 0;
    while(n!=0){
      n/=10;            // 434/10 = 43  43/10=4    4/10=0
      count ++;
    }
    System.out.println("Total digits = " + count);
  }
}