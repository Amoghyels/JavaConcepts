import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
          multiple(3,4,"Amogh");
    }
    static void multiple(int a, int b, String ...v){

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));


    }
}
