package LoopingStatements;

import java.util.Scanner;

public class Odd1ToN_UsingDoWhile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int i=1;
        System.out.println("Enter the number: ");
        int num= sc.nextInt();

        System.out.print("Odd nums: ");
        do{
            if(i%2!=0){
                System.out.print(i+" ");
            }
            i++;
        }while(i<=num);
    }
}
