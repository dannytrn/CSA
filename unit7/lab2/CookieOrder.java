public class CookieOrder
{
   String variety;
   int numBoxes;
  
  
    public CookieOrder(String v, int n)
    {// custom constructor
      variety = v;
      numBoxes = n;
    }
    public String getVariety()
    {
       return variety;
    }
    public int getNumBoxes()
    {
       return numBoxes;
    }
    public String toString()
      {
         return numBoxes + " boxes of " + variety;
      }
         
        }
      