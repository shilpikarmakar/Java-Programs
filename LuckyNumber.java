import java.util.*;
public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter the elements in array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> maxInCol = new ArrayList<>();
        ArrayList<Integer> minInRow = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                min = Math.min(min, arr[i][j]);
            }
            minInRow.add(min);
            min = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                max = Math.max(max, arr[j][i]);
            }
            maxInCol.add(max);
            max = Integer.MIN_VALUE;
        }
        for (int m : minInRow) {
            if(maxInCol.contains(m))
            {
                System.out.println("Lucky Number is: " + m);
            }
        }
        sc.close();
    }
}
