class A
{
 int a=5;
 A()
 {
  System.out.println("Constuctor Super class A");
 }
 void msg1()
 {
  System.out.println("Method msg1 at Super class");
 }
 void msg2()
 {
  System.out.println("Method msg2 at Super class");
 }
}


class B extends A
{
 int a=80;
 B()
 {
  System.out.println("Constuctor Sub class B");
 }
 void msg1()
 {
  System.out.println("Method msg1 at Sub class");
 }
 void msg3()
 {
  System.out.println("Method msg3 at Sub class");
 }
}


class Demo
{ 
 public static void main(String args[])
 {
  A ob=new B();
  B ob2=new B();
  ob.msg1();
  ob.msg2();
  ob2.msg3();
  System.out.println(ob.a);
  System.out.println(ob2.a);
}
}