import java.util.Scanner;
public class sqPatrn{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in); 
    int n = sc.nextInt();
    for(int row = 1 ; row <= n; row++){
      for(int col = 1; col<=n; col++){
        System.out.print("*");
        //System.out.print(col);
      }
      System.out.println(" ");
    }
  }
}

//import java.util.Scanner;
//public class sqPatrn{
//  public static void main(String [] args){
//    Scanner sc = new Scanner(System.in); 
//    int n = sc.nextInt();
//    for(int row = n ; row >= 1; row--){
//      for(int col = n; col>=1; col--){
//        System.out.print(col);
//      }
//      System.out.println(" ");
//    }
//  }
//}