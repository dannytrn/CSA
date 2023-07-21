import java.util.*;
public class MasterOrder{
   private ArrayList<CookieOrder> orders;
   
   public MasterOrder(){
      orders = new ArrayList();
   }
   
   public ArrayList<CookieOrder> getOrders(){
      return orders;
   }
   public void addOrder(CookieOrder c){
      orders.add(c);
   }
   
   //TO BE COMPLETED: getTotalBoxes
   //Computes and returns the sum of the number of 
   //boxes of all cookie orders. 
   //If there are no cookie orders in the master order, 
   //the method returns 0.
   public int getTotalBoxes(){
   int sum=0;
   for ( int i=0; i<orders.size(); i++){
      sum+=orders.get(i).getNumBoxes();
   }
      return sum;//temporary
   
   }
   
   //TO BE COMPLETED:removeVariety
   //Updates the master order by removing all of 
   //the cookie orders in which the variety of cookie 
   //matches the parameter cookieVar. 
   //The master order may contain zero or more 
   //cookie orders with the same variety as cookieVar. 
   //The method returns the total number of boxes removed 
   //from the master order.
   public int removeVariety(String cookieVar){
      int removed = 0;
      for (int i = 0; i<orders.size(); i++){
         if (orders.get(i).getVariety().equals(cookieVar)){
            orders.remove(i);
            removed += orders.get(i).getNumBoxes();
            i--;
         }
      }
      return removed;//temporary
   }

}