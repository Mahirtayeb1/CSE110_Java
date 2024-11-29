import java.util.Scanner;
import java.util.Arrays;
//import java.lang.String;
public class pracArr1{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int [] arr1 = new int [4];
    int [] arr2 = new int [] {11, 12, 13, 14};
    int [] arr3 = {11, 12, 13, 14};
    String [] arr4 = new String [4];
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
    System.out.println(Arrays.toString(arr3));
    System.out.println(Arrays.toString(arr4));
    System.out.println(arr2.length);
    System.out.println(arr2[2]);
  }
}