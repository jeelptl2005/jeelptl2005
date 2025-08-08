package ConditionalStatements;

import java.util.Scanner;

public class AscendingOf3Nums {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int smallest,middle,largest;

        System.out.println("Enter the three numbers: ");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();

        if(n1<n2 && n1<n3){
            smallest=n1;
            if(n2<n3){
                middle= n2;
                largest= n3;
            }
            else{
                middle= n3;
                largest=n2;
            }
        }

        else if(n2<n3 && n2<n1){
            smallest=n2;
            if(n3<n1){
                middle= n3;
                largest= n1;
            }
            else{
                middle= n1;
                largest=n3;
            }
        }

        else{
            smallest=n3;
            if(n1<n2){
                middle= n1;
                largest= n2;
            }
            else{
                middle= n2;
                largest=n1;
            }
        }
        System.out.println("Sorted elements: "+smallest+" "+middle+" "+largest);
    }
}
