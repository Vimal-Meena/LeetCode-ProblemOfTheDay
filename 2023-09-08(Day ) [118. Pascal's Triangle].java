// #LeetCode 118 Pascal Triangle
import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        double ansFill = 1;
        for (int i = 1; i <= rowIndex + 1; i++) {
            ans.add((int) ansFill);
            ansFill *= (rowIndex - i + 1);
            ansFill = ansFill / i;
        }
        return ans;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ans.add(getRow(i));
        }
        return ans;
    }
}