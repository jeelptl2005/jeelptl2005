package ConditionalStatements;

import java.util.Scanner;

public class CharacterIsUpperOrLowerCase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the character: ");
        char ch= sc.next().charAt(0);

        if(ch == Character.toUpperCase(ch)){
            System.out.println(ch + " is in Uppercase.");
        }
        else{
            System.out.println(ch + " is in Lowercase.");
        }
    }
}
