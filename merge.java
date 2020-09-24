import java.util.*;
import java.io.*;
public class merge
{ 
   public void merge(int[] A,int[] temp,int left,int mid,int right)
    {   
        int i,left_end,size,temp_pos;
        left_end=mid-1;
        temp_pos=left;
        size=right-left+1;
        while(left<=left_end && mid<=right)
        {
            if(A[left]<A[mid])
                temp[temp_pos++]=A[left++];
            else
                temp[temp_pos++]=A[mid++];
        }
            while(left<=left_end)
            temp[temp_pos++]=A[left++];
            while(mid<=right)
            temp[temp_pos++]=A[mid++];
            for(i=0;i<size;i++)
            {
                A[right]=temp[right];
                right--;
            }
        
    }
   public   void msort(int[] A,int[] temp,int l,int n)
    {   int mid;
        if(l<n)
        {
            mid=(l+n)/2;
            msort(A,temp,l,mid);
            msort(A,temp,mid+1,n);
            merge(A,temp,l,mid+1,n);
        }
    }
    public static void main(String[] arg)
    {


        
    Scanner rohit=new Scanner(System.in);
    int[] mat={9,8,7,6,5,4,3,2,1};
    int[] tmat= new int[10];
    merge m=new merge();
    m.msort(mat,tmat,0, mat.length-1);
    for(int i=0;i<10;i++)
        System.out.print(tmat[i]+ " ");  


    }
}