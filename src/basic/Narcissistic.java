package basic;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Narcissistic {
    public static void main(String[] args) {
        int leng = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = in.nextInt();
        int t1 = num;

        while (t1 != 0)
        {
            leng = leng+1;
            t1 = t1/10;
        }

        int t2 = num;
        int arm = 0;
        int rem;

        while(t2!= 0)
        {
            int mul = 1;
            rem = t2%10;
            for (int i = 1; i <= leng ; i++)
            {
                mul = mul*rem;
            }
            arm = arm+mul;
            t2 = t2/10;
        }
        if(arm == num)
        {
            System.out.println("Armstrong num");
        }
        else
        {
            System.out.println("Not Armstrong");
        }



}
}