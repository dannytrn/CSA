public class Noodles extends AsianFood {
   private String toppings;
   
   public Noodles(String n, String x, String t){
   super(n, x);
   toppings = t;
   }
   
   public String getToppings(){
	return toppings;
   }
   
}
   