import java.util.*;
public class SlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in an array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k = sc.nextInt();
        int subArrayCount = 0;
        for (int i = 0; i < k; i++) {
            subArrayCount++;
        }
        for (int i = k; i <= a.length-k; i++) {
            subArrayCount++;
        }
        System.out.println("The number of sub arrays are: " + subArrayCount);
        int sum = 0;
        System.out.println("The different sums are: ");
        for (int i = 0; i < k; i++) {
            sum += a[i];
        }
        System.out.println(sum);
        for (int i = k; i < a.length; i++) {
            sum = sum - a[i-k] + a[i];
            System.out.println(sum);
        }
        sc.close();
    }
}
