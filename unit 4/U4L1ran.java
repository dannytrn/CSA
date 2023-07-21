/* Tran P7 Unit 4 Lab 1*/
import java.util.Scanner;
public class U4L1ran
{
   public static void main(String[] args)
   {
    Scanner keyboard = new Scanner(System.in);
    int power;
    System.out.println("Enter a positive power, enter -1 to stop: ");    
    power = keyboard.nextInt();
   
    
    while (power > 0) {
    System.out.println("2^" + power + "=" + Math.pow(2,power));
    System.out.println("Enter a positive power, enter -1 to stop: ");    
    power = keyboard.nextInt();
    }
    while ( power == -1){
    System.out.println("Goodbye!");
    break;
    }
    }
}
