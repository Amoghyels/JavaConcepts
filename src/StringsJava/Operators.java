package StringsJava;
import java.util.ArrayList;
public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));

        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Amogh" + new Integer(69));

        String ans = new Integer(77) + "" + new ArrayList<>();

        System.out.println(ans);
    }
}
