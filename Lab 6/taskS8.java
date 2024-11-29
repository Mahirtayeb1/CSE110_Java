import java.util.Scanner;
//import java.lang.String;
public class taskS8{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    for(int i = 0; i<s1.length(); i++){
      if(i%2==0){
        if((s1.charAt(i)>(char)64 && s1.charAt(i)<(char)91)||(s1.charAt(i)>(char)96 && s1.charAt(i)<(char)123)){
          if(s1.charAt(i)>(char)64 && s1.charAt(i)<(char)91){
            System.out.print((char)((int)s1.charAt(i)+32));
          }
          else{
            System.out.print(s1.charAt(i));
          }
        }
      }
      else{
        if((s1.charAt(i)>(char)64 && s1.charAt(i)<(char)91)||(s1.charAt(i)>(char)96 && s1.charAt(i)<(char)123)){
          if(s1.charAt(i)>(char)64 && s1.charAt(i)<(char)91){
            System.out.print(s1.charAt(i));
          }
          else{
            System.out.print((char)((int)s1.charAt(i)+32));
          }
        }        
      }
    }
  }
}