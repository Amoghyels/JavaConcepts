package basic;

public class SeconLARGEST {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8};

        int temp;

        for (int i = 0; i < a.length ; i++)
        {
            for (int j = i+1; j <a.length ; j++) {

                if(a[i] < a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }


        }
        System.out.println("Second Largest Element is: "+a[1]);
    }
}
