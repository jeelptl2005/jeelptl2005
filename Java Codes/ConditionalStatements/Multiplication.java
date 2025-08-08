package ConditionalStatements;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num= sc.nextInt();
        System.out.println("Enter the iteration: ");
        int it= sc.nextInt();

        for(int i=1;i<=it;i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
