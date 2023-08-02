//Here we create an array of object of a class

class Cricketer
{
int jrno;
String name;
Cricketer(int jrno, String name)  //created constructor
{
this.jrno=jrno;
this.name=name;
}
}

class Icc
{ 
public static void main(String args[])
{
Cricketer [] arr=new Cricketer[5];   //created object of class Cricketer
arr[0]= new Cricketer(18,"VIRAT KOHLI");
arr[1]= new Cricketer(07,"MS DHONI");
arr[2]= new Cricketer(45,"ROHIT SHARMA");
arr[3]= new Cricketer(64,"Yashasvi Jaiswal");
arr[4]= new Cricketer(77,"Subhman Gill");

 
for(int i=0; i<arr.length; i++)
{
System.out.println("The element at "+i+" index = "+ arr[i].name+ "  "+arr[i].jrno);
}
}
}
