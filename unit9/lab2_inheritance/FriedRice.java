public class FriedRice extends RiceDishes {
   private String protein;
   
   public FriedRice(String n, String x, String t, String p){
   super(n, x, t);
   protein = p;
   }
   
   public String getProtein(){
	return protein;
   }
   
}
   