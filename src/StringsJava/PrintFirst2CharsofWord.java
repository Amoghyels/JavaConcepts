package StringsJava;

public class PrintFirst2CharsofWord {
    public static void main(String[] args) {
        String s = "My name is amogh";
        String w = "";
        s += " ";
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c != ' ')
                w += c;
            else{
                System.out.println(w.substring(0,2));
                w = "";
            }
        }
    }
}
