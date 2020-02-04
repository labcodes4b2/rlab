import java.io.*;
import java.util.*;
import java.lang.*;
//import java.util.Stack;
class Stack
{
char[] arr;
int top;
int size;
Stack(int n)
{
arr=new char [n];
size=n;
top=-1;
}
public void push(char key)
{
arr[++top]=key;
}
public char pop()
{
return (arr[top--]);
}
public char peek()
{
return (arr[top]);
}
public boolean isEmpty()
{
return (top==-1);
}
}
public class InfixToPostfix
{
static int prec(char c)
{
switch(c)
{
case '+':
case '-':
 return 1;
case '*':
case '/':
 return 2;
}
return -1;
}
static String infixtopostfix(String exp)
{
String result=new String(" ");
Stack stack=new Stack(exp.length());
for(int i=0;i<exp.length();++i)
{
char c=exp.charAt(i);
if(Character.isLetterOrDigit(c))
 result+=c;
else if(c=='(')
 stack.push(c);
else if(c==')')
{
while(!stack.isEmpty()&&stack.peek()!='(')
 result+=stack.pop();
if(!stack.isEmpty()&&stack.peek()!='(')
 return "Invalid Expression";
else 
stack.pop();
}
else 
{
while(!stack.isEmpty()&&prec(c)<=prec(stack.peek()))
{
if(stack.peek()=='(')
 return "Invalid Expression";
result+=stack.pop();
}
stack.push(c);
}
}
while(!stack.isEmpty())
{
if(stack.peek()=='(')
 return"Invalid Expression";
result+=stack.pop();
}
return result;
}
public static void main(String args[])throws IOException
{
Scanner sc=new Scanner(System.in);
String exp;
System.out.println("Enter the expression");
exp=sc.nextLine();
int sz=exp.length();
sz=sz-1;
char c=exp.charAt(sz);
if(c=='+'||c=='-'||c=='*'||c=='/'||c==')'||c=='(')
{
System.out.println("INVALID EXPRESSION");
}
else{

System.out.println("Postfix expression:");
System.out.print(infixtopostfix(exp));
System.out.println();
}}
}
