package basic;

import java.util.Scanner;

public class ReverseNUM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num =  in.nextInt();
        int rem, rev = 0;

        while(num != 0){
            rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        System.out.println(rev);
    }
}
