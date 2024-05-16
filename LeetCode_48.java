package LeetCode;
class RotateImage {
    public void rotate(int[][] a) {
        int m = a.length;
        // transposing
        for(int i=0;i<m;i++){
            for(int j=0;j<=i;j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        // rotate -> reverse each row
        for(int i=0;i<m;i++){
            int x=0 , y=m-1;
            while(x<y){
                int temp = a[i][x];
                a[i][x] = a[i][y];
                a[i][y] = temp;
                x++;
                y--;
            }
        }
    }
}
public class LeetCode_48 {
}
