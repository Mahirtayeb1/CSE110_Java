// Task 4

import java.util.Scanner;
public class task4{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Divisor of "+ n+ " : ");
    for(int i= 1; i<=n; i++){
      if(n%i==0){
        System.out.println(i);
      }
    }
  }
}