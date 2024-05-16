package LeetCode;
class TransposeMatrix {
    public int[][] transpose(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] transpose = new int[n][m];
        for(int i = 0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
        return transpose;
    }
}
public class LeetCode_867 {
}
