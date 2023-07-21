public class StickyRice extends RiceDishes {
   private String protein;
   
   public StickyRice(String n, String x, String t, String p){
   super(n, x, t);
   protein = p;
   }
   
   public String getProtein(){
	return protein;
   }
   
}
   