import java.util.*;
class A
{
public static void main(String []args)
{ 
 Scanner sc=new Scanner(System.in);
 int i,n;
 System.out.printf("Enter the size of the array: ");
 n=sc.nextInt();
 int [] arr=new int [n];
 System.out.println("Enter the elements of the array: ");
 for(i=0;i<n;i++)
 {
   arr[i]=sc.nextInt();
 } 
 reverse(arr);
}
 

public static void reverse(int []arr)
{
int i;
int n=arr.length;
for(i=0;i<(n/2) ;i++)
{
 arr[i]=arr[i]^arr[n-i-1];
 arr[n-i-1]=arr[i]^arr[n-i-1];
 arr[i]=arr[i]^arr[n-i-1];
}
System.out.println("After reverse the array: ");
for(i=0;i<n;i++)
{
 System.out.println(arr[i]);
}
}
}



