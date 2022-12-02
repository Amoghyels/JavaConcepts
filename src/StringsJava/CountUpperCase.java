package StringsJava;

public class CountUpperCase {
    public static void main(String[] args) {

        String s = "EdUcAtIoN iS eVeRyThInG";

        int count  = 0;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c))
                count++;
        }
        System.out.println(count + " Upper");
    }
}
