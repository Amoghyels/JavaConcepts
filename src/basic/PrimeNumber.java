package basic;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int temp = 0;
        int num = in.nextInt();

        for(int i = 2; i<=num-1;i++)
        {
            if(num%i == 0){
                temp = temp+i;
            }
        }
        if(temp == 0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }




    }
}
