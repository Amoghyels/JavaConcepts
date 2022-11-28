import java.util.Scanner;

public class FProblem1 {
    public static void main(String[] args) {
        int num,s, rem,temp;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any Number ");
        num = in.nextInt();

        temp = num;
        for( s = 0; num>0;num/=10){
            rem = num%10;
            s = (s*10)+rem;
        }

        if(s==temp)
            System.out.println(temp+" Is a Palindrome ");
        else
            System.out.println(temp+"Is not a palindrome");


    }

}
