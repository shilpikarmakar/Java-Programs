import java.util.*;
public class PrintPallindromeString {
    static boolean isPallindrome(String str)
    {
        int i = 0;
        int j = str.length()-1;
        while(i < j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                String temp = str.substring(i, j);
                if(isPallindrome(temp))
                {
                    System.out.println("Pallindrome: " + temp);
                }
            }
        }
        sc.close();
    }
}
