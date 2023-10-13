class A
{
public static void main(String args[])
{
String a="hello";   //create the object in memeory pool which value is hello
String b="hello";   //store in the memory pool but in meemory pool there are already "hello" exist so a and b will refer the same "hello"
String c=new String("hello");  //create object in the heap memory with value "hello"
String d=new String("hello");  //create object in the heap memory with value "hello"
String e=new String("hello,how r u?");
a+="hi";  //add "hi" after hello in a

if(a==b)
{
System.out.println("a & b both refer to same object");
}
else
{
System.out.println("a & b both refer to different object in memory pool ");
System.out.println("The value of a = "+a);
System.out.println("The value of b = "+b);
}

if(c==d)  //c and d refer to the different object
{
System.out.println("c & d both refer to same object");
}
else
{
System.out.println("c & d both refer to different object in heap memory");
}

String f=e.intern();   //by using intern keyword copy of e will create in memory pool and store in f
System.out.println("The value of f in memory pool= "+f);

if(f==e)      //f is in memory pool but e is in heap memory so they are different
{
System.out.println("same");
}
else
{
System.out.println("e & f are different,because interned object has been created in memory pool");
}
String m="This is demo string";
System.out.println(m.indexOf("is"));

}
}