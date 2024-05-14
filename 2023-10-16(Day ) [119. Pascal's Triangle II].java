// #LeetCode 119 Pascal Triangle II

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
}

