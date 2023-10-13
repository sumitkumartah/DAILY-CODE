import java.util.*;
class A
{
static int i= n();   //static variable
static int n()      //static method
{
System.out.println("Inside the static method n");
return 20;
}
static              //static block
{
System.out.println("Inside the static block and it will print before main");
}

public static void main(String args[])
{
System.out.println("Inside the main method");
System.out.println("Value of i is= " +i);
}
}