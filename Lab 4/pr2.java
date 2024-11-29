import java.util.Scanner;  // printing digits left to r8 of an integer
public class pr2{  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int digit = 0;
    int num = n;
    while(n!=0){
      //System.out.print(a%10);   //   1        2        3       4    X
      n/=10;                     // 4342/10 = 434/10 = 43/10 = 4/10 = 0
      digit++;     
    }
    //System.out.print(n);
    int f;
    while(num>0){
      f = num / (int)Math.pow(10, digit-1);
      System.out.print(f + ", ");
      num%=(int)Math.pow(10, digit-1);
      digit--;
    }
  }
}