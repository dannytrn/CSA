import java.util.*;
import java.io.*;
public class CountryFinder{
   public static void main(String[] args) throws IOException{
      Scanner fileInput = new Scanner(new FileReader("countries.txt"));
      Scanner keyboard = new Scanner(System.in);
      String removeVar;
      ArrayList<Country> countries = new ArrayList();
      while(fileInput.hasNextLine()){
         String name = fileInput.nextLine();
         String cap = fileInput.nextLine();
         int pop = Integer.parseInt(fileInput.nextLine());
         countries.add(new Country(name, cap, pop));
      }
      fileInput.close();
      System.out.println("Choose an option: \n 1. Search country by name \n 2. Search country by capital \n 3. Find country with the largest population \n 4. Find country with the smallest population \n 5. List countries with over _____ people \n 6. List countries with under _____ people \n Type 0 to quit");
      int choices = Integer.parseInt(keyboard.nextLine());
      int userInt;
      boolean status = false;
      String userStr;
      
     
      while (choices < 1 || choices > 6){
         if (choices==0){
            System.out.println("Goodbye!");
            System.exit(0);
         }
         System.out.println("Invalid \n \n");
         System.out.println("Choose an option: \n 1. Search country by name \n 2. Search country by capital \n 3. Find country with the largest population \n 4. Find country with the smallest population \n 5. List countries with over _____ people \n 6. List countries with under _____ people \n Type 0 to quit"); 
         choices = Integer.parseInt(keyboard.nextLine());
      }
      if (choices == 1){
         System.out.println("Enter country name: ");
         userStr = keyboard.nextLine();
         int length = userStr.length();
         for (int i =0; i <countries.size(); i++){
            if (countries.get(i).getName().equals(userStr)){
               System.out.println(countries.get(i).toString());
               status = true;
            }
         }
         if (status == false){
            System.out.println("Country not found");
         }
      }
      
      if (choices ==2){
         System.out.println("Enter the capital: ");
         userStr = keyboard.nextLine();
         for (int i =0; i <countries.size(); i++){
            if (countries.get(i).getCapital().equals(userStr)){
               System.out.println(countries.get(i).toString());
               status = true;
            }
         }
         if (status == false){
            System.out.println("Country not found");
         }
      }
      
      if (choices == 3){
         int test = 0;
         for (int i =0; i <countries.size(); i++){
            if (countries.get(i).getPop() > test){
               test = countries.get(i).getPop();
            }
         }
         System.out.print("The country with the largest population is " + test);
      }
      
      if (choices == 4){
      int test = 1000000000;
      for (int i =0; i <countries.size(); i++){
            if (countries.get(i).getPop() < test){
               test = countries.get(i).getPop();
            }
         }
         System.out.print("The country with the smallest population is " + test);
      
      }
      
      if (choices == 5){
         System.out.println("Enter population to find countries larger than: ");
         int test = Integer.parseInt(keyboard.nextLine());
         int num = 0;
         for (int i =0; i <countries.size(); i++){
            if (countries.get(i).getPop() > test){
               System.out.println(countries.get(i).toString());
               num++;
            }
         }
         System.out.println("Total: " + num);
      }
      
      if (choices == 66){
         System.out.println("Enter population to find countries smaller than: ");
         int test = Integer.parseInt(keyboard.nextLine());
         int num = 0;
         for (int i =0; i <countries.size(); i++){
            if (countries.get(i).getPop() < test){
               System.out.println(countries.get(i).toString());
               num++;
            }
         }
         System.out.println("Total: " + num);
      }
      
      
      
      
      
      
      
      
      
        }
      }
