// Task 10

import java.util.Scanner;
public class task10{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an Integer: ");
    int n = sc.nextInt();
    int temp=n;  
    //int count = 0;
    while(n>0)  
    {   
      n=n/10;  
      //count++;  
    }  
    while(temp > 0)  
    {   
      int digit = temp%10;  
      System.out.println(digit + ", ");  
      temp=temp/10;  
      //count--;  
    }  
  }
}