import java.util.Scanner;
import java.util.Arrays;
//import java.lang.String;
public class task3a{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the array: ");
    int size = sc.nextInt();
    int [] arr1 = new int [size];    
    for(int i = 0; i<arr1.length; i++){
      System.out.println("Enter a number: ");
      int ele = sc.nextInt();
      arr1[i] = ele;
    }     
    // Reversed using a new array (out of place)
    int [] revArr = new int [size];
    for(int i = 0; i<arr1.length; i++){
      revArr[i] = arr1[arr1.length-1-i];
    }
    System.out.println("Reversed using a new array: ");
    System.out.println(Arrays.toString(revArr));
    
    // reverse array (In place)
    int j = arr1.length-1;
    for(int i = 0; i<arr1.length/2; i++){
      int temp = arr1[i];
      arr1[i] = arr1[j];
      arr1[j] = temp;
      j--;
    }
    System.out.println("Reversed the original array: ");
    System.out.println(Arrays.toString(revArr));
  }
}