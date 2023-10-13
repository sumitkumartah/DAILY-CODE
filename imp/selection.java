
import java.util.*;
class A
{ 
  public static void main(String args[])
  {
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int[] arr;
    arr=new int[n];
    System.out.println("Enter The array element");
    for(int i=0;i<n;i++)
    {
     arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      int min=i;
      for(int j=i+1;j<n;j++){
         if(arr[j]<arr[min])
          {
             min=j;
          }
      }
      if(min!=0)
      {
        arr[i]=arr[i]^arr[min];
        arr[min]=arr[i]^arr[min];
        arr[i]=arr[i]^arr[min];
      }
     }
   System.out.println("after sorting: ");
   for(int i=0;i<n;i++)
    {
     System.out.println(arr[i]);
    }
  }
}