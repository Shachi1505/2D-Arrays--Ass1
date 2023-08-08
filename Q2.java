 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimensions");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n * m];
        int[][] mat = new int[n][m];
        System.out.println("Enter elements");
        // Input of 1D
        for (int i = 0; i < m * n; i++) {
            arr[i] = sc.nextInt();
        }
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = arr[idx];
                idx++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }

            System.out.println();
        }
    }
