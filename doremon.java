import java.util.*;
import java.io.*;
 class btn
{
public int data;
public btn left;
public btn right;
public btn(int data)
{
this.data=data;
left=null;
right=null;
}
public btn()
{	data=0;
left=null;
right=null;
}
 public void insertbtlevel(btn temp,int key)//for inserting
	  {  
	  Queue<btn> q = new LinkedList<btn>(); 
        q.add(temp);  
        while (!q.isEmpty()) { 
            temp = q.peek(); 
            q.remove(); 
            if (temp.left == null) { 
                temp.left = new btn(key); 
                break; 
            } else
                q.add(temp.left); 
            if (temp.right == null) { 
                temp.right = new btn(key); 
                break; 
            } else
                q.add(temp.right); 
        } 
    }
	 public void ind(btn root)// use ind for preorder traversal
	 {
	 if(root!=null)
		 {
		 ind(root.left);
		 System.out.print(root.data + " ");
		 ind(root.right);
		 }
	else 
	{return;}
	 }
	public void pos(btn root)// use pos for postorde traversal
	 {
	 if(root!=null)
		 {
		 pos(root.left);
		 pos(root.right);
		 System.out.print(root.data + " ");
		 }
	 else
	 {		 return;}
	 }
	 public void pre(btn root)// use ind for inorder traversal
	 {
	 if(root!=null)
	 {
	  System.out.print(root.data + " ");
	 pre(root.left);
	 pre(root.right);
	 }
	 else 
	 {return;}
	 }
}//end of binary tree
public class doremon
{
	public static void main(String[] args) 
{
Scanner rohit=new Scanner(System.in);
int d=1,ch,data;
System.out.println("ENTER THE DATA OF ROOT NODE");
data=rohit.nextInt();
btn tree= new btn(data);
while(d==1)
{
System.out.println("1.INSERTION IN LEVEL ORDER");
System.out.println("2.INORDER TRAVERSAL");
System.out.println("3.PRE ORDER TRAVERSAL");
System.out.println("4.POST ORDER TRAVERSAL");
System.out.println("ENTER YOUR CHOICE...");
ch=rohit.nextInt();
if(ch==1)
{System.out.println("Enter The Data");
data=rohit.nextInt();
tree.insertbtlevel(tree,data);
 }
if(ch==2)
{  System.out.println("\nInorder traversal of binary tree is "); 
	tree.ind(tree);
}
if(ch==3)
{ System.out.println("Preorder traversal of binary tree is "); 
	tree.pre(tree);
 }
if(ch==4)
{  System.out.println("\nPostorder traversal of binary tree is ");
	tree.pos(tree);
 }
System.out.println("press 1 to continue or any to exit ");
d=rohit.nextInt();
} }}
	 
	 
