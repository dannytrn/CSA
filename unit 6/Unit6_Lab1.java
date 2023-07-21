import java.util.Scanner;

public class Unit6_Lab1{

   public static double getAverage(double[] nums){
      double sum = 0;
      double average = 0;
    
    /************
    Write code here to sum the array
    ************/
      for (int i = 0; i <10; i++){
         sum = sum + nums[i];
         average = sum/nums.length;
         return average;
      }
      
    
    //calculate the average
      return 0;//temporary statement to keep things compiling
   }
   
   public static void showLargerValues(double[] nums, double avg){
    
    /************
    Write code here to output
    the values larger than the 
    average
    ************/
    for (int i = 0; i<10; i++){
      if (nums[i]>average){
         return nums[i];
      }
   }
   }
   
   public static void main(String[] args){
      double[] nums = new double[10];
      Scanner keyboard = new Scanner(System.in);
    /************
    Write code here to fill the array
    ************/
    for (int i = 0; i <10; i++){
      System.out.println("Enter a number");
      nums[i]= keyboard.nextDouble();
    }
    if(nums[0].equals(0)){
    System.out.print("hi");
    }
    else{
    System.out.print("hello");
    }
    
      double average = getAverage(nums);
      showLargerValues(nums, average);
   }
}