import java.util.Scanner;

class A 
{
public static int fibonacci(int n) {
if (n <= 1)
 { 
  return n;
 }
 return fibonacci(n - 1) + fibonacci(n - 2);
}
}

class B
{
public static void main(String[] args) 
{
 int n;
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the number of terms in the Fibonacci series: ");
 n = sc.nextInt();
 System.out.println("Fibonacci Series:");
 for (int i = 0; i < n; i++) 
 {
  System.out.print(A.fibonacci(i) + " ");
 }
}
}