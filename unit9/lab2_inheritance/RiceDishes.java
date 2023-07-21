public class RiceDishes extends AsianFood {
   private String toppings;
   
   public RiceDishes(String n, String x, String t){
   super(n, x);
   toppings = t;
   }
   
   public String getToppings(){
	return toppings;
   }
   
}
   