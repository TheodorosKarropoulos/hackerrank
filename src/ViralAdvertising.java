import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ViralAdvertising {

    static int viralAdvertising(int n) {
        // Complete this function
        int people = 5, result = 0;
        for(int i=1;i<n;i++){
            people = (int) Math.floor(people / 2);
            result += people;
            people *= 3;
        }

         return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = viralAdvertising(n);
        System.out.println(result);
        in.close();
    }
}
