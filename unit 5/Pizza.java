public class Pizza
{
   private String topping;
   private int slices;
   //private so you can only change the data field from witin the class it is defined.
   //Encapsulation - calling a public method to do the work; changing data field
   public Pizza()
   {// default constructor
      topping = "cheese";
      slices = 8;
      }
    public Pizza(String t, int s)
    {// custom constructor
      topping = t;
      slices = s;
    }
    public void eat(int s)
    {//set method or mutator method
      slices = slices - s;
      }
      //getter or accessor methods
      public String getTopping()
      {
         return topping;
      }
      public int getSlices()
      {
      return slices;
      }
      public String toString()
      {
         return topping + ", " + slices + "left";
         }
         
        }
      