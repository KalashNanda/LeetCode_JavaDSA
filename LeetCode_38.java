package LeetCode;
class CountandSay {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String s = countAndSay(n-1) + "@";
        String ans = "";
        int i=0 , j=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                j++;
            }
            else{
                int len = j-i;
                ans += len;
                ans += s.charAt(i);
                i=j;
            }
        }
        // int len = j-i;
        // ans += len;
        // ans += s.charAt(i);
        // i=j;
        return ans;
    }
}
public class LeetCode_38 {
}
