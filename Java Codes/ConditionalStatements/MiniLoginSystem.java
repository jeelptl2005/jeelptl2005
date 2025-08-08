package ConditionalStatements;

import java.util.Scanner;

public class MiniLoginSystem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String stored_username="";
        String stored_password="";
        boolean account_created= false;
        int op=0;
        String new_password="";

        while(true){
            System.out.print("0. Exit\n1. Create account\n2. Login\n3. Forgot Password\n");
            System.out.println();
            System.out.println("Enter the option: ");
            op= sc.nextInt();

            if(op==1){
                System.out.println("Create username: ");
                stored_username= sc.nextLine();
                sc.nextLine();
                System.out.println("Create password: ");
                stored_password= sc.nextLine();
                account_created= true;
                System.out.println();
                System.out.println("Account created successfully");
            }
            else if(op==2){
                if(!(account_created)){
                    System.out.println();
                    System.out.println("No account found, you have to create first.");
                }
                else{
                    System.out.println("Enter username: ");
                    String input_username= sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter password: ");
                    String input_password= sc.nextLine();
                    if(input_username.equals(stored_username) && input_password.equals(stored_password)){
                        System.out.println();
                        System.out.println("Login Successfully.");
                    }
                    else{
                        System.out.println();
                        System.out.println("Incorrect username or password.\nTry again.");
                    }
                }
            }
            else if(op==3){
                if(!(account_created)){
                    System.out.println();
                    System.out.println("No account found, you have to create first.");
                }
                else{
                    System.out.println("Enter username: ");
                    String input2_username= sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter old password: ");
                    String input2_password= sc.nextLine();
                    if(input2_password.equals(stored_password)) {
                        System.out.println("Enter new password: ");
                        new_password= sc.nextLine();
                        stored_password=new_password;
                        System.out.println();
                        System.out.println("Password changed.");
                    }
                    else{
                        System.out.println();System.out.println("Incorrect old password.");
                    }
                }
            }

            System.out.println();
            if(op==0){
                break;
            }
        }
    }
}
