import java.util.*;
public class Unit6Lab4 {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      while(true){
      int n = 0;
      while (n<5 || n>20){
      System.out.println("How many elements (5-20) would you like to shuffle?");
      n = input.nextInt();
      }
      int[] arr = new int[n]; //creates array with the
      FillArray(arr); //fills the array properly
      ShuffleArray(arr, n);  //shuffles the array    
      int turns = n * 2 - 3; //creates amount of turns
      DisplayArray(arr); //displays the array
      while(true){
      int p =0;
      while (turns>0){ //checks if you have any turns left
      System.out.println("You have " + turns + " turns remaining");
      System.out.println("Enter # of elements (2-" + n + ") to reverse");
      p = input.nextInt();
      while (p<2 || p>n){ //makes sure number entered works
         System.out.println("Enter # of elements (2 - " + n + ") to reverse");
         p = input.nextInt();
         }
      ShuffleArray(arr, p);//suffles array up to number entered
      DisplayArray(arr); //displays new array
      if(CheckArray(arr)){ //checks if array is sorted
      System.out.println("Congrats! You sorted it!");
      break;
      }
      turns--;                
      if(turns==0){
      System.out.println("Out of turns. Game Over!");
      break;
     
      }
      }
            break;
      }
      int a = 0;
      while (a != 1 && a != 2){ //makes sure user entered 1 or 2
      System.out.println("Play again? \nEnter 1 for yes\nEnter 2 for no");
      a = input.nextInt();
      }
      if (a == 2) {
      break;
     
      }
      }
      System.out.println("Bye!");
   }
   public static void DisplayArray(int[] nums){ //displays array
   System.out.println("Here is your shuffled array: ");
   for(int i = 0;i<nums.length;i++)
   System.out.print(nums[i] + " ");
   System.out.println();
   }
   public static int[] FillArray(int[] nums){ //fills array
      for (int i = 0; i <nums.length; i++){
      nums[i] = i + 1;
      }
      return nums;
   }
   public static int[] ShuffleArray(int[] nums, int s){ //shuffles array
      int[] NewArr = new int[s];
      for (int i = 0;i < s; i++)
      NewArr[i]=nums[i];
      for (int i = 0; i <100; i++){
      int x = (int)(Math.random()*NewArr.length);
      int y = (int)(Math.random()*NewArr.length);
      int swap = NewArr[x];
      NewArr[x] = NewArr[y];
      NewArr[y] = swap;
      for (int k = 0;k < s; k++)
      nums[k]=NewArr[k];
      }
      return nums;
   }
   public static boolean CheckArray(int[] nums){ //checks if array is in order
   int[] check = new int[nums.length];
   for (int i = 0; i < check.length; i++){
      check[i] = i + 1;
      if (nums[i] != check[i])
      return false;
      }
   return true;
   }
   }