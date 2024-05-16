package LeetCode;
class Searcha2DMatrixII {
    public boolean searchMatrix(int[][] arr, int target) {
        int m=arr.length , n=arr[0].length;
        int i=0, j=n-1;
        while(i<m && j>=0){
            if(arr[i][j] == target)  return true ;
            else if(arr[i][j] > target)  j--;          // go left
            else i++;    // go down
        }
        return false;
    }
}
public class LeetCode_240 {
}
