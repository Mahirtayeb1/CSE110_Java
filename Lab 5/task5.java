// task 5
import java.util.Scanner;
public class task5{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    int wid = sc.nextInt();
    for(int line = 1; line<=len; line++){
      for(int row = 1; row<=wid; row++){
        System.out.print(row);
      }
      System.out.println(" ");
    }
  }
}