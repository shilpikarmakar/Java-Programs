import java.util.*;
public class LongestSubstring {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str = sc.next();
    int i = 0, j = 0, max = 0;
    int hashset[] = new int[128];
    while (j < str.length()) {
        char singleChar = str.charAt(j);
        hashset[singleChar]++;
        while (hashset[singleChar] > 1) {
            char leftChar = str.charAt(i);
            hashset[leftChar]--;
            i++;
        }
        max = Math.max(max, j-i+1);
        j++;
    }
    System.out.println(max);
    sc.close();
}    
}
