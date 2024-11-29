// task 14
public class task14{
  public static void main (String[] args){
    double a = 8;
    double b = 3;
    double c = Math.sqrt(((a/2)*(a/2)) + (b*b));
    double area = ((3 * Math.sqrt(3) * (c * c)) / 2);
    double circumf = 6 * c;
   

    System.out.println("Area of the hexagon: " + area);
    System.out.println("Circumference of the hexagon: " + circumf);
    
  }
}