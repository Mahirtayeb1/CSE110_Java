// Task Q2

import java.util.Scanner;
public class taskQ2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an Integer: ");
    int n = sc.nextInt();
    System.out.print(n + " " );
    // int count = 0;
    while(n>1){
      if(n%2==0){
        n /= 2;
        System.out.print(n + " " );
      }
      else{
        n *= 3;
        n += 1;
        System.out.print(n + " " );
      }
    }
    //System.out.println("Total digits = " + count);
  }
}