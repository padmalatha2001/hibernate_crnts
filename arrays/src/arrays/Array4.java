//wapt print unique element of an array
package arrays;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
	      int s=sc.nextInt();
	      int[] a=new int[s];
	      
	      for(int i=0;i<s;i++)
	      {
	    	  a[i]=sc.nextInt();
	      }
	      for(int i=0;i<s;i++)
	      {
	    	  boolean isp=false;
	    	  for(int k=i-1;k>=0;k--)
	    	  {
	    		  if(a[i]==a[k])
	    			   isp=true;
	    	  }
	    	  if(!isp)
	    		  System.out.print(a[i]+" ");
	      }
	}

}
