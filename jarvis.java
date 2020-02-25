import java.util.*;
import java.io.*;
class bstn
{
public int data;
public bstn left,right;
public bstn(int data)
{ this.data=data;
left=null;
right=null;
}
public bstn()
{ data=0;
left=null;
right=null;
}
public void setdata(int data)
{
this.data=data;
}
public void setleft(bstn left)
{ this.left=left;
}
public void sinsert(root.getleft(),data)etright(bstn right)
{ this.right=right;
}
public int getdata()
{ 
return data;
}
public bstn getright()
{
return right;
}
public bstn getleft()
{
return left;
}
public void pre(bstn root)
{
if(root!=null)
{ pre(root.left);
System.out.print(root.data+" ");
pre(root.right);
}
else 
{ return; }
}
public void ind(bstn root)
{
if(root!=null)
{ 
System.out.print(root.data+" ");
ind(root.left);
ind(root.right);
}
else  
{ return; }
}
public void pos(bstn root)
{
if(root!=null)
{ pos(root.left);
pos(root.right);
System.out.print(root.data+" ");
}
else 
{ return; }
}
public bstn insert(bstn root,int data){
       if(root==null)
       {  root= new bstn();
               if(root==null)
                {        
               System.out.println("Memory Error");
               return null;
         }
         else{
         root.setdata(data);
         root.setleft(null);
         root.setright(null);
            }
       }
       else{
             if(data<root.getdata())
             { root.setleft(insert(root.getleft(),data));
                }
              else if(data>root.getdata() )
                {
                  root.setright(insert(root.getright(),data));
               }
         }
         return root;
       }
 }
public class jarvis
{
public static void main(String[] args)
{
Scanner rohit=new Scanner(SAystem.in);
int d=1,ch,data;
System.out.println("enter the data of root node");
data=rohit.nextInt();
bstn tree=new bstn(data);
while(d==1)
{	System.out.println("1.inserttion in BINARY SEARCH TREE");
	System.out.println("2.prerder traversal");
	System.out.println("3.inorder traversal");
	System.out.println("4.post order traversal");
	System.out.println("5.To Exit ");
	ch=rohit.nextInt();
	if(ch==1)
	{	System.out.println("ENTER THE DATA");
		data=rohit.nextInt();
		tree.insert(tree,data);
		}
	if(ch==2)
	{	System.out.println("\n preOrder TRAVERSAL of BINARY SEARCH TREE \n ");
		tree.ind(tree);
		System.out.println(" ");
		}
	if(ch==3)
	{	System.out.println("\n inorder TRAVERSAL of BINARY SEARCH  TREE \n");
		tree.pre(tree);
		System.out.println(" ");
		}
	if(ch==4)
	{	System.out.println("\n postorder TRAVERSAL of BINARY SEARCH TREE \n ");
		tree.pos(tree);
		System.out.println(" ");
		}
		if(ch==5)
			{
	d=5;
	}
}}}
	

      
