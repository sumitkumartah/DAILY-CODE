abstract class Ab
{
Ab(int a)
{
System.out.println("Constructor of abstract class "+a);
}
abstract void msg1();  //abstract method which are only declared but not defined(abstract method has no body)
static void msg2()     //non abstract method
{
System.out.println("Non abstract method");  
}
}


class A extends Ab
{
A()
{
 super(10);
System.out.println("Constructor of Class A");
}
void msg1()
{
System.out.println("overriding abstract method");
}
}


class B
{
public static void main(String args[])
{
A a=new A();
a.msg1();
Ab.msg2();  //here I can call msg2 method from abstract class bcz msg2 is static  
}
}