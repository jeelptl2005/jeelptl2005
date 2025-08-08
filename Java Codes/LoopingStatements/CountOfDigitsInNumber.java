package LoopingStatements;

import java.util.Scanner;

public class CountOfDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int count=0;
        System.out.println("Enter any integer: ");
        int n= sc.nextInt();

        int temp= Math.abs(n);
        if(temp==0){
            count=1;
        }
        else{
            while(temp>0){
                temp= temp/10;
                count++;
            }
        }
        System.out.println("Number of digits: "+count);
    }
}
