// Task 10
import java.util.Scanner;
public class task10{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    float x = sc.nextFloat();
    float y = sc.nextFloat();
    float z = sc.nextFloat();
    if(x > y && x>z){
      System.out.println("Maximum number is "+ x);
    }
    else if(y > x && y>z){
      System.out.println("Maximum number is "+ y);
    }
    else{
      System.out.println("Maximum number is "+ z);
    }
    
    if(x < y && x<z){
      System.out.println("Minimum number is "+ x);
    }
    else if(y < x && y<z){
      System.out.println("Minimum number is "+ y);
    }
    else{
      System.out.println("Minimum number is "+ z);
    }
    

  }
}