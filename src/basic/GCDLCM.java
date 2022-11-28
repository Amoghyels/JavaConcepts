package basic;

import java.util.Scanner;

public class GCDLCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int GCD = 1;
        for (int i = 1; i <=num1 ; i++) {
            if(num1%i == 0 && num2%i == 0)
                GCD = i;
        }
        System.out.println("GCD is: "+GCD);
    }
}
