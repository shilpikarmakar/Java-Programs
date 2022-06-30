import java.util.*;
public class RotateArray {
    static void reverse(int arr[], int i, int j)
    {
        while(i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements: ");
        int n =sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in an array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();
        k = k % n;
        if(k < 0)
        {
            k = a.length + k;
        }
        reverse(a, 0, a.length-k-1);
        reverse(a, a.length-k, a.length-1);
        reverse(a, 0, a.length-1);
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
        sc.close();
    }
}
