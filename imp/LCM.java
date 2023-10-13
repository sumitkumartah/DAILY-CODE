import java.util.Scanner;

class A 
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the first number: ");
int m = sc.nextInt();
System.out.print("Enter the second number: ");
int n = sc.nextInt();
int lcm=(m*n)/ gcd(m,n);
System.out.println("LCM of "+m + " and "+n+" is: " + lcm);
}

public static int gcd(int a, int b) 
{
if (b == 0) 
{
return a;
} 
else 
{
return gcd(b,a % b);
}
}

}
