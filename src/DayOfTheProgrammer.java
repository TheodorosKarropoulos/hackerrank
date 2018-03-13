import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DayOfTheProgrammer {
    static String solve(int year){
        // Complete this function
        if (year == 1918)
            return "26.09.1918";
        if(isLeap(year))
            return 256 - 244 + ".09." + year;

        return 256 - 243 + ".09." + year;
    }

    static boolean isLeap(int year) {
        if(year < 1918 && year % 4 == 0)
            return true;
        if(year % 100 != 0 && year % 4 == 0 || year % 400 == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
