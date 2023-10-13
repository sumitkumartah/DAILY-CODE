import java.util.Scanner;
class A
{
void pal(int a,int b)
{
int temp,rev,i;
for(i=a;i<=b;i++)
{
temp=i;
rev=0;
while(temp!=0)
{
rev=10*rev+(temp%10);
temp=temp/10;
}
if(rev==i)
{
System.out.println(i);
}
}
}
}
class Demo
{
public static void main(String args[])
{
A x=new A();
int m,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter two values");
m=sc.nextInt();
n=sc.nextInt();
x.pal(m,n);
}
}
