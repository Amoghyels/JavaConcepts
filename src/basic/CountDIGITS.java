package basic;

public class CountDIGITS {
    public static void main(String[] args) {
        int a = 2334456;
        int sum = 0;

        while(a>0)
        {
            a = a%10;
            sum = sum+a;
        }
        System.out.println("The total number of digits are: "+ sum);


    }
}
