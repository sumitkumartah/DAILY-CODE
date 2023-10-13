import java.util.*;
class A
{
boolean isPal(String str)
{
int i,j,flag=0;
j=str.length()-1;
for(i=0;i<j;i++,j--)
{
if (str.charAt(i) != str.charAt(j)) 
{
flag++;
break;
}
}
if(flag==0)
{
return true;
}
else
{
return false;
}
}
}
class Demo
{
public static void main(String args[])
{
String str;
Scanner sc=new Scanner(System.in);
System.out.println("enter any string");
str=sc.nextLine();
A a=new A();
if(a.isPal(str))
{
System.out.println("pallindrome");
}
else
{
System.out.println("not");
}
}
}