import java.util.Scanner;
public class midQ{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of Items: ");
    int inp = sc.nextInt();
    int max = 0;
    String maxfood = " ";
    String minfood = " ";
    int total = 0;
    int min = 100000000;
    for(int i = 1; i<=inp; i++){
      System.out.print("Enter Name of Item"+i+" : ");
      String foodname = sc.next();
      System.out.print("Enter price of Item"+i+" : ");
      int prod = sc.nextInt();
      //max = prod;
      if(prod > max){
        max = prod;
        maxfood = foodname;
      }
      if(prod < min){
        min = prod;
        minfood = foodname;
      }
      total += prod;
    }
    System.out.println("Highest price of an Item is: " + max);
    System.out.println("Highest priced Item is: " + maxfood);
    System.out.println("Lowest price of an Item is: " + min);
    System.out.println("Lowest priced Item is: " + minfood);
    System.out.println("Total Cost is: " + total);
    System.out.println("Average Cost is: " + ((int)(total/inp)));
  }
}