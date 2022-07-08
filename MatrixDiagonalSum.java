import java.util.Scanner;
public class MatrixDiagonalSum {
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
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if((i == j) || (i+j == matrix[0].length-1))
                {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("Sum is: " + sum);
        sc.close();
    }
}
