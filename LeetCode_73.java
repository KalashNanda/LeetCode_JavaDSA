package LeetCode;
class SetMatrixZeroes {
    public void setZeroes(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        boolean zeroRow = false;
        boolean zeroCol = false;
        // check the 0th row
        for(int j=0;j<n;j++){
            if(arr[0][j]==0){
                zeroRow = true;
                break;
            }
        }
        // check the 0th col
        for(int i=0;i<m;i++){
            if(arr[i][0]==0){
                zeroCol = true;
                break;
            }
        }
        // traverse in the submatrix without 0th row and 0th col
        for(int i = 1;i<m;i++) {
            for (int j = 1; j < n; j++) {
                if(arr[i][j]==0){
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }
        // traverse in the 0th row
        for(int j=1;j<n;j++){
            if(arr[0][j]==0){  // set j th col to 0
                for(int i=1;i<m;i++){
                    arr[i][j] = 0;
                }
            }
        }
        for(int i=1;i<m;i++){
            if(arr[i][0]==0){  // set j th col to 0
                for(int j=1;j<n;j++){
                    arr[i][j] = 0;
                }
            }
        }
        if(zeroRow==true){  // set 0th row to 0
            for(int j=0;j<n;j++){
                arr[0][j] = 0;
            }
        }
        if(zeroCol==true){  // set 0th row to 0
            for(int i=0;i<m;i++){
                arr[i][0] = 0;
            }
        }
    }
}
public class LeetCode_73 {
}
