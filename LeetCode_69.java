package LeetCode;
class Sqrt{
    public int mySqrt(int x) {
        long lo = 0 , hi = (long)x;
        while(lo<=hi){
            long mid = lo + (hi-lo)/2;
            long y = mid*mid;
            if(y==(long)x) return(int)mid;
            else if (y>(long)x)  hi = mid-1;
            else  lo = mid +1;
        }
        return (int)hi;
    }
}
public class LeetCode_69 {
}
