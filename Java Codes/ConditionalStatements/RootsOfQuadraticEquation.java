package ConditionalStatements;

import java.util.Scanner;

public class RootsOfQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the value of a,b and c: ");
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();

        double D= (b*b)-(4*a*c);
        double m= Math.sqrt(D);

        if(D>0){
            System.out.println("Quadratic equation have 2 real and distinct roots.");
            double root1= (-b + m)/(2*a);
            double root2= (-b - m)/(2*a);
            System.out.println();
            System.out.printf("Root1 is %.2f and Root2 is %.2f",root1,root2);
        }
        else if(D==0){
            System.out.println("Quadratic equation have 2 real and same roots.");
            double root= (-b)/(2*a);
            System.out.println();
            System.out.printf("Root1 and Root2 is %.2f",root);
        }
        else{
            System.out.println();
            System.out.println("No real roots are there.");
        }
    }
}
