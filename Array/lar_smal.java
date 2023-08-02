//largest and smallest elemnt from a user given array


import java.util.*;
class A
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i;
System.out.printf("Enter the Size of the array: ");
n=sc.nextInt();
int [] arr=new int[n];
System.out.println("Enter the elements of the array: ");
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
larsmall(arr);    //if we don't static this method and we have to define object for this method such like this: 
                 // A obj=new A();
                //A.larsmall(arr);

}


static void larsmall(int []arr)
{
int max=arr[0], min=arr[0];
for(int i=0;i<arr.length;i++)
{
if(arr[i]>max)
{
max=arr[i];
}
if(arr[i]<min)
{
min=arr[i];
}
}
System.out.println("The largest element of the array: "+max);
System.out.println("The smallest element of the array: "+min);
}
}


