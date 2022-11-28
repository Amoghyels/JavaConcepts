package basic;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        findArms(a,b);

    }

    static void findArms(int a, int b){
        for(int i = a; i<=b;i++){
            int num = i;
            int sum = 0;

            while(num>0)
            {
            int rem = num%10;
            sum = sum + (rem*rem*rem);
            num = num/10;
            }

            if(sum == i){
                System.out.println(sum);
            }
        }
    }
}
