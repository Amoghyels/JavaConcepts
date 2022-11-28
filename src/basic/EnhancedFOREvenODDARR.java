package basic;

public class EnhancedFOREvenODDARR {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,12,14,16};

        System.out.println("The even Numbers are: ");

        for(int value:a)
        {
            if(value%2 == 0)
                System.out.println(value);
        }




    }
}
