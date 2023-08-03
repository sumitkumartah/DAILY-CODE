//Check array is sorted or not in gfg
class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        // code here
       for (int i = 0; i < n-1; i++){
            if(arr[i] > arr[i + 1] ){
                return false;
            }
        }
        return true;
    
    }
}

//Time Complexity: O(N)

//Space Complexity: O(1)
