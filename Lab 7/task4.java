import java.util.Scanner;
import java.util.Arrays;
//import java.lang.String;
public class task4{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("N= ");
    int size = sc.nextInt();
    int [] arr1 = new int [size];    
    for(int i = 0; i<arr1.length; i++){
      int ele = sc.nextInt();
      arr1[i] = ele;
    } 
    System.out.println("Original array: ");
    System.out.println(Arrays.toString(arr1));
    for(int i = 0; i<arr1.length; i++){
      if(arr1[i]>=1){
        arr1[i]=1;
      }
      else if(arr1[i]==0){
        arr1[i]=0;
      }
      else{
        arr1[i]=0;
      }
    }
    System.out.println("After modifying: ");
    System.out.println(Arrays.toString(arr1));

  }
}