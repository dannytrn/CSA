public class Fraction {
   private int num, den;

   public Fraction(int n, int d){
      num= n;
      den = d;
   }
   public int getNum() {
      return num;
   }
   public int getDen() {
      return den;
   }
   public Fraction add(Fraction frac1, Fraction frac2) {
      int num1 = frac1.getNum();
      int num2 = frac1.getDen();
      int num3 = frac2.getNum();
      int num4 = frac2.getDen();
      //add fraction
      return new Fraction(num1*num4+num2*num3, num2*num4);
   }
   public Fraction subtract(Fraction frac1, Fraction frac2) {
      int num1 = frac1.getNum();
      int num2 = frac1.getDen();
      int num3 = frac2.getNum();
      int num4 = frac2.getDen();
      //subtract fraction
      return new Fraction(num1*num4-num2*num3, num2*num4);
   }
   public Fraction multiply(Fraction frac1, Fraction frac2) {
      int num1 = frac1.getNum();
      int num2 = frac1.getDen();
      int num3 = frac2.getNum();
      int num4 = frac2.getDen();
      //subtract fraction
      return new Fraction(num1*num3, num2*num4);
   }
   public Fraction divide(Fraction frac1, Fraction frac2) {
      int num1 = frac1.getNum();
      int num2 = frac1.getDen();
      int num3 = frac2.getNum();
      int num4 = frac2.getDen();
      //subtract fraction
      return new Fraction(num1*num4, num2*num3);
   }
   public String toString(){
      return  num + "/" + den;
   }
}


      