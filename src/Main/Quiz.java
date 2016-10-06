package Main;

import java.math.BigInteger;

/**
 * Created by user on 05.10.2016.
 */
public class Quiz {
    public static void main(String[] args) throws Exception {
        System.out.println(factorial(3));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        if(a1.length == 0) {
            return a2;
        } else if(a2.length==0) {
            return a1;
        }
        int[] result = new int[a1.length+a2.length];
        int i = 0;
        int a1Board = 0;
        int a2Board = 0;
        while (i < result.length) {
            result[i] = a1[a1Board] < a2[a2Board] ? a1[a1Board++] : a2[a2Board++];
            if (a1Board == a1.length) {
                System.arraycopy(a2, a2Board, result, ++i, a2.length - a2Board);
                break;
            }
            if (a2Board == a2.length) {
                System.arraycopy(a1, a1Board, result, ++i, a1.length - a1Board);
                break;
            }
            i++;
        }
        return result; // your implementation here
    }
    public static BigInteger factorial(int value) {
        if (value==1) {
            BigInteger one = BigInteger.valueOf(1);
            return one;
        }
        return factorial(value-1).multiply(BigInteger.valueOf(value));
    }
    public static boolean isPalindrome(String text) {
        String first = (text.replaceAll("[^a-zA-ZА-Яа-я]","").toLowerCase());
        StringBuilder rev = new StringBuilder(first);
        String second = rev.reverse().toString();
        return first.equals(second);
    }
    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value))==1;
    }
    public static char charExpression(int a) {
        return (char) ('\\'+a);
    }
    public static int flipBit(int value, int bitIndex) {
        return value ^ (1 << bitIndex-1);
    }
    public static boolean math(double a, double b, double c) {
       return  (Math.abs((a + b) - c) <= 1E-4);
    }
    public static int leapYearCount(int year) {
        int result = year/4;
        int noRes = year/100;
        int big = year/400;
        return result-noRes+big;
    }
    public static int grig(int year) {
        int result = 0;
        if (year < 1) {
            return 0;
        }
        result = grig(year-1);
        if (year%400==0) {
            result++;
            return result;
        }
        if (year%4==0&&year%100!=0){
            result++;
            return result;
        }

        return  result;

    }
    public static boolean four(boolean a, boolean b, boolean c, boolean d){
        Boolean arg[] = {a,b,c,d};
        int numbOfBoolean = 0;
        for(boolean boo: arg) {
            if (b) {
                numbOfBoolean++;
            }
        }
        return numbOfBoolean==2;
    }
}


