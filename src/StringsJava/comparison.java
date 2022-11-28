package StringsJava;

public class comparison {
    public static void main(String[] args) {
       /* String a = "Amogh";
        String b = "amogh";
        System.out.println(a == b); */

        String name1 = new String("Amogh");
        String name2 = new String("Amogh");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
    }
}
