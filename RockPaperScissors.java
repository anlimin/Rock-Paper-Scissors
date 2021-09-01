package com.sg.foundations.flowcontrol.arrays;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        String winner;
        String answer;
        int choice, userChoice;
        int rounds;
        int numberOfTie = 0, numberOfUserWin = 0, numberOfComputerWin = 0;

        do{
            System.out.print("How many rounds you want to play? ");
            rounds = in.nextInt();
            if(rounds > 10 || rounds < 1){
                System.out.println("The rounds must be between 1 and 10");
                System.exit(0);
            }
            for(int i = 1; i <= rounds; i++){
                System.out.print("What is your choice? 1 = Rock, 2 = Paper, 3 = Scissors ");
                userChoice = in.nextInt();
                choice = random.nextInt(3) + 1;
                if(userChoice == choice){
                    numberOfTie++;
                }else if(userChoice == 1 && choice == 3 || userChoice == 2 && choice == 1 || userChoice == 3 && choice == 2){
                    numberOfUserWin++;
                }else if(choice == 1 && userChoice == 3 || choice == 2 && userChoice == 1 || choice == 3 && userChoice == 2){
                    numberOfComputerWin++;
                }
            }

            System.out.println("Number of Ties " + numberOfTie);
            System.out.println("Number of User wins " + numberOfUserWin);
            System.out.println("Number of Computer wins " + numberOfComputerWin);
            if(numberOfComputerWin > numberOfUserWin)
                System.out.println("The winner is Computer");
            else if(numberOfComputerWin < numberOfUserWin)
                System.out.println("The winner is User");
            else
                System.out.println("The result is Tie");

            System.out.print("Do you want to play again? Y or N ");
            answer = in.next();
        }while(answer.equals("Y"));
    }
}
