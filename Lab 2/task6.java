//task 6
public class task6{
  public static void main (String[] args){
    // by creating third variable
    int n = 12;
    int m = 6;
    int temp = n;
    n = m;
    m = temp;
    System.out.println(n);
    System.out.println(m);
    
    // without creating other variable
    int p = 10;
    int q = 5;
    p = p + q; // total 15
    q = p - q; // total 10
    p = p - q; // total 5
    System.out.println(p);
    System.out.println(q);
       
  }
}