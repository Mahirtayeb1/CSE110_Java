//task4

import java.util.Scanner;
public class task4{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int n1 = sc.nextInt();
    //string oper = sc.next();
    //int n3 = sc.nextInt();
    if (n1 % 5==0 && n1 % 7==0){
      System.out.println("Divisible by both");
    
    }
    else{
      if (n1%5==0){
        System.out.println("Invalid: Divisible by 5 Only");
      }
      else if(n1%7==0){
        System.out.println("Invalid: Divisible by 7 Only");
      }
      else{
        System.out.println("No");
      }
    }
    
  }
    
}