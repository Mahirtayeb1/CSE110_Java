import java.util.Scanner;
import java.util.Arrays;
//import java.lang.String;
public class task6{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    double [] arr1 = new double [size];    
    for(int i = 0; i<arr1.length; i++){
      System.out.println("Enter a number: ");
      double ele = sc.nextDouble();
      arr1[i] = ele;
    } 
    System.out.println(Arrays.toString(arr1));
    double sum = 0;
    double max = arr1[0];
    double min = arr1[0];
    for(int i = 0; i<arr1.length; i++){
      if(arr1[i]>max){
        max = arr1[i];
      }
      if(arr1[i]<min){
        min = arr1[i];
      }
      sum+=arr1[i];
    }
    double avg = sum/size;
    int minIndx = 0;
    int maxIndx = 0;
    for(int i = 0; i<arr1.length; i++){
      if(arr1[i] == min){
        minIndx = i;
      }
      if(arr1[i] == max){
        maxIndx = i;
      }
    }
    System.out.println("Maximum element " + max + " found at index " + maxIndx);
    System.out.println("Minimum element " + min + " found at index " + minIndx);
    System.out.println("Summation: " + sum);
    System.out.println("Average: " + avg);
  }
}