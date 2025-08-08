package Games;

import java.util.Scanner;

public class Timer{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number for countdown: ");
        int n= sc.nextInt();

        for(int i=n;i>=0;i--){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch (Exception e) {
                System.out.println("Time Interpreted");
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\n\nTime's up");
    }
}