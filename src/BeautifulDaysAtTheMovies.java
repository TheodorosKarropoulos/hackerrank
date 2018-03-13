import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class BeautifulDaysAtTheMovies {
    static int beautifulDays(int i, int j, int k) {
        // Complete this function
        int beautiful = 0;
        for(int x = i; x <=j; x++){
            int n = x;
            int reverse = 0;
            while(n!= 0) {
                reverse = reverse * 10;
                reverse = reverse + n % 10;
                n = n / 10;
            }
            if ((double) (x - reverse) / k % 1 == 0) {
                beautiful++;
            }
        }
        return beautiful;
    }

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();*/
        int i = 20, j = 23, k = 6;
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        //in.close();
    }
}
