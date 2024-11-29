// task 13
public class task13{
  public static void main (String[] args){
   
    double dc = 2500.0;   // meter and 1 mile = 1609 meters
    double t = (5*3600 + 56 * 60 + 23); // total time in s
    double km = (dc / 1000.0);
    double mile = (dc / 1609.0);
    double k = km / (t /3600.0);
    double m = mile / (t / 3600.0);
    System.out.println("Your velocity in km/h is " + k);
    System.out.println("Your velocity in miles/h is " + m);
    
  }
}