import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Romannumber {
    public static int getIntegerFromRoman(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0;
        int prev = 0;

        if (!CheckIfValid(s)) {
            return -1;
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            char val = s.charAt(i);
            int curr = map.get(val);

            if (curr < prev) {
                res -= curr;
            } else {
                res += curr;
            }

            prev = curr;
        }
        return res;
    }

    public static boolean CheckIfValid(String str) {
        String regex = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";
        Pattern p = Pattern.compile(regex);
        if (str == null) {
            return false;
        }
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int intValue = getIntegerFromRoman(input);
        if (intValue == -1)
            System.out.println("Invalid Roman Numeral");
        else
            System.out.println("Integer value of " + input + " is " + intValue);
    }
}