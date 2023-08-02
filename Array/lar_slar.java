//Here we find the largest and second largest element in java


import java.util.*;
class A
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i;
System.out.println("Enter the size of the array: ");
n=sc.nextInt();
int [] arr= new int[n];
System.out.println("Enter the elements of the array: ");
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
slargest(arr);      //if we don't static this method and we have to define object for this method such like this: 
                    // A obj=new A();
                    //A.slargest(arr);
}



static void slargest(int []arr)
{
int lar=arr[0],slar=arr[0];
for(int i=0;i<arr.length;i++)
{
if(arr[i]>lar)
{
slar=lar;
lar=arr[i];
}
if(arr[i]>slar && arr[i]!=lar)
{
slar=arr[i];
}
}
System.out.println("The largest element of array is = "+lar);
System.out.println("The Second largest element of array is = "+slar);
}
}


