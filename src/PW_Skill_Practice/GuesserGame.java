package PW_Skill_Practice;


import java.util.Scanner;
// Here Gusser Class is Working
 class Guesser {

     int guessNum;
     public   int GusserNum(){
         System.out.println(" Guesser Please guess the number ");
         Scanner sc = new Scanner(System.in);
          guessNum =sc.nextInt();
          return guessNum;
     }

 }
 // Here Players Class is Working

 class Players{
     int guessingNum ;
     public  int Player (){
         System.out.println(" Player ! , Please guess the number ");
         Scanner sc = new Scanner(System.in);
         guessingNum = sc.nextInt();
         return  guessingNum ;
     }

 }
 // Here umpier class is working
 class umpier{
     int numFromGuesser ;
     int numFromPlayer1 ;
     int numFromPlayer2 ;
     int numFromPlayer3 ;

  public  void CollectNumFromGuesser(){
      Guesser g = new Guesser();
     numFromGuesser  = g.GusserNum();
  }
  public void CollectNumFromPlayers(){
      Players p = new Players();
      numFromPlayer1 = p.Player();
      numFromPlayer2 = p.Player();
      numFromPlayer3 = p.Player();
  }

  public void compere (){
      if (numFromGuesser == numFromPlayer1){
          if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3){
              System.out.println(" All Players , Guesses  the same number ");
          }else if (numFromGuesser == numFromPlayer2){
              System.out.println(" Player 1 and Player 2 Guesses the same number ");
          } else if (numFromGuesser == numFromPlayer3) {
              System.out.println(" Player 1 and Player 3 Guesses the same number ");
          }else {
              System.out.println(" Player1 is won the match ");
          }
      }else if (numFromGuesser == numFromPlayer2){
          if (numFromGuesser == numFromPlayer3){
              System.out.println(" Player 2 and Player 3 Guesses the same number ");
          }else {
              System.out.println(" Player2 is won the match ");
          }
      }else if (numFromGuesser == numFromPlayer3){
          System.out.println(" Player3 is won the match ");
      }else {
          System.out.println(" Nobody is won the match ! , Please restart the match ");
      }
  }


 }
public class GuesserGame {
    public static void main(String[] args) {
        System.out.println(" Match is Stated ");
        umpier u = new umpier();
        u.CollectNumFromGuesser();
        u.CollectNumFromPlayers();
        u.compere();

    }

}
