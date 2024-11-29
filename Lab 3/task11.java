// Task 11
import java.util.Scanner;
public class task11{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    if(x == y && y == z){
      System.out.println("This is a Equilateral triangle");
    }
    else if(x == y && y != z){
      System.out.println("This is a Isosceles triangle ");
    }
    else if(x != y && y == z){
      System.out.println("This is a Isosceles triangle ");
    }
    else{
      System.out.println("This is a Scalene triangle");
    }
  }
}