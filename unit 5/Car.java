public class Car
{  
   private String color;
   private String model; //type of car
   private int mpg;
   private String brand; //maker of the car
   private int doors;
   private boolean isElectric;
      public Car()
      //default constructor
      {
         color = "Blue";
         model = "Focus";
         brand = "Ford";
      
      }
      
      
      public Car(String c, String m, String b, int pgm, int d, boolean e)
      //custom constructor
      color = c; //assign parameters to each
      model = m; //data field
      brand = b;
      mpg = pgm;
      doors = d;
      isElectric = e;
      }
      
      public String get___
      //access whatevr information you need
      //about a given object
      
      public int fillTank(int n)
      {
      //mutator method - changing something
      //about the object
         gallons = gallons + n;
         return gallons;
      }
      