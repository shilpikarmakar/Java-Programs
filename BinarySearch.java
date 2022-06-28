import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in an array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int search = sc.nextInt();
        int low = 0;
        int high = n-1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high)/2;
            if(search == a[mid]){
                System.out.println("Element found at: " + (mid+1));
                sc.close();
                return;
            }
            if(search > a[mid])
            {
                low = mid+1;
            }
            else
            {
                if(search < a[mid])
                {
                    high = mid-1;
                }
            }
        }
        System.out.println("Element not found");
        sc.close();
    }
}
