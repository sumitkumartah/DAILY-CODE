interface A
{
 void method1();
}

interface B extends A
{
 void method2();
}

interface C extends A
{
 void method3();
}

class D implements B,C
{
 @Override
 public void method1()
 {
 System.out.println("DEADLY");
 }
 public void method2()
 {
 System.out.println("DAIMOND");
 }
 public void method3()
 {
 System.out.println("PROBLEM");
 }
 public void method4()
 {
 System.out.println("SOLVED");
 }

}

class Main
{
 public static void main(String args[])
 {
  D obj=new D();
  obj.method1();
  obj.method2();
  obj.method3();
  obj.method4();
 }
}
 