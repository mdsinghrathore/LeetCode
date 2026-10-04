class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int a = 0;
        int b = m * n - 1;
        while (a <= b) {
            int c = (a + b) / 2;
            int row = c / n;
            int col = c % n;
            if (matrix[row][col] == target) {
                return true;
            }
            else if (matrix[row][col] < target) {
                a = c + 1;
            }
            else {
                b = c - 1;
            }
        }
        return false;
    }
}