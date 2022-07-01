import java.util.*;
public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        int i = 0, j = str.length()-1;
        while(i < j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                System.out.println("Not Pallindrome");
                sc.close();
                return;
            }
            i++;
            j--;
        }
        System.out.println("It is a Pallindrome String");
        sc.close();
    }
}
