package LoopingStatements;

public class EvenBetween1And50UsingWhile {
    public static void main(String[] args) {
        int i=1;
        while(i<=50){
            if(i%2==0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
