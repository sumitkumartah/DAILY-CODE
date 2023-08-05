//Build Array from Permutation  (Leetcode easy)


class Solution {
    public int[] buildArray(int[] nums) {
        int []ans=new int [nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[nums[i]];

        }
        return ans;
        
    }
}

Time Complexity: O(N)
  Space Complexity: O(N) 
