package StringsJava;

public class CreateStrOnlyUpper {
    public static void main(String[] args) {
        String s = "EdUcAtIoN iS eVeRyThInG";

        String sn = " ";
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if(Character.isUpperCase(c))
                sn = sn + c;
        }
        System.out.print(sn);
    }
}
