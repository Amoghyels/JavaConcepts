package StringsJava;

public class SeperateDigitsandStri {
    public static void main(String[] args) {
        String s = "A6m0gh9";

        String d = "", r = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c))
                d = d + c;
            else
                r = r + c;

        }
        String sen = d + r;
        System.out.println(sen);
    }
}