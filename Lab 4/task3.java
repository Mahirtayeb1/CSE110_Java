// Task 3

import java.util.Scanner;
public class task3{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.println("Enter number: ");
      int n = sc.nextInt();
      if(n<0){
        break;
      }
      int res = n*n;
      System.out.println(res);

    }
  }
}