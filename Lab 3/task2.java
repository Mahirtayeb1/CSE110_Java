// task2

import java.util.Scanner;
public class task2{
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int n1 = sc.nextInt();
//    int n2 = sc.nextInt();
//    int n3 = sc.nextInt();
    if (n1 < 50){
    System.out.println("F grade");
    }
    else if(n1 <= 56){
      System.out.println("D grade");
    }
    else if(n1<= 69){
      System.out.println("C grade");
    }
    else if(n1<= 84){
      System.out.println("B grade");
    }
    else if(n1<= 89){
      System.out.println("A- grade");
    }
    else{
      System.out.println("A grade");
    }
    
  }
    
}
