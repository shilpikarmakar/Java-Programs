import java.util.*;
public class KthBitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        if(((num >> (k-1)) & 1) == 1)
        {
            System.out.println("Bit is Set");
        }
        else
        {
            System.out.println("Bit is not Set");
        }
        sc.close();
    }
}
