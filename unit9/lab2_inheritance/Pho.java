public class Pho extends Noodles {
   private String protein;
   
   public Pho(String n, String x, String t, String p){
   super(n, x, t);
   protein = p;
   }
   
   public String getProtein(){
	return protein;
   }
   
}
   