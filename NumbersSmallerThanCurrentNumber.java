import java.util.*;
public class NumbersSmallerThanCurrentNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in an array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int b[] = new int[n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < b.length; j++) {
                if(arr[i] > arr[j])
                {
                    c++;
                }
            }
            b[i] = c;
            c = 0;
        }
        System.out.println("The final array is: ");
        for (int element : b) {
            System.out.print(element + " ");
        }
        sc.close();
    }
}
