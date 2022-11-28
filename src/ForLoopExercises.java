
import java.util.Scanner;

public class ForLoopExercises {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//////////Print DONE when sum ==  100//////////////////////////

        System.out.println("Enter the number: ");
        int n = s.nextInt();

        int sum = 0;
        for(int i = 1; i<= n/2; i++)
            if(n%i == 0)
                  System.out.println(i + " ");

     //   System.out.println(sum);




    }
}








