// task 6
import java.util.Scanner;
public class task6{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //String space = " ";
    for(int line = 1; line<=n; line++){
      for(int row = 1; row<=n-line; row++){
        System.out.print(" ");
      }
      for(int num = 1; num <= line; num++){
        System.out.print(num);
      }
      System.out.println(" ");
    }
  }
}