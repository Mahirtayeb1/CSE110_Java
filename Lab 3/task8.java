// Task 8
import java.util.Scanner;
public class task8{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int dig = (x/100000);
    int year = dig/10;
    int session = dig % 10;
    if(session==1){
      System.out.println("Student Joined BRAC in Spring "+year);
    }
    else if(session==3){
      System.out.println("Student Joined BRAC in Summer "+year);
    }
    else{
      System.out.println("Student Joined BRAC in Fall "+year);
    }
  }
}