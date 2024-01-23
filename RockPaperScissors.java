package com.company;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private  static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Choose [r]ock, [p]aper or [s]cissors: ");

     String playersMove = scanner.nextLine().toLowerCase(Locale.ROOT);
     String Rock = ROCK;
     String Paper = PAPER;
     String Scissors = SCISSORS;

     if (playersMove.equals("r") || playersMove.equals("rock")){
         playersMove = Rock;
        } else if (playersMove.equals("p") || playersMove.equals("paper")){
         playersMove = Paper;
        } else if (playersMove.equals("s") || playersMove.equals("scissors")){
         playersMove = Scissors;
        } else {
            System.out.println("\nInvalid Input. Try Again...");
            return;
        }
     Random random = new Random ();
     int computerRandomNumber = random.nextInt(4);
     String computerMove = "";
     switch (computerRandomNumber){
         case 1:
             computerMove = ROCK;
             break;
         case 2:
             computerMove = PAPER;
             break;
         case 3:
             computerMove = SCISSORS;
             break;
     }
     System.out.printf("The computer chose %s.%n", computerMove);

     if ((playersMove.equals(Rock) && computerMove.equals(Scissors)) ||
             (playersMove.equals(Paper) && computerMove.equals(Rock)) ||
                     (playersMove.equals(Scissors) && computerMove.equals(Paper))) {
            System.out.println("You win.");
        } else if ((playersMove.equals(Rock) && computerMove.equals(Paper))||
                (playersMove.equals(Paper) && computerMove.equals(Scissors))||
                        (playersMove.equals(Scissors) && computerMove.equals(Rock))){
         System.out.println("You lose.");
     }
     else {
         System.out.println("This game was a draw.");
     }





    }
}
