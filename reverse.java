//Given a 2D array for n rows and m columns, reverse each row.
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
        for (int i = 0; i < n; i++) {
            int a = 0;
            int b = m - 1;
            while (a < b) {
                int tmp = mat[i][a];
                mat[i][a] = mat[i][b];
                mat[i][b] = tmp;
                a++;
                b--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
