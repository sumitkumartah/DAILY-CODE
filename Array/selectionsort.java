import java.util.*;
class A{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i,n;
System.out.println("Enter the size of the array: ");
n=sc.nextInt();
int []arr=new int[n];
System.out.println("Enter the elements of Array: ");
  for(i=0;i<n;i++){
  arr[i]=sc.nextInt();
  }
  

selectionsort(arr);

 }


  public static void selectionsort(int[] arr) {
        int i, j, min;
        int n = arr.length;

        System.out.println("After selection sort array will be: ");

        for (i = 0; i < n; i++) {
            min = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) { // Corrected condition for swapping
                arr[i] = arr[i] ^ arr[min];
                arr[min] = arr[i] ^ arr[min];
                arr[i] = arr[i] ^ arr[min];
            }
        }
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}