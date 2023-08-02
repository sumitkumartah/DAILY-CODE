import java.util.*;
class A
{
public static void main(String args[])
{ 
 Scanner sc=new Scanner(System.in);
 int i,j,r1,r2,c1,c2;


 System.out.printf("Enter the number of rows of 1st matrix : ");
 r1=sc.nextInt();
 System.out.printf("Enter the number of columns of 1st matrix : ");
 c1=sc.nextInt();
 int[][] m1=new int[r1][c1];
 System.out.println("Enter the elements of the 1st matrix : ");
 for(i=0;i<r1;i++)
 { 
  for(j=0;j<c1;j++)
  {
   m1[i][j]=sc.nextInt();
  }
 }

System.out.printf("Enter the number of rows of 2nd matrix : ");
 r2=sc.nextInt();
 System.out.printf("Enter the number of columns of 2nd matrix : ");
 c2=sc.nextInt();
 int[][] m2=new int[r2][c2];
 System.out.println("Enter the elements of the 2st matrix : ");
 for(i=0;i<r2;i++)
 { 
  for(j=0;j<c2;j++)
  {
   m2[i][j]=sc.nextInt();
  }
 }

 addmat(m1, m2, r1, c1, r2, c2);
}



public static void addmat(int[][] m1, int[][] m2, int r1, int c1, int r2, int c2)
{ 
int i,j;
 
 if(r1==r2 || c1==c2)
 { 
  System.out.println("Addition of two matrix is :");
  for(i=0;i<r2;i++)
  { 
   for(j=0;j<c2;j++)
   {
    System.out.printf(m1[i][j] + m2[i][j] + " ");
   }
   System.out.println();
  }
 }
else
{
System.out.println("NOT POSSIBLE");
}
}
}
    


