
//second largest element in an array 

class Solution {
    int print2largest(int arr[], int n) {
        int max=arr[0];
        int smax=-1;
        for (int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                smax=max;
                max=arr[i];
                
            }
            else if(arr[i]>smax  && arr[i]<max)
            {
                smax=arr[i];
                
            }
        }
        return smax;
        
    }
}

//Time Complexity: O(N), Single-pass solution

//Space Complexity: O(1)
