import java.util.*;
public class SearchInAMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the target element to search: ");
        int target = sc.nextInt();
        int i = 0, j = cols-1;
        while ((i < rows) && (j >= 0)) {
            if(target == matrix[i][j])
            {
                System.out.println("Element found");
                sc.close();
                return;
            }
            else
            {
                if(target > matrix[i][j])
                {
                    i++;
                }
                else
                {
                    if(target < matrix[i][j])
                    {
                        j--;
                    }
                }
            }
        }
        System.out.println("Element not found");
        sc.close();
    }
}
