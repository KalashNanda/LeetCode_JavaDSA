package LeetCode;

import java.util.ArrayList;
import java.util.List;

class Subsets {
    static List<List<Integer>> arr;
    public static void printSubsets(int i, int[] s, ArrayList<Integer> ans){
        if(i==s.length){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<ans.size();j++){
                list.add(ans.get(j));
            }
            arr.add(list);
            return;
        }
        printSubsets(i+1,s,ans);
        ans.add(s[i]);
        printSubsets(i+1,s,ans);
        ans.remove(ans.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        printSubsets(0,nums,ans);
        return arr;
    }
}
public class LeetCode_78 {
}
