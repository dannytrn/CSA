public class Pokemon{
   private String name;
   private String type;
   private int level;
   private int hp;
   
   
   public Pokemon(){
      level = 5;
      hp = 40;
      int choice = (int)(Math.random()*3);
      if(choice == 0){
         name = "Charmander";
         type = "Fire";
      }
      else if(choice==1){
         name = "Squirtle";
         type= "Water";
      }
      else{
         name = "Bulbasaur";
         type = "Plant";
      }
   
   }
   public Pokemon(String n, String t, int l, int h){
      name = n;
      type = t;
      level = l;
      hp = h;
   }

   public String getName(){
      return name;
   }
   public String getType(){
      return type;
   }
   public int getHP(){
      return hp;
   }
   public int getLevel(){
      return level;
   }
   public void setHP(int h){
      hp = h;
   }
   public void attack(Pokemon p){
      int damage = (int)(Math.random() * 10 + 5);
      p.setHP(p.getHP()-damage);
      System.out.println(name + " attacked " + p.getName() + " and did " + damage + " damage!");
   }
   public void displayStats(){
      System.out.println(name + " is level " + level + ", " + hp + "HP");
   }
}