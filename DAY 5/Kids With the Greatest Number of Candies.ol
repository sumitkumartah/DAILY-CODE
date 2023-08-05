1431. Kids With the Greatest Number of Candies  (leetcode easy)


import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxi = 0;
        List<Boolean> result = new ArrayList<Boolean>();

        // Find the maximum number of candies among all kids
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > maxi) {
                maxi = candies[i];
            }
        }

        // Check if each kid can have the greatest number of candies
        for (int i = 0; i < candies.length; i++) {
            int sum = candies[i] + extraCandies;
            if (sum >= maxi) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
