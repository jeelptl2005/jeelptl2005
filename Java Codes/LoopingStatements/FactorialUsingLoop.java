package LoopingStatements;

import java.util.Scanner;

public class FactorialUsingLoop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int mul=1;
        System.out.println("Enter the number for the factorial: ");
        int num= sc.nextInt();

        for(int i=num;i>=1;i--){
            mul*=i;
        }
        System.out.println("Factorial of "+num+" is "+mul);
    }
}
