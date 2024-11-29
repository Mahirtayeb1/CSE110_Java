// task 12
public class task12{
  public static void main (String[] args){
   
    int id = 24341086;
    int lsttwo = (id % 100);
    int prevdigt = (lsttwo / 10);
    int lstdigt = lsttwo % 10;
    
    System.out.println(lstdigt);
    System.out.println(prevdigt);
    
  }
}