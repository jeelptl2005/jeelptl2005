package LoopingStatements;

import java.util.Scanner;

public class Multiplication3x3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int[][]  A= new int[3][3];
        System.out.println("Enter the A matrix element: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                A[i][j]=sc.nextInt();
            }
        }

        int[][]  B= new int[3][3];
        System.out.println("Enter the B matrix element: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                B[i][j]=sc.nextInt();
            }
        }

        int[][] result= new int[3][3];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                result[i][j]=0;
                for (int k=0;k<3;k++){
                    result[i][j]+=A[i][k]*B[k][j];
                }
            }
        }

        System.out.println("Multiplied matrix: ");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(result[i][j]+"\t");;
            }
            System.out.println();
        }
    }
}
