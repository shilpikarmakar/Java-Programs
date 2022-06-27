import java.util.*;
public class stocksBuyAndSell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in an array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int maxProfit = 0, sum = 0;
        for (int i = 1; i < a.length; i++) {
            if(a[i] > a[i-1])
            {
                sum = a[i] - a[i-1];
                maxProfit += sum;
            }
        }
        System.out.println("Maximum Profit is: " + maxProfit);
        sc.close();
    }
}
