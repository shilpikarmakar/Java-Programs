import java.util.*;
public class StringToInteger {
    public static int myAtoi(String s) {
        int index = 0, sign = 1, n = s.length(), r = 0;
        while ((index < n) && (s.charAt(index) == ' ')) {
            index++;
        }
        if ((index < n) && (s.charAt(index) == '+')) {
            sign = 1;
            index++;
        }
        else
        if ((index < n) && (s.charAt(index) == '-')) {
            sign = -1;
            index++;
        }
        while ((index < n) && (Character.isDigit(s.charAt(index)))) {
            int digit = s.charAt(index) - '0';
            if ((r > Integer.MAX_VALUE/10) || (r == Integer.MAX_VALUE/10) || (digit > Integer.MAX_VALUE%10)) {
                return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            r = (10 * r) + digit;
            index++;
        }
        return sign*r;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println(myAtoi(s));
        sc.close();
    }
}
