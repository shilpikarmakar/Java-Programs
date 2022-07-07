import java.util.*;
public class ReverseWordsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        str = str.trim();
        String b[] = str.split("\\s+");
        int i = 0;
        int j = b.length-1;
        while (i < j) {
            String temp = b[i];
            b[i] = b[j];
            b[j] = temp;
            i++;
            j--;
        }
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < b.length; k++) {
            if(k != b.length-1)
            {
                sb.append(b[k] + " ");
            }
            else
            {
                sb.append(b[k]);
            }
        }
        String c = sb.toString();
        System.out.println("The reversed String is: " + c);
        sc.close();
    }
}
