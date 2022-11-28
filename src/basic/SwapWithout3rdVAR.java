package basic;

public class SwapWithout3rdVAR {
    public static void main(String[] args) {
        int a = 20, b = 45;

        System.out.println("Before Swapping values are.."+a+"  "+b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Before Swapping values are.."+a+"  "+b);



    }
}
