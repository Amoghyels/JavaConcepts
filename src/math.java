import java.util.Scanner;

public class math {
    public static void main(String[] args) {

        double x;
        double y;
        double z;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the side x: ");
        x = in.nextDouble();
        System.out.println("Enter the side y: ");
        y = in.nextDouble();

        z = Math.sqrt((x*x) + (y*y));

        System.out.println("The Hypotenuse is: "+ z);



    }
}
