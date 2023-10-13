import java.util.*;
class A
{
 int a;
 int b;
 A(int a, int b)
 {
  this.a = a;
  this.b = b;
 }
 int gcd() 
 {
  int x=1 ;
  for (int i = 1; i <= a && i <= b; i++) 
  { 
   if (a % i == 0 && b % i == 0) 
   {
    x = i;
   }
  }
 return x;
}

public static void main(String[] args) 
{
  Scanner sc=new Scanner(System.in);  
  System.out.println("Enter the two number:");
  int a= sc.nextInt();
  int b= sc.nextInt();
  A obj = new A(a,b);
  System.out.println("GCD of " + a + " and " + b+ " is: " + obj.gcd());
  }
}
