import java.util.*;
public class Country
{
   String name, capital;
   int population;
  
    public Country(String n, String c, int p)
    {// custom constructor
      name = n;
      capital = c;
      population = p;
    }
    public String getName()
    {
       return name;
    }
    public String getCapital()
    {
       return capital;
    }
    public int getPop()
    {
       return population;
    }
    public String toString()
      {
         return name + ", Capital: " + capital + ", Pop: " + population;
      }
         
        }
      