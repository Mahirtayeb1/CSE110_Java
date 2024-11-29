// Task 3

import java.util.Scanner;
public class task3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    String oper = sc.next();   // +, -, *, /
    if (oper.equals("+")){
      System.out.println(n1 + n2);    
    }
    else if(oper.equals("-")){
      System.out.println(n1 - n2);
    }
    else if(oper.equals("*")){
      System.out.println(n1 * n2);
    }
    else if(oper.equals("/")){
      System.out.println(n1 / n2);
    }
  }
}