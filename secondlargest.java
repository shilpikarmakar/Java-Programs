import java.util.*;
public class secondlargest {
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
        int secondLargest = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > max)
            {
                secondLargest = max;
                max = a[i];
            }
            if(a[i] != max)
            {
                if(a[i] > secondLargest)
                {
                    secondLargest = a[i];
                }
            }
        }
        System.out.println("Second Largest element is: " + secondLargest);
        sc.close();
    }
}
