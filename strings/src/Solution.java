import java.util.Arrays;
import java.util.Stack;
//https://leetcode.com/problems/sorting-the-sentence/

class Solution {
    public String sortSentence(String s) {
        String[] string=s.split("");
        String[] sort=new String[string.length];
        for (String words:string) {
            int index=Character.getNumericValue(words.charAt(words.length()-1));
            sort[index]=words.substring(0,words.length()-1);
        }
        return String.join(" ", sort);


    }
}
