package Games;

import java.util.Random;
import java.util.Scanner;

public class MathQuizGame {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random= new Random();

        int score=0;
        System.out.println("WELCOME TO MATH QUIZ GAME");
        System.out.println();

        for(int i=1;i<=5;i++){
            int n1= random.nextInt(1000)+1;
            int n2= random.nextInt(50)+1;
            int op= random.nextInt(5)+1;

            int correctAns=0;
            String operator= "";

            switch (op){
                case 1:
                    correctAns= n1+n2;operator="+";break;
                case 2:
                    correctAns= n1-n2;operator="-";break;
                case 3:
                    correctAns= n1*n2;operator="*";break;
                case 4:
                    n1=n1*n2;correctAns= n1/n2;operator="/";break;
                case 5:
                    correctAns= n1%n2;operator="%";break;
            }

            System.out.println("Q-"+i+": "+n1+" "+operator+" "+n2+" is how many ?");
            int ans= sc.nextInt();

            if(ans==correctAns){
                System.out.println();
                System.out.println("Correct Answer.");
                score+=5;
                System.out.println("Score: "+score);
            }
            else{
                System.out.println("Wrong answer.");
                score-=2;
                System.out.println("Score: "+score);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("-----------Your total score is "+score+" ----------");
    }
}
