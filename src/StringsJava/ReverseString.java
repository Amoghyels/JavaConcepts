package StringsJava;

public class ReverseString {
    public static void main(String[] args) {
        String s = "racecar";
        String rev = "";

        for(int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            rev = c + rev;
        }
        System.out.println(rev);

        if(s.equalsIgnoreCase(rev))
            System.out.println("Yes it is palindrome");
        else
            System.out.println("Not a plaindrome");

    }
}
