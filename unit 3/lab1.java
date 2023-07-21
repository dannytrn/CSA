/* Tran P7 Unit 3 Lab 2*/
import java.util.Scanner;
public class U3L2Tran
{
   public static void main(String[] args)
   {
    Scanner keyboard = new Scanner(System.in);
      int a;
      int b;
      System.out.println("Enter an integer:");
      a = keyboard.nextInt();
      System.out.println("Enter another integer:");
      b = keyboard.nextInt();
      if (a >= b){
      System.out.println("Quotient: " + a/b);
      System.out.println("Remainder: " + a%b);
      }
      else {
      System.out.println("Quotient: " + b/a);
      System.out.println("Remainder: " + b%a);
      }
      
   }
}
