import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinimumDistances {
    static int minimumDistances(int[] a) {
        // Complete this function
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int minimum = a.length;
        for(int i = 0; i < a.length; i++){
            if(hashMap.containsKey(a[i])) {
                if(Math.abs(i - hashMap.get(a[i])) < minimum) {
                    minimum = Math.abs(i - hashMap.get(a[i]));
                }
            } else {
                hashMap.put(a[i], i);
            }
        }
        return minimum = (minimum == a.length) ? -1 : minimum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = minimumDistances(a);
        System.out.println(result);
        in.close();
    }
}
