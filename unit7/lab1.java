import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
public class U7L1{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      List<String>six = new ArrayList<String>();
      List<String>firstb = new ArrayList<String>();
      System.out.println("Enter 10 words: ");
      for (int i = 0; i < 10; i++){
         six.add(input.next());
      }
      
      for (String word : six){
         if (word.startsWith("b")){
            firstb.add(word);
         }
      }
      
      for (int i = 0; i < six.size(); i++){
         if ((six.get(i)).length() <= 6){
            six.remove(i);
            i--;
         }
      }
      System.out.println("Words 6 letters long or more: " + six);
      System.out.println("Words that start with b: " + firstb);
     
      
   }
}