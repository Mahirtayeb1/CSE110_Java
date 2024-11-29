import java.util.Scanner;
import java.lang.String;
public class task1{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    //System.out.print(a);
    for(int i=0; i<a.length(); i++){
      //System.out.print(a.charAt(i));
      if(a.codePointAt(i)> 96 && a.codePointAt(i)<123){
        System.out.print((char)(a.codePointAt(i)-32));
      }
      else{
        System.out.print((char)a.codePointAt(i));
      }
    }
  }
}