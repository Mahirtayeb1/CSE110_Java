import java.util.Scanner;
public class methodtry{
  public static void mymethod(int n, String s1){
    System.out.println(n+" mymethod is working "+s1);
  }
  public static void printEvenNum(int [] a1){
    for (int i = 0; i<a1.length;i++){
      if(a1[i]%2==0){
        System.out.println(a1[i]);
      }
    }
  }
  public static void adder1(int n1, int n2){
    int result = n1 + n2;
    System.out.println(result);
  }
  public static int adder2(int n1, int n2){
    int result = n1 + n2;
    return result;
  }
  public static void main(String [] args){
    System.out.println("running main method");
    mymethod(3, "Mahir");
    int [] arr1 = {11, 12, 13, 14, 15, 16};
    printEvenNum(arr1);
    adder1(4,5);
    int ans = adder2(5,5);
    System.out.print(ans);
    //System.out.print(addder2(6,6));
  }
}