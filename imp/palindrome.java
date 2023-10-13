import java.util.Scanner;
class A
{
void pal(int n)
{
int temp,rev,i;
temp=n;
rev=0;
while(temp!=0)
{
rev=10*rev+(temp%10);
temp=temp/10;
}
if(rev==n)
{
System.out.println( n +" is palindrime number");
}
else
{
System.out.println( n +" is not palindrime number");
}
}
}
class Demo
{
public static void main(String args[])
{
A x=new A();
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter a positive number:: ");
n=sc.nextInt();
x.pal(n);
}
}