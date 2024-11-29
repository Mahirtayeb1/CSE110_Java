// Task 6
import java.util.Scanner;
public class task6{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    if(n1>0){
      if(n1%2==0){
        System.out.println("Number is Positive and even ");
      }
      else{
        System.out.println("Number is Positive and odd ");
      }
    }  
    else if(n1<0){
      System.out.println("Number is negative");
    }
    else{
      System.out.println("Number is Zero");
    }
  }
}