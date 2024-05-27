public class MinRowsCreated {

    public static int minNumberOfRows(int[] A) {
        int n = A.length;
        int rows = 1;
        int maxInRow = A[0];

        for (int i = 1; i < n; i++) {
            if (A[i] > maxInRow) {
                rows++;
                maxInRow = A[i];
            } else {
                maxInRow = Math.max(maxInRow, A[i]);
            }
        }

        return rows;
    }

    public static void main(String[] args) {
        int[] A = {5, 4, 3, 6, 1};
        int rows = minNumberOfRows(A);
        System.out.println("Minimum number of rows: " + rows);
    }
}
