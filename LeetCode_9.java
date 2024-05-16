package LeetCode;
class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int n = s.length();
        int i = 0 , j = n-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}
public class LeetCode_9 {
}
