// Task 10

import java.util.Scanner;
public class test{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an Integer: ");
    int num = sc.nextInt();
    int numcopy = num;
    int digit = 0;
    int nod = 0;
    
    while(numcopy > 0){
      nod ++;
      numcopy = numcopy / 10;
    }
    numcopy = num;
    //System.out.print(num);
    while(numcopy>0){
      digit = numcopy / (int)Math.pow(10, nod-1);
      System.out.print(digit+ ", " );
      numcopy = numcopy % (int)Math.pow(10, nod-1);
      --nod;
    }
  }
}