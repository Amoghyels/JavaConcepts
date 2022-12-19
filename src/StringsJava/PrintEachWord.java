package StringsJava;

public class PrintEachWord {
    public static void main(String[] args) {
        String s = "Hi my name is Amogh";

        String w = ""; s += " ";
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c != ' ')
                w += c;
            else{
                System.out.println(w);
                w = "";
            }

        }
    }
}
