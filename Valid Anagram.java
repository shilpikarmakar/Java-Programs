import java.util.*;
public class ValidAnagram {
    public static boolean isAnagram(String str, String str1)
    {
        String a[] = str.split("");
        Arrays.sort(a);
        String b[] = str1.split("");
        Arrays.sort(b);
        if (a.length == b.length) {
            for (int i = 0; i < b.length; i++) {
                if(a[i].compareTo(b[i]) != 0)
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str = sc.next();
        System.out.println("Enter the second string: ");
        String str1 = sc.next();
        System.out.println(isAnagram(str, str1));
        sc.close();
    }
}
