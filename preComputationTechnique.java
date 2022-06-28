import java.util.*;
public class preComputationTechnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in an array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int prefixSum[] = new int[a.length];
        prefixSum[0] = a[0];
        for (int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = a[i] + prefixSum[i-1];
        }
        for (int element : prefixSum) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Enter the lower range: ");
        int lower = sc.nextInt();
        System.out.println("Enter the upper range: ");
        int upper = sc.nextInt();
        if(lower == 0)
        {
            System.out.println(prefixSum[upper]);
        }
        else
        {
            System.out.println(prefixSum[upper] - prefixSum[lower]);
        }
        sc.close();
    }
}
