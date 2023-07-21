import java.util.*;
import java.io.*;
public class CookieProgram{
   public static void main(String[] args) throws IOException{
      Scanner fileInput = new Scanner(new FileReader("Orders.txt"));
      Scanner keyboard = new Scanner(System.in);
      String removeVar;
      MasterOrder MOrder = new MasterOrder();
      while(fileInput.hasNextLine()){
         String nextLine = fileInput.nextLine();
         int numBoxes = Integer.parseInt(nextLine.substring(0, 1));
         String variety = nextLine.substring(2);
         MOrder.addOrder(new CookieOrder(variety, numBoxes));
      }
      System.out.println("Initial Master Order: ");
      System.out.println(MOrder.getOrders());
      System.out.println("Total Boxes in the Order: " + MOrder.getTotalBoxes());
      System.out.println("What variety would you like to remove? ");
      removeVar = keyboard.nextLine();
      System.out.println(MOrder.removeVariety(removeVar) + " boxes of " + removeVar + " were removed");
      System.out.println("Here is the updated Master Order: ");
      System.out.println(MOrder.getOrders());
      }
      }
