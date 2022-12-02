package StringsJava;

import static java.lang.Character.isUpperCase;

public class OnlyUpper {
    public static void main(String[] args) {

        String s = "AmOgH";
        for (int i = 0; i<s.length(); i++){

            char c = s.charAt(i);
            if(Character.isUpperCase(c))
                System.out.println(c);

        }


    }
}
