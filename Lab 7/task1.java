import java.util.Scanner;
import java.util.Arrays;
//import java.lang.String;
public class task1{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int [] arr1 = new int [size];    
    for(int i = 0; i<arr1.length; i++){
      System.out.println("Enter a number: ");
      int ele = sc.nextInt();
      arr1[i] = ele;
    } 
    System.out.println(Arrays.toString(arr1));
    System.out.println("The elements of the array are: ");
    for(int i = 0; i<arr1.length; i++){
      System.out.println(i + " : " + arr1[i]);
    }
    int [] resizeArr = new int [size+1];
    for(int i = 0; i<arr1.length; i++){
      resizeArr[i] = arr1[i];
    }
    System.out.println("Enter a new number: ");
    int newelement = sc.nextInt();
    resizeArr[size] = newelement;
    System.out.println(Arrays.toString(resizeArr));

  }
}