import java.util.Scanner;
import java.util.Arrays;
//import java.lang.String;
public class task5{
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
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    boolean flag = false;
    for(int i = 0; i<arr1.length; i++){
      if(arr1[i] == num){
        System.out.println(num + " is at index " + i);
        flag = true;
        break;
      }
    }
    if(!flag){
      System.out.println("Element not found ");
    }

  }
}