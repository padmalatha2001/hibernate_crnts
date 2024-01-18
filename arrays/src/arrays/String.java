package arrays;

import java.util.Scanner;
import java.lang.*;
public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] a=new String[n];
		String s;
       for(int i=0;i<n;i++)
       {
    	   a[i]=sc.nextLine();
       }
       for(int i=0;i<n;i++)
       {
    	   for(int j=i+1;j<n;j++)
    	   {
    		   if(((Comparable<String>) a[i]).compareTo(a[j])>0)
    		   {
    			   s=a[i];
    			   a[i]=a[j];
    			   a[j]=s;
    		   }
    	   }
       }
       for(int i=0;i<n;i++)
       {
    	   System.out.println(a[i]);
       }
       
	}

}
