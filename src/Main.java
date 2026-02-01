import java.util.Scanner;

public class Main {

    public static void guessingGame() {
        Scanner input = new Scanner(System.in);
        int maxAttempts = 5;

        //SCORE TRACKING VARIABLES
        int gamesWon = 0;
        int totalRounds = 0;


        System.out.println("Welcome to the Guessing Game!");

        while (true) {
            int secretNumber = (int) (Math.random() * 100) + 1;
            totalRounds++; // Increment rounds played

            boolean wonThisRound = false;
            System.out.println("\n--- Round " + totalRounds + " ---");
            System.out.println("I've picked a number between 1 and 100. You have " + maxAttempts + " tries.");

            for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                System.out.print("Attempt " + attempt + ": Enter your guess: ");

                while (!input.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number:");
                    input.next();
                }

                int userGuess = input.nextInt();

                if (userGuess < secretNumber) {
                    System.out.println("Too low!");
                } else if (userGuess > secretNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Correct! Well done.");
                    gamesWon++; // Award a point!
                    wonThisRound = true;
                    break; // Break the FOR loop to go to playAgain
                }
            }

            if (!wonThisRound) {
                System.out.println("Out of attempts! The number was: " + secretNumber);
            }

            // Display Score Summary
            System.out.println("SCORE: " + gamesWon + " wins out of " + totalRounds + " rounds.");

            System.out.println("Would you like to play another round? (yes/no)");
            String playAgain = input.next().toLowerCase();

            while (!playAgain.equals("no") && !playAgain.equals("yes")) {
                System.out.print("Please type 'yes' or 'no': ");
                playAgain = input.next().toLowerCase();
            }

            if (playAgain.equals("no")) {
                System.out.println("\nFINAL SCORE: " + gamesWon + "/" + totalRounds);
                System.out.println("Thank you for playing! Goodbye!");
                break; // Exit the WHILE loop
            }
        }
        input.close();
    }

    public static void main(String[] args) {
        guessingGame();
    }
}