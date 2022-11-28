package basic;

import java.util.Scanner;

public class nthFibonacci {
    public static void main(String[] args) {
        int n,f1 = 0, f2 = 1, f3;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = in.nextInt();
        System.out.println("The Fibonacci Series is: ");
        if(n == 1)
        {
            System.out.println(f1);
        }
        else if (n == 2)
        {
            System.out.println(f1 + " " + f2);
        }
        else if(n>2)
        {
            System.out.println(f1 + " " +f2);
        }
        for(int i = 3;i<=n;i++)
        {
            f3 = f1+f2;
            System.out.println(f3 + " ");
            f1 = f2;
            f2 = f3;
        }


    }
}
