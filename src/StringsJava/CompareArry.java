package StringsJava;

import java.util.Arrays;

public class CompareArry {
    public static void main(String[] args) {
        char arr1[] = {'A','B','C','D'};
        char arr2[] = {'P','Q','A','D'};



        for(int i = 0; i<arr1.length;i++){
            for(int j = 0; j< arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr2[j]);
                    System.out.print(j);


                }


                }
        }
    }

}

