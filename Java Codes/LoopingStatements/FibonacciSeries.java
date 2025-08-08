
//Fibonacci Series

package LoopingStatements;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int first= 0, second= 1;
        System.out.println("Enter the terms: ");
        int n= sc.nextInt();

        for (int i=1;i<=n;i++){
            System.out.print(first+" ");

            int temp= first+second;
            first=second;
            second=temp;

        }
    }
}
