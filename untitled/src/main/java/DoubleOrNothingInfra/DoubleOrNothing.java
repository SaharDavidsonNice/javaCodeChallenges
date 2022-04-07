package DoubleOrNothingInfra;

import java.util.Random;
import java.util.Scanner;

public class DoubleOrNothing {

    int userStartPoints = 10;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int current = userStartPoints;
    boolean isStillPlaying = true;
    public void playGame() {
        printWelcome();
        askUserToContinue();
        while(this.isStillPlaying){
            priTryToDouble();
            if(shouldDouble()){
                doubleCurrent();
                printCongrates();
                askUserToContinue();
            }else{
                printLost();
                return;
            }
        }
        printWalkawayMsg();
    }

    private void printLost() {
        System.out.println("Uh oh. You've lost. no pints for you");
    }

    private void printCongrates() {
        System.out.println("Congrats!! You now have : " + this.current + " points\n");
    }

    private void doubleCurrent() {
        this.current = this.current*2;
    }

    private boolean shouldDouble() {
      return this.random.nextInt(2) == 0;
    }


    private void priTryToDouble() {
        System.out.println("lets try to to double it!!\n");
    }

    protected void askUserToContinue() {
        System.out.println("Would you like to continue " + "and try to double your winnings? " + "Enter YES to continue");
        this.isStillPlaying = this.scanner.nextLine().toUpperCase().equals("YES");
    }

    private void printWelcome() {
        System.out.println("lets play double or nothing , you'll start from: " + userStartPoints + " points\n");
    }

    private void printWalkawayMsg() {
        System.out.println("Congrats! you finish with " + this.current + " points");
    }
}
