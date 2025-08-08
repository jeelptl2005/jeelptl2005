package LoopingStatements;

import java.util.Scanner;

public class SumOf1ToN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int sum=0;
        System.out.println("Enter the number: ");
        int num= sc.nextInt();

        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println("Sum is "+sum);
    }
}
