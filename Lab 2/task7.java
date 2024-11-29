//task 7
public class task7{
  public static void main (String[] args){
   
    int mins = 3456789;
    int year = mins / (365 * 60 * 24);
    //int d2 = (mins % (365 * 24 * 60)) / (24 * 60);
    int day =  (mins - (year * (365 * 24 * 60))) / (24 * 60);
    
    System.out.println(mins + " minutes is approximately " + year + " years and " + day + " days" );
    //System.out.println(day);
    // System.out.println(d2);
    
  }
}