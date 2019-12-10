import java.util.*;
public class matrix
{
public static void main(String arg[])
{
Scanner rohit= new Scanner(System.in);
int [][]arr1=new int[10][10];
int [][]arr2=new int[10][10];
System.out.println("enter the size of matrix row and column");
int r=rohit.nextInt();
int c=rohit.nextInt();
for(int i=0;i<r;i++)
{
	for(int j=0;j<r;j++)
{ 
System.out.println("enter element of arr1");
arr1[i][j]=rohit.nextInt();
System.out.println("enter the element of arr2");
arr2[i][j]=rohit.nextInt();
}
}
for(int i=0;i<r;i++)
{
for(int j=0;j<r;j++)
{ System.out.println(arr1[i][j]+arr2[i][j]);
}
}
}
}


	  
