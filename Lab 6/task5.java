import java.util.Scanner;
//import java.lang.String;
public class task5{
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    int vowelCount = 0;
    int consCount = 0;
    for(int i = 0; i < s1.length(); i++){
      if((s1.charAt(i)>(char)64 && s1.charAt(i)<(char)91) || (s1.charAt(i)>(char)96 && s1.charAt(i)<(char)123)){
        if(s1.charAt(i)==(char)65 || s1.charAt(i)==(char)69 || s1.charAt(i)==(char)73 || s1.charAt(i)==(char)79 || s1.charAt(i)==(char)85  || s1.charAt(i)==(char)97 || s1.charAt(i)==(char)101 || s1.charAt(i)==(char)105 || s1.charAt(i)==(char)111 || s1.charAt(i)==(char)117 ){
            vowelCount ++;
          }
        }
        else{
          consCount ++;
        }
      }
    System.out.println(vowelCount);
    System.out.println(consCount);
    if(vowelCount % 3 == 0 && consCount % 5 == 0){
      System.out.println("Aaarr! Me Plunder!!");
    }
    else{
      System.out.println("Blimey! No Plunder!!");
    }
  }
 
}