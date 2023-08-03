//Missing number in array


BRUTE FORCE::
  

class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        for(int i=1;i<=n+1;i++)  //move the loop for every array element 
        {
            int flag=0;
            for(int j=0;j<n-1;j++)  //run the loop 0 to (array size -1) bcz there are one misssing number
            {
                if(array[j]==i)  //if array element equal to the 1 to n
                {
                    flag=1;  
                    break;
                }
            }
            if(flag==0)return i;   //if the missing number appears then print it
        }
        return -1;
    }
}


Time Complexity:   O(N2), where N = size of the array+1.
Space Complexity:  O(1)  as we are not using any extra space.




BETTER::

class Solution {
    int missingNumber(int array[], int n) {
       int hash[]=new int[n+1];
       for(int i=0;i<n-1;i++)
       {
           hash[array[i]]++;
       }
       for (int j=1;j<=n+1;j++)
       {
           if(hash[j]==0)
           {
               return j;
           }
       }
       return -1;
    }
}

Time Complexity: O(N) + O(N) ~ O(2*N),  where N = size of the array+1.
Space Complexity: O(N), where N = size of the array+1. Here we are using an extra hash array of size N+1.





optimal 1::

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;  //we calculate the sum of the n numbers

        int Sum1 = 0;
        for (int i=0;i<n;i++) {
            Sum1 += nums[i];  
        }

        return sum - Sum1;
    }
}


Time Complexity: O(N), where N = size of array+1.
Reason: Here, we need only 1 loop to get the sum of the array elements. The loop runs for approx. N times. So, the time complexity is O(N).

Space Complexity: O(1) as we are not using any extra space.






OPTIMAL 2::

class Solution {
    int missingNumber(int array[], int n) {
          int x1 = 0, x2 = 0;
        for (int i = 0; i < n-1; i++)
        {
            x1 = x1 ^ array[i];
            x2 = x2 ^ (i + 1);
        }
        x2=x2^n;
        return x1 ^ x2;
    }
}

Time Complexity: O(N), where N = size of array+1.
Reason: Here, we need only 1 loop to calculate the XOR. The loop runs for approx. N times. So, the time complexity is O(N).

Space Complexity: O(1) as we are not using any extra space.