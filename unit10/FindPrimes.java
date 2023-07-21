import java.util.*;
    
public class FindPrimes
{
   private static ArrayList<Integer> myList = new ArrayList();
   
   //post: returns true if value is a prime number
   public static boolean isPrime(int value)
   {
      if (value < 2){
         return false;
      }
      for (int i = 2; i <= value/2; i++){
         if (value % i == 0){
            return false;
         }
      }
      return true;	//temporary return so program compiles
   }
   
   //post:  returns the index of the first non-prime number in myList.
   //			returns -1 if all numbers are prime
   private static int findNotPrime()
   {
      /*ex:	[60] will return 0
      		[2,30] will return 1
      		[2,2,15] returns 2
      		[2,2,3,5] returns -1
      */
      for (int i=0; i< myList.size(); i++){
         if (!isPrime(myList.get(i)))
            return i;
      }
      return -1;		//temporary return so program compiles
   }
   
   //post:  returns the smallest factor of a number
   private static int findSmallestFactor(int num)
   {
         /* ex:findSmallestFactor(8) -> 2
         		findSmallestFactor(9) -> 3
      			findSmallestFactor(7) -> 7
         */
      		//temporary return so program compiles
      if (num==1){
         return 1;
      }
      for (int i = 2; i < num; i++){
         if (num % i == 0){
            return i;
         }
      }
      return -1;
   }
   
   //post:	recursive method that places the prime factorization into myList
   //
   private static void generateList()
   {
      /*Hint: 	Check the list to find the first non-prime factor.
      		If all the numbers are prime, you are done.
      		Otherwise, 	* find the smallest factor of the first non-prime and find its cofactor.
      				* replace the first non-prime with its smallest factor and add the cofactor to the end
      				* repeat the whole process  */
      int index = findNotPrime();
      if(index==-1){
         return;
      }
      int num = myList.get(index);
      myList.set(index, findSmallestFactor(num));
      myList.add(num/findSmallestFactor(num));
      generateList();
   }
   	
   //post:  calculates the prime factorization of number and returns the list containing factors
   public static ArrayList<Integer> calculateFactors(int number)
   {
         /*	place number in myList, generate the prime factorizations and return the list.*/
      myList.add(new Integer(number));
      generateList();
      return myList;
   }	
      
   public static void main(String[] arg)
   {
      
      System.out.println(8 + ":" + calculateFactors(8));
      myList.clear();
      System.out.println(23 + ":" + calculateFactors(23));
      myList.clear();
      System.out.println(60 + ":" + calculateFactors(60));
      myList.clear();
      System.out.println(75 + ":" + calculateFactors(75));
   }
}