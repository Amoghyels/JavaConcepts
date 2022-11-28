import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //Find the largest of three numbers

     /*   if(a>b & a>c){
            System.out.println("a is the largest");
        }

        if(b>a & b>c) {
            System.out.println("b is the largest");
        }

        if(c>b & c>a) {
            System.out.println("c is the largest");
        }*/

        //Kunal's Solution

        int max = a;
        if(b>max) {
            max = b;
        }

        if(c>max){
            max = c;
        }

        System.out.print(max);





    }



}
