import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //    && = (AND) Both Conditions must be True
        //    || = (OR) Either conditions must be True
        //    ! = (Not) reverse boolean value of Condition



        int temp = in.nextInt();
        if(temp > 30){
            System.out.println("It is hot outside");
        }

        else if(temp>=20 && temp<=30){
            System.out.println("It is warm outside");
        }

        else{
            System.out.println("It is cold outside");
        }



    }

}
