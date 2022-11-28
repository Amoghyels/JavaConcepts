import java.util.Scanner;

public class Fproblem2Mul {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();

        System.out.println("Enter the Second Number: ");
        int num2 = in.nextInt();

       int Product =  calcProduct(num1,num2);
        System.out.println(Product);
    }


    static int calcProduct(int x, int y){


        int result = x*y;
        return result;
    }
}
