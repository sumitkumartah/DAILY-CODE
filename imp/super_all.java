import java.util.*;

class A
{
 int a;
 A(int a)
 {
  this.a=a;
 }
 void method1()
 {
  System.out.println("within Super class method1");
 }
}

class B extends A
{
int x,y;
B(int x,int y)
{
 super(x);    //call super class constructor
 this.y=y;
}

void method1()
{
 super.method1();    //call super class method1
 System.out.println("within Sub class method1");
}

void method2()
{
 System.out.println("Value of (a) from super class: " +super.a);   //call super class variable
 System.out.println("Value of (Y) from sub class: " +y);
}

}

class Main
{
public static void main(String args[])
{
 B obj=new B(4,9);
 obj.method1();
 obj.method2();
}
}
 