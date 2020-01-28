import java.io.*;
import java.util.*;
class node
{
public int exp,coeff;
public node next;
public node(int x,int y)
{
coeff=x;
exp=y;
}
public node()
{}
public void display()
{
if(coeff<0)

System.out.println(coeff+"x^"+exp);

else
System.out.println("+"+coeff+"x^"+exp);
}
}

class linklist
{
public node first;
public node last;
 public linklist()
{
first=null;
last=null;
}
boolean isempty()
{
return (first==null);
}
public void insertatlast(int x,int y)
{
node newnode=new node(x,y);

if(isempty())
{
first= newnode;
last=first;
}
else
{
last.next=newnode;
last=newnode;
}

}

public void display()
{

node x= new node();

x=first;
while(x!=null)
{
x.display();
x=x.next;
}

}


}


class polynomial
{
public linklist l1 = new linklist();

public polynomial()
{

}
public void insert(int x,int y)
{
l1.insertatlast(x,y);
}

public void display()
{
l1.display();

}

public void add(polynomial p1,polynomial p2)
{
node result=new node();
node current1=p1.l1.first;
node current2=p2.l1.first;
int x=0,y=0;
while(current1!=null && current2!=null)
{
if(current1.exp==current2.exp)
{
x=current1.coeff + current2.coeff;
y=current1.exp;

current1=current1.next;
current2=current2.next;
}
else if(current1.exp>current2.exp)
{
x=current1.coeff;
y=current1.exp;
current1=current1.next;
}

else if(current2.exp>current1.exp)
{
x=current2.coeff;
y=current2.exp;
current2=current2.next;
}


l1.insertatlast(x,y);

}

while(current1!=null)
{
x=current1.coeff;
y=current1.exp;

current1=current1.next;
l1.insertatlast(x,y);
}

while(current2!=null)
{
x=current2.coeff;
y=current2.exp;

current2=current2.next;
l1.insertatlast(x,y);
}

}

}


public class Poly
{
public static void main(String args[]) throws Exception
{
Scanner sc=new Scanner(System.in);

polynomial p1=new polynomial();
polynomial p2=new polynomial();

int ex1=1;
System.out.println("Enter the terms of p1\n");
while(ex1!=0)
{
System.out.println("enter coeff\n");
int coeff1=sc.nextInt();
System.out.println("Enter exp\n");
ex1=sc.nextInt();
p1.insert(coeff1,ex1);


}
System.out.println("Enter the terms of p2\n");
int ex2=1;
while(ex2!=0)
{
System.out.println("enter coeff\n");
int coeff2=sc.nextInt();
System.out.println("Enter exp\n");
ex2=sc.nextInt();
p2.insert(coeff2,ex2);


}


System.out.println("the sum of polynomials are\n");

polynomial p3=new polynomial ();

p3.add(p1,p2);

p3.display();
}
}











































