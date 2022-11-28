import java.util.Arrays;
import java.util.Scanner;

public class arrray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


      ////ARRAY OF PRIMITIVES
       /* int[] arr = new int[5];
        arr[0] = 29;
        arr[1] = 28;
        arr[2] = 27;
        arr[3] = 26;
        arr[4] = 25;
        System.out.println(arr[3]);
        
        //Input using for loop

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+ " ");*/


        String [] str = new String[5];
        for(int i = 0; i<str.length;i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        str[1] = "Amogh";

        System.out.println(Arrays.toString(str));






        }

    }

