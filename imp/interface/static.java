interface A
{
 void method1();  //before void i don't write public abstract bcz the method1 is by default abstract
 static void cube(int x)
 {
  System.out.println("Cube ="+x*x*x*x);
 }
}

class B implements A 
{
 public void method1()
{
 System.out.println("Within class B");
}
}


class D
{
 public static void main(String args[])
 {
 B obj = new B();
 obj.method1();
 A.cube(4);
 }
}