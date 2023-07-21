public class Volcano
{
   private String name;
   private int height;
   private String continent;
   //private so you can only change the data field from witin the class it is defined.
   //Encapsulation - calling a public method to do the work; changing data field
  
    public Volcano(String n, int h, String c)
    {// custom constructor
      name = n;
      height = h;
      continent = c;
    }
    public String getName()
    {
       return name;
    }
    public int getHeight()
    {
       return height;
    }
    public String getContinent()
    {
       return continent;
    }
    public String toString()
      {
         return "The " + name + " volcano is " + height + " feet tall and located in " + continent;
      }
         
        }
      