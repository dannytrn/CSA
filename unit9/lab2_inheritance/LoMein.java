public class LoMein extends Noodles {
   private String protein;
   
   public LoMein(String n, String x, String t, String p){
   super(n, x, t);
   protein = p;
   }
   
   public String getProtein(){
	return protein;
   }
   
}
   