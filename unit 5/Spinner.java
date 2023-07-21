public class Spinner
{
   private String color;
   private int sections;
  
      public Spinner(){
         color = "red";
         sections = 4;
      }
      public Spinner(String c, int s){
         color = c;
         sections = s;
      }
      public String getColor(){
         return color;
      }
      public int getNum(){
         return sections;
      }
      public void setColor(String s){
         color = s;
      }
      public void setNum(int n){
         sections = n;
      }
      public int spin(){
         return (int)(Math.random()*sections);
      }

}