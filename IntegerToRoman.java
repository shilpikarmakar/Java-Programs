import java.util.*;
public class IntegerToRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        String a[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String b[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String c[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String d[] = {"", "M", "MM", "MMM"};
        System.out.println(d[num/1000]+c[num%1000/100]+b[num%100/10]+a[num%10]);        
        sc.close();
    }
}
