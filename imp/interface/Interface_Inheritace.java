interface A
{
void method1();
}

interface B extends A   //one interface inherit another interface here
{
 void method2();
} 



class C implements B
{
 public void method1()
{
 System.out.println("override method1 within class C");
}
public void method2()
{
 System.out.println("override method2 withon class C");
}
}

class D
{
 public static void main(String args[])
{
 C obj=new C();
 obj.method1();
 obj.method2();
}
}