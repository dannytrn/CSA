import java.io.*;
import java.util.*;
public class VolcanoEruption{
   public static void main(String[] args) throws IOException{
      Scanner input = new Scanner(new FileReader("volcanodata.txt"));
      
      Volcano[] vol = new Volcano[input.nextInt()];
      String name;
      int height;
      String continent;
      int count = 0;
      
      //create an array of Volcano objects
      //read in the data from volcanodata.txt to fill the array
      while (input.hasNext()) {
         name = input.next();
         height = input.nextInt();
         continent = input.next();
         vol[count] = new Volcano (name, height, continent);
         count++;
      }
      
      eruption(vol);
      //complete the methods below and test them
      System.out.println(volcanoesOnContinent(vol, "Asia"));
      System.out.println(numVolcanoesOver(vol, 2500));
      System.out.println(numVolcanoesUnder(vol, 3000));
      showVolcanoes(vol);
      
   }
   
   //picks a random Volcano from vArray
   //outputs "[random Volcano's name] has erupted!"
   public static void eruption(Volcano[] vArray){
      int x = (int)(Math.random() * vArray.length);
      System.out.println(vArray[x].getName() + " has erupted!");
   }
   
   //returns the number of Volcanoes in vArray that are located on targetContinent
   public static int volcanoesOnContinent(Volcano[] vArray, String targetContinent){
      String target = targetContinent;
      int count = 0;
      for (int i = 0; i<vArray.length; i++){
         if (vArray[i].getContinent().equals(target)){
            count++;
         }
      }
      return count; //temporary return statement to keep us compiling
   }
   
   //returns the number of Volcanoes in vArray that are taller than targetHeight
   public static int numVolcanoesOver(Volcano[] vArray, int targetHeight){
      int target = targetHeight;
      int count = 0;
      
      for (int i = 0; i < vArray.length; i++){
         if (vArray[i].getHeight()>target){
            count++;
         }
      }
      return count; //temporary return statement to keep us compiling
   }
   
   /*
   *
   *
   *Create your own method that analyzes the Volcano data
   *Your method can return an int, String, boolean, Volcano, or Volcano[]
   *You MAY NOT print from this method
   *Test your method in main
   *
   */
   // returns number of volcanoes in vArray that are shorter than targetHeight
   public static int numVolcanoesUnder(Volcano[] vArray, int targetHeight){
      int target = targetHeight;
      int count = 0;
      for (int i = 0; i<vArray.length; i++){
         if (vArray[i].getHeight()<target){
            count++;
         }
      }
      return count;
   }
   
   
   
   
   //it might be helpful to have a method that displays the whole
   //array of Volcano objects for debugging purposes
   public static void showVolcanoes(Volcano[] vArray){
     for (int i = 0; i<vArray.length; i++){
      System.out.print(vArray[i]);
     }
   }
}