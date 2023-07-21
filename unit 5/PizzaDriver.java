public class PizzaDriver{

   public static void main(String[] args)
   {
      Pizza x = new Pizza("Spinach", 12);
      Pizza y = new Pizza();
      Pizza z = new Pizza("Anchovy", 4);
      System.out.println(x); //calls toString method
      System.out.println(y);
      System.out.println(z);
      z.eat(3);
      int total = x.getSlices() + y.getSlices() + x.getSlices();
      System.out.println("Total slices remaining " + total);
      } // total slices remaining: 21
      }