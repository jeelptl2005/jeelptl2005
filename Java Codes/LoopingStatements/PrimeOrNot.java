package LoopingStatements;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int count=0;
        System.out.println("Enter the number: ");
        int num= sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(num%i==0){
                    count++;
                }
            }
        }
        if(count==2){
            for(int k=1;k<=num;k++){
                System.out.println(k);
            }
        }
    }
}
