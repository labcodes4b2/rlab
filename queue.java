import java.util.*;
public class queue
{ 
int arr[],front,rear,size;
	public queue(int s)
	{
	  size=s;
	front=-1;
	rear=-1;	
	arr=new int[size];
	    }
void nque(int key)
{
	if(front==-1)
	{  rear=rear+1;
	   front=front+1; 
	arr[front]=key;
		

	}
	else if((rear<size)&&(front==0))
	{ 
	rear=rear+1;
	arr[rear]=key;
	
	
	}
	else if(rear+1==size)
	{
	System.out.println("Queue is full"); 
	}
	else
	{
	System.out.println("Not possible as deletion is started from the que");
	}
  }
void dque()
{
	if(front==-1)
	{
	System.out.println("Queue is Empty");
	}
	else if((front==rear)&&((front+1)==size))
	{
	System.out.println("Queue is finished");
	}
	else
	{
	front=front+1;
		
	}


}
void peek()
{

	if(front==-1)
	{
	System.out.println("Queue empty");
	}
	else if((front==rear)&&((front+1)==size))
	{
	System.out.println("Queue is finished");
	}
	else
	{
	System.out.println("your peek of Queue is "+arr[front]);
	}
}

void display()
{
if(front==-1)
{
System.out.println("queue empty");
}
else if((rear>0)&&(rear<size))
{
for(int i=front;i<=rear;++i)
		{ System.out.print(arr[i]+" "); }
}
}




public static void main(String arg[])
{
Scanner rohit=new Scanner(System.in);
int op=1,log;
System.out.println("Enter the size of the Queue");
int a=rohit.nextInt();
queue raj=new queue(a);

while(op!=0)	
{
System.out.println("Press 1 for nque ");
System.out.println("Press 2 for dque ");
System.out.println("Press 3 for peek ");
System.out.println("Press any other  for Exit ");
int choice=rohit.nextInt();
if((choice==1)&&(raj.rear<=raj.size))
{
if(raj.rear+1<raj.size){
System.out.println("Enter the no to add up in the queue ");
log=rohit.nextInt(); 	
raj.nque(log);
raj.display();
 }
else{
System.out.println("Over flow");}
}
else if(choice==2)
{ if(raj.front<=rear)
{ 
System.out.println("dque starts now you are not able to add the in queue");
raj.dque();
raj.display();
}

}
else  if(choice==3)
{
System.out.println("peek");
raj.peek();

}

System.out.println("\nEnter any no other than 0 ,0 is for stop ");
	op=rohit.nextInt();	


	}
}
} 	


	

















