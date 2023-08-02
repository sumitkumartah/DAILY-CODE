//passing array in methods

class A
{
public static void main (String args[])
{
int arr[] ={14,85,96,21,45,32};
sum(arr);
}


static void sum(int [] arr)
{
int s=0;
for(int i=0;i<arr.length;i++)
{
s=s+arr[i];
}
System.out.println("Sum of the array is = "+s);
}
}

