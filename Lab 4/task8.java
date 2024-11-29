// Task 8

import java.util.Scanner;
public class task8{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //int sum = 0;
    for(int i = 0; i <= n; i++){
      //System.out.println("Enter number: ");
      if(i%5==0 && i%3!=0){
        System.out.println(i);
      }

    }
  }
}