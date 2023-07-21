/* Tran P7 Unit 4 Lab 2*/
import java.util.Scanner;
public class U4L2Tran
{
   public static void main(String[] args)
   {
    Scanner keyboard = new Scanner(System.in);
    int guess;
    System.out.println("I'm thinking of a number between 1 and 100: \nYour Guess? ");    
    guess = keyboard.nextInt();
    int random = (int)(1 + Math.random() * 100);
    int attempts = 0;
    
    while (guess < 1 || guess > 100) {
    System.out.println("Please enter a number in range: \nYour Guess? ");
    guess = keyboard.nextInt();
    }
    while (guess > 0 && guess < 101) {
      if (guess > random){
      System.out.println("Incorrect - guess a smaller number \nYour guess?");
      attempts++;
      guess = keyboard.nextInt();
      }
      if (guess < random){
      System.out.println("Incorrect - guess a larger number \nYour guess?");
      attempts++;
      guess = keyboard.nextInt();
      }
      if (guess == random){
      System.out.println("Correct! It took you " + attempts + " tries!");
      break;
      }
    }
    }
}
