import java.util.*;
class A
{
int a;//instance variable
A(int a)//argument constructor
{
this.a=a;
}
void num_strong()//instance method
{
int rem,temp,i;
long f,s=0;
temp=a;
while(temp!=0)
{
rem=temp%10;
f=1;
for(i=1;i<=rem;i++)
{
f=f*i;
}
s=s+f;
temp=temp/10;
}
if(a==s)
{
System.out.println("strong number");
}
else
{
System.out.println(" not strong number");
}
}
}
class Demo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter any positive value");
A x=new A(sc.nextInt());
x.num_strong();
}
}