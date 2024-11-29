// Task 11

import java.util.Scanner;
public class task11{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an Integer: ");
    int n = sc.nextInt();
    int count = 0;
    for(int i = 1; i<=n; i++){
      if(n%i==0){
        count++;
      }
    }
    if(count == 2){
      System.out.print(n + " is a prime number");
    }
    else{
      System.out.println(n + " is not a prime number");
    }
    int sum = 0;
    for(int i = 1; i<n; i++){
      if(n%i==0){
        sum = sum + i;           // 6 -> 1 + 2 + 3 (i<n)
      }
    }
    if(sum==n){
      System.out.print(n + " is a perfect number");
    }
    else{
      System.out.print(n + " is not a perfect number");
    }
  }
}