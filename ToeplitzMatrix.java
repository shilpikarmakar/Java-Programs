import java.util.*;
public class ToeplitzMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter elements in an array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((i < n-1) && (j < n-1) && (arr[i][j] != arr[i+1][j+1]))
                {
                    System.out.println("Not Toeplitz");
                    sc.close();
                    return;
                }
            }
        }
        System.out.println("Toeplitz Matrix");
        sc.close();
    }
}
