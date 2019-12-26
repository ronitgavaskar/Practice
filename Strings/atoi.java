import java.math.BigInteger;

public class atoi {

    static boolean isNegative = false;
    
    public int myAtoi(String str) {
        str = str.trim();

        boolean valid = isValid(str);
        String firstNumString = firstNum(str);

        if (!valid || firstNumString.equals("0")) return 0;
        String s = Integer.toString(Integer.MAX_VALUE);
        BigInteger maxBI = new BigInteger(s);
        
        BigInteger value = new BigInteger(firstNumString);

        if (isNegative) {
            if(value.compareTo(maxBI) >= 0) {
                return Integer.MIN_VALUE;
            } else {
                return 0 - value.intValue();
            }
        } else {
            if(value.compareTo(maxBI) >= 0) {
                return Integer.MAX_VALUE;
            } else {
                return value.intValue();
            }
        }
    }

    public boolean isValid(String s) {
        if (s.charAt(0) == '-') {
            isNegative = true;
            return true;
        } else if (s.charAt(0) == '+') {
            isNegative = false;
            return true;
        } else if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
            isNegative = false;
            return true;
        }
        return false;
    }

    public String firstNum(String s) {
        if (isNegative) {
            return s.split(" ")[0].substring(1);
        } else {
            String first = s.split(" ")[0];
            if (first.charAt(0) == '+') {
                return s.split(" ")[0].substring(1);
            }
            return s.split(" ")[0];
        }
    }

    public static void main(String args[]) {
        atoi s = new atoi();
        System.out.println(s.myAtoi("-123"));
        // should return -123

        System.out.println(s.myAtoi("+124 "));
        // should return 124

        System.out.println(s.myAtoi("124 "));
        // should return 124;

        System.out.println(s.myAtoi("-12454645478 "));
        // should return Integer.MIN;


        System.out.println(s.myAtoi("12454645478 "));
        // should return Integer.MAX;



    }

}