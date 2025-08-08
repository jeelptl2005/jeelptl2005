package LoopingStatements;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int sum=0;
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        System.out.print("Even numbers are: ");
        for(int i=1;i<=num;i++){
            if(i%2==0){
                System.out.print(i+" ");
                sum+=i;
            }
        }
        System.out.println();
        System.out.println("Sum is "+sum);
    }
}
