// task 1
import java.util.Scanner;
public class task1{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    for(int i = 2; count < n;i++){
      //System.out.print(i);
      int c = 0;
      for(int j = 1; j<=i; j++){
        if(i%j==0){
        c ++;
        }
      }
      if(c<=2){
          System.out.println(i);
          count ++;
        }
      //count ++;
    }
  }
}