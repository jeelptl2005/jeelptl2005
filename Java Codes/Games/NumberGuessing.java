package Games;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random= new Random();

        int attempts=0;
        int comp_guess= random.nextInt(100)+1;
        final int max_attempts;

        System.out.println("Welcome to the Number Guessing Game.");
        System.out.println("I am guessing the number between 1 and 100");
        System.out.println();
        System.out.println("In approximately how many attempts you will complete the game? : ");
        max_attempts= sc.nextInt();

        while(attempts<max_attempts){
            System.out.println("Enter your guess: ");
            int guess= sc.nextInt();
            attempts++;

            if(guess>comp_guess){
                System.out.println("Too high! Try again");
                System.out.println();
            }
            else if(guess<comp_guess){
                System.out.println("Too low! Try again");
                System.out.println();
            }
            else{
                System.out.println("Congratulations. You guess the number successfully in "+attempts+" attempts");
                System.out.println();
                break;
            }

            if(attempts==max_attempts){
                System.out.println("Sorry..! Your attempt limit is reached out.");
                System.out.println();
                break;
            }
        }
    }
}
