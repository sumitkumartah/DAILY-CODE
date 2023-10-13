import java.util.*;
class A
{
public long factorial(int a)
{
if (a==0||a==1)
{
return 1;
}
else
{
return (a*factorial(a-1));
}
}
}

class B
{
 public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();
        A obj = new A();
        System.out.println("Factorial of " + num + " is " +  obj.factorial(num));
}
}