// #LeetCode 169 Majority Element (n/2)
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int ans = 0;
        // if majority element exist then count should not goes to zero [if that element
        // is ans] and checking is also not require.
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count = 1;
                ans = nums[i];
            } else if (nums[i] == ans) {
                count++;
            } else {
                count--;
            }
        }
        return ans;
    }
}