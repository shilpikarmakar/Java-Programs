import java.util.*;
public class prefixMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in an array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int prefixMax[] = new int[n];
        prefixMax[0] = arr[0];
        for (int i = 1; i < prefixMax.length; i++) {
            prefixMax[i] = Math.max(arr[i], prefixMax[i-1]);
        }
        for (int element : prefixMax) {
            System.out.print(element + " ");
        }
        sc.close();
    }
}