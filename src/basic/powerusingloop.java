package basic;

import java.util.Scanner;

public class powerusingloop {
    public static void main(String[] args) {

        int n, p, result = 1;

        System.out.println("Enter No: ");
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        System.out.println("Enter Power: ");
        p = in.nextInt();

        for (int i = 1; i<=p ; i++) {
            result = result*n;
        }
        System.out.println(result);


    }
}
