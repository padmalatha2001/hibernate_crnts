//WAPTC the number of times the element is repeated
package arrays;

import java.util.Scanner;

public class Array2 {

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
	    	 
	    	 if(i!=0)
	    	 { for(int k=i-1;k>=0;k--)
	    	  {
	    		  if(a[i]==a[k])
	    			  isp=true;
	    	  }
	    	 }
	    	 
	    	  if(isp==false)
	    	  {
	    		  int c=1;
	    		  for(int j=i+1;j<s;j++)
	    		  {
	    			  if(a[i]==a[j])
	    				  c++;
	    		  }
	    		  System.out.println(a[i]+" "+c);
	    	  }
	      }

	}

}
