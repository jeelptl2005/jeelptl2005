package ConditionalStatements;

import java.util.Scanner;

public class MaxOf3Numbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the three numbers: ");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();

        if(n1>n2){
            if(n1>n3){
                System.out.println(n1 + " is Maximum");
            }
            else{
                System.out.println(n3 + " is Maximum");
            }
        }
        else{
            if(n2>n3){
                System.out.println(n2 + " is Maximum");
            }
            else{
                System.out.println(n3 + " is Maximum");
            }
        }
    }
}
