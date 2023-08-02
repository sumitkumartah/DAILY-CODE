import java.util.*;
class A
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int i,n;
  System.out.print("Enter the size of Array: ");
  n=sc.nextInt();
  int [] arr=new int[n];
  System.out.println("Enter the elements of Array: ");
  for(i=0;i<n;i++){
  arr[i]=sc.nextInt();
  }
  bubblesort(arr);
 }


 public static void bubblesort(int []arr)
 {
 int n=arr.length;
 int i,j;
 for(i=0;i<n-1;i++){
 for(j=0;j<n-i-1;j++)
 {
  if(arr[j]>arr[j+1])
  { 
   arr[j]=arr[j]^arr[j+1];
   arr[j+1]=arr[j]^arr[j+1];
   arr[j]=arr[j]^arr[j+1];
  }
 }
}
System.out.printf("Elements of array after bubble sort: ");
 for(i=0;i<n;i++){
  System.out.print(arr[i]+" ");
}
}
}