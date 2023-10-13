interface A
{
 void method1();  //before void i don't write public abstract bcz the method1 is by default abstract

}

class B implements A 
{
 public void method1()
{
 System.out.println("Within class B");
}
}

class C implements A
{
public void method1()
 {
  System.out.println("Within class C");
 }
}

class D
{
 public static void main(String args[])
 {
 C obj = new C();
 obj.method1();
 }
}