import java.util.Scanner;  
////import java.util.InputMismatchException;
public class pr4{  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //int n = sc.nextInt();
    //float m = sc.nextFloat();
    double x1 = sc.nextDouble();
    double x2= sc.nextDouble();
    double y1 = sc.nextDouble();
    double y2 = sc.nextDouble();
//    double avgC = n/m;
////    double x2x1 = x2 - x1;
////    double y2y1 = y2 - y1;
////    double a = x2x1 * x2x1;
////    double b = y2y1 * y2y1;
////    double res = a+b;
    double dist = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
//    System.out.print(avgC+" km/l");
    System.out.print(dist+" km");
  }
}