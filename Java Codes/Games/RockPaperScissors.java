package Games;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random= new Random();

        System.out.println("--------Welcome to Rock, Paper and Scissors Game.--------");
        System.out.println();
        System.out.println("Enter your name: ");
        String name= sc.nextLine().toUpperCase();

        int comp_choice;
        int user_choice;
        int user_score=0;
        int comp_score= 0;

        while(true){
            System.out.println();
            System.out.println("1. Rock\n2. Paper\n3. Scissors\n4. Exit");
            System.out.println();
            System.out.println("Choose the one option: ");
            user_choice= sc.nextInt();

            if(user_choice==4){
                System.out.println();
                System.out.println(name+"'s Score is "+user_score);
                System.out.println("Computer score is "+comp_score);
                if(user_score==comp_score){
                    System.out.println("---------- TIE BETWEEN BOTH ----------");
                }
                else if(user_score>comp_score){
                    System.out.println("---------- "+name + " WINS WHOLE GAME. ----------");
                }
                else{
                    System.out.println("---------- COMPUTER WINS WHOLE GAME. ----------");
                }

                return;
            }

            if(user_choice>4){
                System.out.println();
                System.out.println("Invalid input");
                return;
            }

            comp_choice= random.nextInt(3)+1;

            switch(user_choice){
                case 1:
                    System.out.println(name+" choose Rock");break;
                case 2:
                    System.out.println(name+" choose Paper");break;
                case 3:
                    System.out.println(name+" choose scissors");break;
            }

            switch (comp_choice){
                case 1:
                    System.out.println("Computer choose Rock");break;
                case 2:
                    System.out.println("Computer choose Paper");break;
                case 3:
                    System.out.println("Computer choose Scissors");break;
            }

            if(user_choice==comp_choice){
                System.out.println();
                System.out.println("TIE BETWEEN BOTH");
            }
            else if((user_choice==1 && comp_choice==3) || (user_choice==2 && comp_choice==1) || (user_choice==3 && comp_choice==2)){
                System.out.println();
                System.out.println("CONGRATULATIONS "+name+"!! YOU WIN.");
                user_score+=4;
                comp_score-=2;
            }
            else{
                System.out.println();
                System.out.println("COMPUTER WINS");
                comp_score+=4;
                user_score-=2;
            }
            System.out.println("--------------------------------------------------------");
        }
    }
}
