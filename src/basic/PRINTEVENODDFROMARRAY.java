package basic;

public class PRINTEVENODDFROMARRAY {
    public static void main(String[] args) {
        int count = 0;
        int a[] = {1,2,3,4,5,6,7};

        //Extracting even numbers

        System.out.println("The even Numbers in Array.......");
        for (int i = 0; i < a.length ; i++) {
            if(a[i]%2 == 0)
                System.out.println(a[i]);
        }

        System.out.println("The Odd Numbers in Array......");
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2 !=0)
                System.out.println(a[i]);
        }




    }
}
