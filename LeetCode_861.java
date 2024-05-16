package LeetCode;
class ScoreAfterFlippingMatrix {
    public int matrixScore(int[][] b) {
        int m = b.length , n = b[0].length;
        // put 1 at 0th position of every row
        for(int i=0;i<m;i++){
            if(b[i][0]==0){
                for(int j=0;j<n;j++){
                    if(b[i][j]==0) b[i][j] = 1;
                    else b[i][j] = 0;
                }
            }
        }
        // flip those columns where (no. of 0s > no. of 1s)
        for(int j=1;j<n;j++){
            int zero = 0 , one = 0;
            for(int i=0;i<m;i++){
                if(b[i][j]==0)  zero++;
                else  one++;
            }
            if(zero>one){
                for(int i=0;i<m;i++){
                    if(b[i][j]==0) b[i][j] = 1;
                    else b[i][j] = 0;
                }
            }
        }

        // calculating the score
        int score = 0;
        int x = 1;
        for(int k=n-1;k>=0;k--){
            for(int i = 0;i<m;i++){
                score += b[i][k]*x;
            }
            x*=2;
        }
        return score;
    }
}

public class LeetCode_861 {
}
