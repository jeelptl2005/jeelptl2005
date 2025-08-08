package Games;

import java.util.Random;
import java.util.Scanner;

public class MultiplicationTableQuiz {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random= new Random();

        int score=0;

        int num= random.nextInt(20)+1;
        System.out.println();
        System.out.println("How many questions you want : ");
        int ite= sc.nextInt();

        for(int i=1;i<=ite;i++){
            int n= random.nextInt(10)+1;
            int correctAns= num*n;
            System.out.println("Ques-"+i+": "+num+" * "+n+" is how many ?");
            int userInp= sc.nextInt();
            System.out.println();
            if(userInp==correctAns){
                System.out.println("CORRECT ANSWER");
                score+=4;
            }
            else{
                System.out.println("INCORRECT ANSWER");
                score-=2;
            }
        }
        System.out.println();
        System.out.println("---------- YOUR SCORE IS "+score+" ----------");
    }
}
