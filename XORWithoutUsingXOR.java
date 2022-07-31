import java.util.*;
public class XORWithoutUsingXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = sc.nextInt();
        System.out.println("Enter the second number: ");
        int y = sc.nextInt();
        int xbar = ~x;
        int ybar = ~y;
        int answer = (x|y) & (xbar|ybar);
        System.out.println("The answer is : " + answer);
        sc.close();
    }
}
