//import java.util.Scanner;  
////import java.util.InputMismatchException;
//public class pr3{  
//  public static void main(String[] args){
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    float m = sc.nextFloat();
//    double x1 = sc.nextDouble();
//    double x2= sc.nextDouble();
//    double y1 = sc.nextDouble();
//    double y2 = sc.nextDouble();
//    double avgC = n/m;
////    double x2x1 = x2 - x1;
////    double y2y1 = y2 - y1;
////    double a = x2x1 * x2x1;
////    double b = y2y1 * y2y1;
////    double res = a+b;
//    double dist = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
//    System.out.print(avgC+" km/l");
//    System.out.print(dist+" km");
//  }
//}

import java.util.Scanner;

public class pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x1, y1, x2, y2:");

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Calculate distance
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        // Calculate slope
        double slope = 0;
        String slopeDescription;

        if (x2 - x1 != 0) {
            slope = (y2 - y1) / (x2 - x1);
            if (slope > 0) {
                slopeDescription = "The slope is Positive";
            } else if (slope < 0) {
                slopeDescription = "The slope is Negative";
            } else {
                slopeDescription = "The slope is Zero";
            }
        } else {
            slopeDescription = "The slope is Undefined (vertical line)";
        }

        // Output results
        System.out.printf("Distance: %.4f%n", distance);
        System.out.printf("Slope: %.4f%n", slope);
        System.out.println(slopeDescription);

        sc.close();
    }
}