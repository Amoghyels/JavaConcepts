package basic;

public class SwapThirdVar {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("Before Swapping values are.."+a+"  "+b);

        int t = a;
        a = b;
        b = t;
        System.out.println("After Swapping values are.."+a+"  "+b);
    }
}
