import java.util.Scanner;
//import java.lang.String;
public class prac1{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
//    String s1 = sc.nextLine();
//    String s2 = sc.next();
    String s3 = "This is Cse111";
//    System.out.println(s1);
//    System.out.println(s2);
    System.out.println(s3.length());
    System.out.println((int)s3.charAt(s3.length()-1));
    System.out.println(s3.charAt(s3.length()-1));
    for(int i = 0; i < s3.length(); i++){
      System.out.print(s3.charAt(i));
      //System.out.println(i +" "+ s3.charAt(i));
    }
    System.out.println(" ");
    for(int i = s3.length()-1; i >= 0; i--){
      System.out.print(s3.charAt(i));
      //System.out.println(i +" "+ s3.charAt(i));
    }
    System.out.println(" ");
    String reverseString = "";
    for(int i = s3.length()-1; i >= 0; i--){
      //System.out.print(s3.charAt(i));
      //System.out.println(i +" "+ s3.charAt(i));
      reverseString = reverseString + s3.charAt(i);
    }
    System.out.println(reverseString.equals(s3));
  }
}