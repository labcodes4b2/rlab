import java.util.*;
class stack2
{
	public static void main(String[] arg)
	{
		Scanner rohit=new Scanner(System.in);
		int a[],b[],size=rohit.nextInt();
		a= new int[size];
		b=new int [size];
		int key=0;
		for(int i=0;i<size;i++)
		{
			a[i]=rohit.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			b[i]=rohit.nextInt();
		}
		for(int i=0;i<size;i++)
		{
				if(a[i]==b[size-1-i])
				{
					++key;
				}
			}
		if(key==size)
		{
			System.out.println("correct sequence");
		}
		else
		{
			System.out.println("incorrect sequence");
		}
	}
}