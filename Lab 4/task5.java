// Task 5

import java.util.Scanner;
public class task5{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an Integer: ");
    int n = sc.nextInt();
    for(int i = 1; i<=n; i++ ){
      System.out.print("Enter number " + i + " :");
      int g = sc.nextInt();
      if(g>=0){
        System.out.println(i + " is a Non-negative Integer");
      }
      else{
        System.out.println(i + " is a negative Integer");
      }
    }
  }
}