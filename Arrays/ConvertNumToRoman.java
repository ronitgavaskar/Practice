import java.util.HashMap;

public class ConvertNumToRoman {

    public static HashMap<Integer, String> map = new HashMap<>();
    static StringBuilder sb = new StringBuilder();
    public static boolean hasFilled = false;
    public static void fillMap(HashMap<Integer, String> map) {
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");

        hasFilled = true;
    }


    public String intToRoman(int num) {
        if (!hasFilled) {fillMap(map);}

        if(num == 0) {
             return sb.toString();
        }
        else {
            // get length of num
            int len = getLength(num);

            String numStr = Integer.toString(num);
            // get first digit
            addFirstDigit(len, numStr);

            int first = Integer.parseInt(Character.toString(numStr.charAt(0)));
            num = num % (first * (int) Math.pow(10, len - 1));
            return intToRoman(num);
        }
        
    }

    public int getLength(int num) {
        return Integer.toString(num).length();
    }

    public void addFirstDigit(int len, String num) {
        char first = num.charAt(0);
        if (first == '4') {
            // 5 - 1
            sb.append(map.get(1 * (int)Math.pow(10, len - 1)));
            sb.append(map.get(5 * (int)Math.pow(10, len - 1)));
        } else if (first == '9') {
            // 10 - 1
            // 923 = 1000 = 1 x 10^3
            sb.append(map.get(1 * (int)Math.pow(10, len - 1)));
            sb.append(map.get(1 * (int)Math.pow(10, len)));
        } else {
            if (first <= '8' && first > '6') {
                int number = Integer.parseInt(Character.toString(first));
                
                sb.append(map.get(5 * (int)Math.pow(10, len - 1)));

                // number to be appended
                int repeat = number - 5;
                for (int i = 0; i < repeat; i++) {
                    sb.append(map.get(((int)Math.pow(10, len - 1))));
                }
            } else {
                int number = Integer.parseInt(Character.toString(first));
                for (int i = 0; i < number; i++) {
                    sb.append(map.get(((int)Math.pow(10, len - 1))));
                }
            }
        }
    }

    public static void main(String args[]) {

        ConvertNumToRoman s = new ConvertNumToRoman();
        String ret = s.intToRoman(1);
        System.out.println(ret);
        // should return 1
        sb = new StringBuilder(); 

        ret = s.intToRoman(423);
        System.out.println(ret);
        // should return CDXXIII
        sb = new StringBuilder(); 

        ret = s.intToRoman(73);
        System.out.println(ret);
        // should return LXXIII
        sb = new StringBuilder(); 

        ret = s.intToRoman(932);
        System.out.println(ret);
        // CMXXXII
        sb = new StringBuilder(); 

        ret = s.intToRoman(4);
        System.out.println(ret);
        // IV
        sb = new StringBuilder(); 


    }
}