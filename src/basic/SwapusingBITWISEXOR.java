package basic;

public class SwapusingBITWISEXOR {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("Before Swapping values are.."+a+"  "+b);

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("Before Swapping values are.."+a+"  "+b);



    }


}
