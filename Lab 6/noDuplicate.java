import java.util.Scanner;
//import java.lang.String;
public class noDuplicate{
  public static void main(String []args){            // abcd
    Scanner sc = new Scanner(System.in);             // bdgc
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    //int notfnd = 0;
    String uniq = "";
    for(int i = 0; i<s1.length(); i++){
      int notfound = 0;
      for(int j = 0; j<s2.length(); j++){
        if(s1.charAt(i)==s2.charAt(j)){
          break;
        }
        else{
          notfound ++;
        }
      }
      if(notfound == s2.length()){
        uniq = uniq + s1.charAt(i);
        //notfound = 0;
      }
    }
    //System.out.print(uniq);
    for(int i = 0; i<s2.length(); i++){
      int notfnd = 0;
      for(int j = 0; j<s1.length(); j++){
        if(s2.charAt(i)==s1.charAt(j)){
          break;
        }
        else{
          notfnd ++;
        }
      }
      if(notfnd == s1.length()){
        uniq = uniq + s2.charAt(i);
        //notfnd = 0;
      }
    }
    //System.out.println(uniq);
    for(int i = 0; i<uniq.length(); i++){
      System.out.print((char)((int)uniq.charAt(i)-32));
    }
  } 
}