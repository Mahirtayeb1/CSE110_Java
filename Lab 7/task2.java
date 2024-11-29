import java.util.Scanner;
import java.util.Arrays;
//import java.lang.String;
public class task2{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    //int size = sc.nextInt();
    int [] arr = {9, -5, 7, 9, -5, 5, 7};
    System.out.println("Before removing duplicates: ");
    System.out.println(Arrays.toString(arr));
    for(int i = 0; i<arr.length-1; i++){
      for(int j = i+1; j<arr.length; j++){
        if(arr[i] == arr[j]){
          arr[j] = 0;
        }
      }
    }
    System.out.println("After replacing duplicates with 0:");
    System.out.println(Arrays.toString(arr));
  }
}