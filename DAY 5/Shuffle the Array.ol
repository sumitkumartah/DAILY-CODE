
//Shuffle the Array(Leetcode Easy)

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[nums.length];
        for(int i=0;i<n;i++)
        {
            ans[i*2]=nums[i];
            ans[(i*2)+1]=nums[i+n];

        }
         return ans;
    }
   
}


Time Complexity: O(N)
Space Complexity: O(N)   (We take a new array of N size)
