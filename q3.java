//Q3. Given a 2D array of n rows and m columns, return the sum of elements along the range of row and
//column specified.
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int m = 3;

        int[][] mat = new int[n][m];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int r1 = 0;
        int r2 = 2;
        int c1 = 1;
        int c2 = 2;
        int sum = 0;
        while (r1 <= r2) {
            int j = c1; // Start column index for each row
            while (j <= c2) {
                sum += mat[r1][j];
                j++; // Increment column index
            }
            r1++;
            c1 = 1; // Reset column index for the next row
        }
        System.out.println("Sum of submatrix: " + sum);
    }
}
