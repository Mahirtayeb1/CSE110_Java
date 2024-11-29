import java.util.Scanner;
//import java.lang.String;
public class revStr{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String newS1 = "";
    for(int i = s1.length()-1; i>=0; i--){
      //System.out.print(s1.charAt(i));
      newS1 = newS1 + s1.charAt(i);
      if(s1.charAt(i) == (char)32){
        for(int j = newS1.length()-1; j>=0; j--){
          System.out.print(newS1.charAt(j));
        }
        newS1 = "";
      }
    }
    System.out.print(" ");
    for(int i = newS1.length()-1; i >= 0; i--){
      System.out.print(newS1.charAt(i));
    }
 }
 
}