package Games;

import java.util.Random;
import java.util.Scanner;

public class OddOrEvenNumber {
    static String oddOrEven(int num){
        if(num%2==0){
            return "even";
        }
        else{
            return "odd";
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random= new Random();

        String op= "";
        int score=0;

        System.out.println("---------- WELCOME TO ODD EVEN GAME ----------");

        while(!op.equals("no")){
            System.out.println();
            int num= random.nextInt(1000)+1;
            System.out.println("The number "+num+" is Odd or Even? :");
            String user_ans= sc.nextLine().toLowerCase();


            if(user_ans.equals(oddOrEven(num))){
                System.out.println();
                System.out.println("-> Correct Answer.");
                score+=3;
            }
            else{
                System.out.println();
                System.out.println("-> Incorrect answer");
                score-=1;
            }


            System.out.println("Do you want to play again?");
            op= sc.nextLine().toLowerCase();
            System.out.println();

        }
        System.out.println();
        System.out.println("----------YOUR SCORE IS "+score+"----------");
    }
}
