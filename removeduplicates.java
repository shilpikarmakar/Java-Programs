import java.util.*;
public class removeduplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements in an array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[j] != a[i])
            {
                j++;
                a[j] = a[i];
            }
        }
        System.out.println("The distinct numbers are: " + (j+1));
        sc.close();
    }
}
