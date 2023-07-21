/* Tran P7 Unit 3 Lab 3*/
import java.util.Scanner;
public class U3L3ran
{
   public static void main(String[] args)
   {
    Scanner keyboard = new Scanner(System.in);
    int temp;
    String unit;
    System.out.println("Enter a temperature: ");
    temp = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("Enter C for Celsius, F for Fahrenheit: ");    
    unit = keyboard.nextLine();
    if (unit.equals("C")){
      if (temp <= 0){
      System.out.println("The water is solid (frozen)");
      }
      else if (temp < 0) {
      System.out.println("The water is liquid");
      }
      else if (temp >= 100){
      System.out.println("The water is gaseous (boiling)");
      }
    }
    else {
      if (temp <= 32){
      System.out.println("The water is solid (frozen)");
      }
      else if (temp < 32) {
      System.out.println("The water is liquid");
      }
      else if (temp >= 212){
      System.out.println("The water is gaseous (boiling)");
      }
    }
       }
}
