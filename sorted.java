import java.util.*;
public class sorted {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements: ");
            int n = sc.nextInt();
            int a[] = new int[n];
            System.out.println("Enter the elements in an array: ");
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < a.length-1; i++) {
                if(a[i] > a[i+1])
                {
                    System.out.println("Not sorted");
                    return;
                }
            }
            System.out.println("Sorted");
            sc.close();
        }
    }
}
