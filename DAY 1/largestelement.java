
//LArgest element in an array logic


class Compute {
    
    public int largest(int arr[], int n)
    {
        int largest=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>largest)
            {
                largest =arr[i];
            }
        }
        return largest;
    }
}


//TC=O(N)
//SC=O(1)