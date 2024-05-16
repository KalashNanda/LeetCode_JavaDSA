package LeetCode;
class StringCompression {
    public int compress(char[] arr) {
        StringBuilder ans = new StringBuilder("");
        int i=0 ,j=0;
        while(j<arr.length){
            if(arr[j]==arr[i])  j++;
            else{
                ans.append(arr[i]);
                int len = j-i;
                if(len>1) ans.append(len);
                i = j;
            }
        }
        ans.append(arr[i]);
        int len = j-i;
        if(len>1) ans.append(len);
        for(int k=0;k<ans.length();k++){
            arr[k] = ans.charAt(k);
        }
        return ans.length();
    }
}
public class LeetCode_443 {
}
