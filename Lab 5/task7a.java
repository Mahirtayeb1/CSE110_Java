// task 7
import java.util.Scanner;
public class task7a{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //String space = " ";
    for(int line = 1; line<=n; line++){
      for(int row = 1; row<=n-line; row++){
        System.out.print(" ");
      }
      for(int num = 1; num <= (2*line)-1; num++){
        System.out.print(num);
      }
//      for(int ro = n+(n-1); ro>=n+line; ro--){
//        System.out.print("*");
//      }
//      for(int nm = 3;  ){
//        System.out.print(num);
//      }
      System.out.println(" ");
    }
  }
}