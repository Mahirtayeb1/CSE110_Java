import java.util.Scanner;
//import java.lang.String;
public class task4{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String reverseString = "";
    for(int i = s1.length()-1; i >= 0; i--){
      reverseString = reverseString + s1.charAt(i);
    }
    System.out.println(reverseString);
  }
}