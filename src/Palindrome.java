import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        int[] a = {1,1,2,3,4};
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i =0 ; i< a.length; i++) {
            set.add(a[i]);
            map.put(a[i], a[i]);
        }
        System.out.println(set);
        System.out.println(map);

        //java 8
        int[] uniq = Arrays.stream(a).distinct().toArray();
        for (int i =0 ; i< uniq.length; i++) {
            System.out.print(uniq[i]);
        }
    }
}
