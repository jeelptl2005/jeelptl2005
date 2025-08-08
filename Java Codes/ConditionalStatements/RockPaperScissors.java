package ConditionalStatements;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random= new Random();

        System.out.print("Welcome to the Rock, Paper and Scissors Game...!!\n");
        System.out.println("Enter your name: ");
        String name= sc.nextLine().toUpperCase();
        System.out.println();
        int uWin=0;
        int cWin=0;
        int i=1;
        while(true){
            System.out.print("1. Rock\n2. Paper\n3. Scissors\n4. Exit\n");
            System.out.print("Enter the operation : ");
            System.out.println();
            int num= sc.nextInt();
            int comp_choice= random.nextInt(3)+1;

            if(num==4){
                System.out.println();
                System.out.println();
                System.out.println("You play "+ i + " times");
                if(uWin>4){
                    System.out.println(name+" win "+uWin+" times.");
                    System.out.println("------So, "+name+" is the final winner.------");
                }
                else if(cWin>4){
                    System.out.println("Computer wins "+cWin+" times.");
                    System.out.println("------So, Computer is the final winner.------");
                }
                else{
                    System.out.println(name+" win "+uWin+" times.");
                    System.out.println("Computer wins "+cWin+" times.");
                    System.out.println("No one is winner.\nBetter luck in next time...!!");
                }
                break;
            }

            switch(num){
                case 1:
                    System.out.println(name+" choose Rock");break;
                case 2:
                    System.out.println(name+" choose Paper");break;
                case 3:
                    System.out.println(name+" choose Scissors");break;
            }
            switch(comp_choice){
                case 1:
                    System.out.println("Computer choose Rock");break;
                case 2:
                    System.out.println("Computer choose Paper");break;
                case 3:
                    System.out.println("Computer choose Scissors");break;
            }

            if(num==comp_choice){
                System.out.println("Tie between both..!!");
            }
            else if((num==1 && comp_choice==3) || (num==2 && comp_choice==1) || (num==3 && comp_choice==2)){
                System.out.println(name+" win...!!");
                uWin++;
            }
            else{
                System.out.println("Computer Wins...!!");
                cWin++;
            }
            System.out.println();
            System.out.println();

            i++;
        }
    }
}
