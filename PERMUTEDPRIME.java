package infosis.python;
import java.util.ArrayList;
import java.util.Collections;
public class PERMUTEDPRIME {
    public static void main(String[] args) {
        String str = "YDEAS";
        int space=3;
        ArrayList<String> ls = new ArrayList<>();
        for (int i = 0; i < Math.pow(str.length(), 3); i++) {
            String s = String.format("%"+space+"s", Integer.toString(i, str.length())).replaceAll(" ", "0");
            System.out.println(s);
            String out = "";
            String out1 = "";
            for (int j = 0; j < s.length(); j++) {
                int k = Integer.parseInt(s.charAt(j) + "");
                out += (int) str.charAt(k);
                out1 += str.charAt(k);
            }
            int var = Integer.parseInt(out);
            if (isprime(var)) {
                ls.add(out1);
            }
        }
        Collections.sort(ls);
        System.out.println(ls);
    }
    private static boolean isprime(int var) {
        if (var == 1 || var == 0)
            return false;
        if (var == 2)
            return true;
        for (int i = 3; i <= Math.sqrt(var); i += 2) {
            if (var % i == 0)
                return false;
        }
        return true;
    }
}