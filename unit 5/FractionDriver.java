public class FractionDriver{
   public static void main(String[] args)
   {
      Fraction frac1 = new Fraction(2, 5);
      Fraction frac2 = new Fraction(1,2);
      System.out.println(frac1.getNum());
      System.out.println(frac1.getDen());
      System.out.println(frac1.add(frac1, frac2));
      System.out.println(frac1.subtract(frac1, frac2));
      System.out.println(frac1.multiply(frac1, frac2));
      System.out.println(frac1.divide(frac1, frac2));
      System.out.println(frac1.toString());
   } 
}