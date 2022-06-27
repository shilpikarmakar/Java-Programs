/**
 * maximum
 */
import java.util.*;
public class maximum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in an array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Original array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        System.out.println();
        System.out.println("Maximum element is: " + max);
        sc.close();
    }
}