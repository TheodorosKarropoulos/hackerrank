import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CaesarCipher {

    static String caesarCipher(String s, int k) {
        // Complete this function
        String result = "";
        for(int i = 0; i < s.length(); i++){
            int ascii = s.charAt(i);
            if(!isLetter(ascii)){
                result += s.charAt(i);
            } else {
                // Capital case letter
                if(s.charAt(i) > 64 && s.charAt(i) < 91) {
                    if((s.charAt(i) + (k % 26)) > 64 && (s.charAt(i) + (k % 26)) < 91)
                        result += (char) (s.charAt(i) + (k % 26));
                    else
                        result += (char) (s.charAt(i) - (26 - (k%26)));
                }
                // Lower case letter
                if(s.charAt(i) > 96 && s.charAt(i) < 123) {
                    if((s.charAt(i) + (k % 26)) > 96 && (s.charAt(i) + (k % 26)) < 123)
                        result += (char) (s.charAt(i) + (k % 26));
                    else
                        result += (char) (s.charAt(i) - (26 - (k%26)));
                }
            }

        }
        return result;
    }

    static boolean isLetter(int ascii) {
        if((ascii < 65) || (ascii > 122) || (ascii > 90 && ascii <97)){
            return false;
        }
        return true;
    }

    static boolean isCapitalCaseLetter(int ascii) {
        if (ascii > 64 && ascii < 91)
            return true;

        return false;
    }

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        //String s = in.next();
        //int k = in.nextInt();
        int n = 100;
        String s = "DNFjxo?b5h*5<LWbgs6?V5{3M].1hG)pv1VWq4(!][DZ3G)riSJ.CmUj9]7Gzl?VyeJ2dIPEW4GYW*scT8(vhu9wCr]q!7eyaoy.";
        int k = 45;
        String result = caesarCipher(s, k);
        System.out.println(result);
        //in.close();
    }

}
