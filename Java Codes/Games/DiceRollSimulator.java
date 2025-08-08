package Games;

import java.util.Random;
import java.util.Scanner;

public class DiceRollSimulator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random= new Random();

        int sum=0;
        String choice= "";

        do{
            int dice1= random.nextInt(6)+1;
            int dice2= random.nextInt(6)+1;
            sum= dice1 + dice2;

            System.out.println("You rolled " + dice1 + " and " + dice2);
            System.out.println("Total is " + sum);

            System.out.println();

            if(sum==7 || sum==11){
                System.out.println("You win.");
            }
            else if(dice1==dice2){
                System.out.println("Doubles.");
            }
            else{
                System.out.println("Lose");
            }
            System.out.println("Do you want to play again (yes or no) : ");
            choice= sc.nextLine();
            System.out.println();
        }while(choice.equals("yes"));
    }
}
