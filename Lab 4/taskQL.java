// Task 9

import java.util.Scanner;
public class taskQL{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an Integer: ");
    int n = sc.nextInt();
    //int count = 0;
    while(n!=0){
      System.out.print(n%10);
      n/=10;            
    }
    //System.out.println("Total digits = " + count);
  }
}