import java.io.*;
import java.util.*;
public class rohit
{
int arr[];
int top,size;
public rohit(int q)
{
size=q;
top=-1;
arr=new int[q];
}
  public void push(int a)
	{
	if(top<size)
	{
	top=top+1;
	arr[top]=a;
	}
	else
	System.out.println("Over flow");
	}
  public void pop()
	{
	if(top>=0)
	{
	top--;
	}
	else
	System.out.println("Under flow");
	}
  public static void main(String arg[])
	{
	Scanner raj=new Scanner(System.in);  //flag is for size
	int key,flag,temp=0;
	System.out.println("Enter the size of Stack ");
	flag=raj.nextInt();
	rohit st=new rohit(flag);
	rohit ts=new rohit(flag);
	int op=flag;
	int val=flag;
	int[] array= new int[flag];
	System.out.println("ENTER SEQUENCE 1:");
while(flag>0)
{ 
      if(st.top<st.size-1)
		{
			key=raj.nextInt();	
			st.push(key);
		}
	else
	{
	System.out.println("full");
	}
	flag=flag-1;
}	
	System.out.println("ENTER SEQUENCE 2:");
	while(op>0)
{ 
      if(ts.top<ts.size-1)
		{
			key=raj.nextInt();	
			ts.push(key);
		}
	else
	{
	System.out.println("full");
	}
	op=op-1;
}	
	for(int i=0;i<val;i++)
		{ st.pop();
				array[i]=st.arr[val-1-i];
			}
	for(int i=0;i<val;i++)
	{  if(array[i]==ts.arr[i])
		{
			temp++;
			}
	}
	if(temp==val)
	{ System.out.println("CORRECT SEQUENCE");
}
else 
	System.out.println("incorrect sequence");
	}
}
	
