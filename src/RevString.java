import java.util.Scanner;

public class RevString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();


        String rev = "";

        for(int i = s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }

        if(s.equals(rev)){
            System.out.println("Palindrome String");
        }

        else {
            System.out.println("Not a palindrome");
        }





    }
}
