package LeetCode;
class ReverseInteger {
    public static int pow(int a,int b){    // TC = O(log b)
        if(b==0) return 1;
        int ans = pow(a,b/2);
        if (b%2==0) return ans * ans;
        else return ans * ans * a;
    }
    public int reverse(int k) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        String s = Integer.toString(k);
        int pw = 0;
        long n = 0;
        if(k<0) pw = s.length()-2;
        else pw = s.length()-1;
        while(k!=0){
            n = n + (long)(k%10)*pow(10,pw);
            k /= 10;
            pw--;
        }
        if(n>max || n<min) return 0;
        else return (int)n;
    }
}
public class LeetCode_7 {
}
