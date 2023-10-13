class A{
A(){
System.out.println("constructor 1");
}
A(int a){
System.out.println("constructor 2");
System.out.println(a);
}
A(double b){
System.out.println("constructor 3");
System.out.println(b);
}
A(int a, double b){
System.out.println("constructor 4");
System.out.println(a);
System.out.println(b);
}
A(double b,int a){
System.out.println("constructor 5");
System.out.println(a);
System.out.println(b);
}

void m(){
System.out.println("method 1");
}
void m(int a){
System.out.println("method 2");
System.out.println(a);
}
void m(double b){
System.out.println("method 3");
System.out.println(b);
}
void m(int a, double b){
System.out.println("method 4");
System.out.println(a);
System.out.println(b);
}
void m(double b,int a){
System.out.println("method 5");
System.out.println(a);
System.out.println(b);
}
}

class B{
public static void main(String args[]){
A obj1 = new A();
A obj2 = new A(6);
A obj3 = new A(3.0);
A obj4 = new A(6,3.0);
A obj5 = new A(3.0,6);

obj1.m();
obj1.m(5);
obj1.m(4.0);
obj1.m(5,4.0);
obj1.m(4.0,5);
}
}