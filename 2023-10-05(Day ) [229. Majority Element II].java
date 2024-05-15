// LeetCode 229 Majority element II (n/3)

import java.util.*;
class Solution {
    // Better approach

    /*
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) > nums.length / 3) {
                ans.add(key);
            }
        }
        return ans;
    }
    */

    // Optimal approach 
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int el1 = 0, cnt1 = 0;
        int el2 = 0, cnt2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (cnt1 == 0 && nums[i] != el2) {
                cnt1 = 1;
                el1 = nums[i];
            } else if (cnt2 == 0 && nums[i] != el1) {
                cnt2 = 1;
                el2 = nums[i];
            } else if (nums[i] == el1) {
                cnt1++;
            } else if (nums[i] == el2) {
                cnt2++;
            } else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == el1) {
                cnt1++;
            } else if (nums[i] == el2) {
                cnt2++;
            }
        }
        if (cnt1 > nums.length / 3) {
            ans.add(el1);
        }
        if (cnt2 > nums.length / 3) {
            ans.add(el2);
        }
        return ans;
    }
}