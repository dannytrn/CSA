import java.util.*;
class SpinnerGame {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int board, posBlue =0, posPink=0;
    
    Spinner blue = new Spinner("blue",5);
    Spinner pink = new Spinner("pink", 3);
    Spinner green = new Spinner("green", 4);

    System.out.println("How many spaces is the board?");
    board = input.nextInt();
    while(posBlue < board && posPink<board){
      posBlue += blue.spin();
      posPink += pink.spin();

      System.out.println("Blue is currently at "+ posBlue);
      System.out.println("Pink is currently at "+ posPink);

      if(posBlue >= board)
        System.out.println("Blue is the winner!");
      else if(posPink >= board)
        System.out.println("Pink is the winner!");

    }
  }
}