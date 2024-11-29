// Task 9
import java.util.Scanner;
public class task9{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double pay = sc.nextDouble();
    int age = sc.nextInt();

    if(age<18){
      System.out.println("Your Tax amounts in 0 Tk");
    }
    else{
      if(pay<10000){
        System.out.println("Your Tax amounts in 0 Tk");
      }
      else if(pay>=10000 && pay<=20000){
        double tax = (pay * 0.05);
        System.out.println("Your Tax amounts in "+ tax + " Tk");
      }
      else{
        double tax = (pay * 0.10);
        System.out.println("Your Tax amounts in "+ tax + " Tk");
      }
    }
  }
}