import java.util.HashSet;
import java.util.Scanner;

public class Pangram {
    public static boolean isPangram(String s) {
        HashSet<Character> set = new HashSet<>();
        String ns = s.toLowerCase();
        for (int i = 0; i < ns.length(); i++) {
            char val = ns.charAt(i);
            if (set.contains(val)) {
                set.remove(val);
            } else {
                set.add(val);
            }
        }
        return set.size() == 26;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean check = isPangram(input);
        if (check == false)
            System.out.println("Given String is Not an Pangram");
        else
            System.out.println("Given String is an Pangram");
    }
}