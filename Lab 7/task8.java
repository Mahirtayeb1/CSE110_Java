import java.util.Scanner;
import java.util.Arrays;
//import java.lang.String;
public class task8{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    //int size = sc.nextInt();
    System.out.println("Please enter the length of array 1: ");
    int size = sc.nextInt();
    int [] arr1 = new int [size]; 
    System.out.println("Please enter the elements of the arr1:");
    for(int i = 0; i<arr1.length; i++){
      int ele = sc.nextInt();
      arr1[i] = ele;
    }
    System.out.println("Please enter the length of array 2: ");
    int siz = sc.nextInt();
    int [] arr2 = new int [siz]; 
    System.out.println("Please enter the elements of the arr2:");
    for(int i = 0; i<arr2.length; i++){
      int ele = sc.nextInt();
      arr2[i] = ele;
    }
    boolean Subset = true;

    for(int i = 0; i < arr2.length; i++){
      boolean found = false;
      for(int j = 0; j < arr1.length; j++){
        if(arr2[i] == arr1[j]){
           found = true;
           break;
        }
      }
      if(!found){
        Subset = false;
        break;
      }
    }
    if(Subset){
      System.out.println("Array 2 is a subset of Array 1.");
    } 
    else{
      System.out.println("Array 2 is not a subset of Array 1.");
    }
  }
}