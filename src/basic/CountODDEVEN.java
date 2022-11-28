package basic;

public class CountODDEVEN {
    public static void main(String[] args) {
        int num = 12345678;
        int countOdd = 0;
        int countEven = 0;

        while(num > 0) {
            num = num/10;
            if(num%2 == 0)
                countEven += 1;
            else
                countOdd += 1;


        }
        System.out.println("The Even Digits are: "+countEven);
        System.out.println("The Odd Digits are: "+countOdd);




    }
}
