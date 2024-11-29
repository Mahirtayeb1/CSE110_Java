//public class test{
//  public static void main (String[] args){
//    int n1 = 20;
//    int n2 = 10;
//    int sum = n1 + n2;
//    System.out.print(sum);
//  }
//}

public class test {
    public static void main(String[] args) {
        int distanceInMeters = 2500; // Last 4 digits of the student ID
        int totalSeconds = 5 * 3600 + 56 * 60 + 23;
        
        double distanceInKm = distanceInMeters / 1000.0;
        double distanceInMiles = distanceInMeters / 1609.0;
        
        double velocityKmH = distanceInKm / (totalSeconds / 3600.0);
        double velocityMilesH = distanceInMiles / (totalSeconds / 3600.0);
        
        System.out.println("Your velocity in km/h is " + velocityKmH);
        System.out.println("Your velocity in miles/h is " + velocityMilesH);
    }
}