import java.util.Scanner;
public class U2L2Tran
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String a;
      System.out.println("Enter a String:");
      a = keyboard.nextLine();
      String b, c, d;
      int e;
      b = lastThree(a);
      c = betweenParens(a);
      d = frontToBack(a);
      e = findMe(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);
      System.out.println(e);
   }
   public static String lastThree(String temp)
   {
      temp = temp.substring(temp.length()-3);
      //returns the substring of the last three characters
      return temp;
     }
  public static int findMe(String temp)
  {
     
     //return the index of 'me' in the string
     int a = 0;
     a = temp.indexOf("me");
     return a;
     }
  public static String betweenParens(String temp)
  {
   //find and return the substring between
   //a set of ()
   temp = temp.substring(temp.indexOf("(")+1, temp.indexOf(")"));
   return temp;
   }
   public static String frontToBack(String temp)
   {
      //take front half of string and move to back
      String front = temp.substring(0,temp.length()/2);
      String back = temp.substring(temp.length()/2, temp.length() - 1);
      temp = back + front;
      return temp;
   } 
   } //second bracket here to close out class
