/* Tran P7 Unit 3 Lab 2 Extra Credit*/
import java.util.Scanner;
public class U3L2Tran
{
   public static void main(String[] args)
   {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a four digit code, do not repeat any digits: ");
    String guess = keyboard.next();
    
    String key = String.valueOf((int)(Math.random() * 9000) + 1000);
    int counter1 = 0, counter2 = 0;
    // counter 1 is correct digits in correct location
    // counter 2 is correct digits in wrong location
    
    
    if (guess.indexOf(key.substring(0,1)) != -1) 
    {
      if(guess.indexOf(key.substring(0,1)) == 0) 
         counter1 += 1;
         
         else
            counter2 += 1;
    }
    
    if (guess.indexOf(key.substring(1,2)) != -1) 
    {
      if(guess.indexOf(key.substring(1,2)) == 1) 
         counter1 += 1;
         
         else
            counter2 += 1;
    }
    
    if (guess.indexOf(key.substring(2,3)) != -1) 
    {
      if(guess.indexOf(key.substring(2,3)) == 2) 
         counter1 += 1;
         
         else
            counter2 += 1;
    }
    
    if (guess.indexOf(key.substring(3)) != -1) 
    {
      if(guess.indexOf(key.substring(3)) == 3) 
         counter1 += 1;
         
         else
            counter2 += 1;
    }
    
    System.out.println("Digits in the correct location: " + counter1);
    System.out.println("Correct digits in wrong location: " + counter2);
    
    
      
   }
}
