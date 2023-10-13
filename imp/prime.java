import java.util.*;
class A
{
void prime(int a)
{
int i,flag=0;
for(i=2;i<=a/2;i++)
{
if(a%i==0)
{
break;
}
}
if(i>a/2 && i!=1)
{
System.out.println("prime");
}
else
{
System.out.println("not prime");
}
}
}

class Demo
{
public static void main(String args[])
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("enter any positive integer");
num=sc.nextInt();
A x=new A();
x.prime(num);
}
}