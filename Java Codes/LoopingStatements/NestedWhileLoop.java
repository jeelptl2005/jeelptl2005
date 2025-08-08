package LoopingStatements;

public class NestedWhileLoop {
    public static void main(String[] args) {
        int i=1;
        while(i<=10){
            System.out.println("Hii");
            int j=1;
            while(j<=2){
                System.out.println("Hello");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
