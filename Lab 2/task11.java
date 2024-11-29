// task 11
public class task11{
  public static void main (String[] args){
   
    double a = 4.5f;
    double b = 9.5f;
    double c = Math.sqrt((a*a) + (b*b));
    double sinA = (a/c);
    double cosA = (b/c);
    double sinB = (b/c);
    double cosB = (a/c);
    
    System.out.println("Sin value of Angle A is " + sinA);
    System.out.println("Cos value of Angle A is " + cosA);
    System.out.println("Sin value of Angle B is " + sinB);
    System.out.println("Cos value of Angle B is " + cosB);
  }
}