import java.util.*;
public class SwapUsingXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = sc.nextInt();
        System.out.println("Enter the second number: ");
        int y = sc.nextInt();
        x = x ^ y ^ (y = x);
        System.out.println("The swapped numbers are: " + x + " for x and " + y + " for y");
        sc.close();
    }
}
