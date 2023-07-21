import java.util.*;
public class Loops{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a starting value: ");
      int s = scan.nextInt();
      System.out.println("Enter an ending value: ");
      int e = scan.nextInt();
      squaresAndCubes(s, e);
      
      starRectangle();
      starTriangle();
      starReverseTriangle();
   }
   public static void squaresAndCubes(int start, int end){
      for(int i = start; Math.pow(i, 3) < end; i++){
         System.out.println(i + " " + (int)Math.pow(i, 2) + " " + (int)Math.pow(i, 3));
      }
   
   }
   public static void starRectangle(){
      for (int i = 1; i <= 5; i++) {
         for (int j = 1; j <=5; j++){
            System.out.print("*");
         }
      System.out.println();
      }
  
   }
   public static void starTriangle(){
      for (int i = 1; i <= 5; i++){
         for (int j = 1; j <= i; j++){
            System.out.print("*");
         }
      System.out.println();
      }
   }
   public static void starReverseTriangle(){
      for (int i = 1; i <= 5; i++) {
         for (int j = 5; j > i; j--){
         System.out.print(" ");
         }
         for (int x = 0; x < i; x++){
         System.out.print("*");
         } 
      System.out.println();
      }
   }
}