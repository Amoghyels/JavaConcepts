import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

      /*  list.add(677);
        list.add(675);
        list.add(674);
        list.add(673);
        list.add(672);
        list.add(671);

        System.out.println(list);
        list.set(0,99);
        System.out.println(list);*/
        //input
        for (int i = 0; i < 5 ; i++) {
            list.add(in.nextInt());
        }

        //Get Item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); //pass Index here, List[index] will not work here
        }

        System.out.println(list);


    }
}
