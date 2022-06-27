import java.util.*;
public class missingno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in an array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        int sum = 0, sum1 = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        for (int i = 0; i < a.length; i++) {
            sum1 += a[i];
        }
        System.out.println("The missing number is: " + (sum-sum1));
        sc.close();
    }
}
