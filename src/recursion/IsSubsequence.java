package recursion;

import java.util.ArrayList;
import java.util.List;

// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

// Example 1:

// Input: s = "abc", t = "ahbgdc"
// Output: true
// Example 2:

// Input: s = "axc", t = "ahbgdc"
// Output: false
 

// Constraints:

// 0 <= s.length <= 100
// 0 <= t.length <= 104
// s and t consist only of lowercase English letters.
 

// Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 109, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        String[] tarray = t.split("");
        List<String> sa = new ArrayList<String>();
        List<Boolean> flag = new ArrayList<Boolean>();
        flag.add(false);
        List<Boolean> res = isSub(tarray, s, 0, sa, flag);
        return res.get(0);
    }

    public static List<Boolean> isSub(String[] input, String target, int index, List<String> output, List<Boolean> flag) {
        //boolean flag = false;
        if (input.equals(target)) {
            //flag = true;
            flag.add(0, true);
            return flag;
        }
        String result = output.stream()
            .map(Object::toString)
            .reduce((t, u) -> t + u)
            .orElse("");
        
        if(result.equals(target)) {
            flag.add(0, true);
            return flag;
        }
        if(index >= input.length && !flag.get(0)) {
            flag.add(0, false);;
            return flag;
        }
        output.add(input[index]);
        isSub(input, target, index+1, output, flag);
        if(!flag.get(0)) {
            output.remove(output.size()-1);
            isSub(input, target, index+1, output, flag);
        }
        return flag;      
    }
}

//leet code accepted two pointer solution

class Solution {
    public boolean isSubsequence(String s, String t) {
        //String[] tarray = t.split("");
        return isSub(t, s, false);
    }

    public static boolean isSub(String t, String target, boolean flag) {
        //boolean flag = false;
        if(t.equals(target)) {
            return true;
        }
        if(target.equals("")) {
            return true;
        }
        String[] input = t.split("");
        String[] tArr = target.split("");
        int i = 0;
        int j = 0;
        while(i < input.length && j < tArr.length) {
            if(j == tArr.length-1 && input[i].equals(tArr[j])) {
                flag = true;
                break;
            }
            if(input[i].equals(tArr[j])) {
                i++;
                j++;
            }
            else {
                i++;
            }
            //if()
            
        }
        return flag;
    }
}
