class A
{
public static void main(String args[])
{
StringBuffer sb=new StringBuffer();
System.out.println("Initial Capacity:"+sb.capacity());
System.out.println("String append:"+sb.append("my name is kingkobra"));
System.out.println("string replace:"+sb.replace(11,15,"deba"));
System.out.println("string reverse:"+sb.reverse());
System.out.println("updated Capacity:"+sb.capacity());
System.out.println("String append:"+sb.append("my name is kingkobraaaaaa"));
System.out.println("updated Capacity:"+sb.capacity());
}
}