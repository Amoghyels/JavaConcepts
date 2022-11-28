package basic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {
        int min, max, flag = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the min: ");
        min = in.nextInt();

        System.out.println("Enter the max: ");
        max = in.nextInt();

        for(int n = min; n<=max;n++){
            for (int i = 2; i <n ; i++)
            {
             if(n%i == 0)
             {
                 flag = 1;
                 break;
             }

            }
            if(flag == 0)
            {
                System.out.println(n + " ");
            }
            flag = 0;
        }











    }
}
