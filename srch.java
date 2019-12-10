import java.util.*;
public class srch
{
public static void main(String arg[])
{
Scanner rohit=new Scanner(System.in);
int []a=new int[10];
int s;
int key;
System.out.println("enter the size");
s=rohit.nextInt();
System.out.println("enter the key ");
key=rohit.nextInt();
int c=0;
for(int i=0;i<s;i++)
{
a[i]=rohit.nextInt();
}
for(int i=0;i<s;i++)
{
if(a[i]==key)
{
System.out.println("Element founded");
c=c+1;
break;
}
}
if(c==0)
{
System.out.println("not founded");
}
}
}
