package com.codewars.eightkyu;

//      Rock Paper Scissors
//      Let's play! You have to return which player won! In case of a draw return Draw!.
//      Examples:
//      rps('scissors','paper') // Player 1 won!
//      rps('scissors','rock') // Player 2 won!
//      rps('paper','paper') // Draw!

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        if (p1.equals("rock") && p2.equals("scissors")) {
            return "Player 1 won!";
        } else if (p1.equals("rock") && p2.equals("paper")) {
            return "Player 2 won!";
        } else if (p1.equals("scissors") && p2.equals("paper")) {
            return "Player 1 won!";
        } else if (p1.equals("scissors") && p2.equals("rock")) {
            return "Player 2 won!";
        } else if (p1.equals("paper") && p2.equals("rock")) {
            return "Player 1 won!";
        } else if (p1.equals("paper") && p2.equals("scissors")) {
            return "Player 2 won!";
        } else {
            return "Draw!";
        }
    }
}