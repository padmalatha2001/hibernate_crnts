//Wapt find nth largest and smallest elements
package arrays;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc =new Scanner(System.in);
	      int s=sc.nextInt();
	      int[] a=new int[s];
	      
	      for(int i=0;i<s;i++)
	      {
	    	  a[i]=sc.nextInt();
	      }
	      int temp;
	      for(int i=0;i<s;i++)
	      {
	    	  for(int j=i+1;j<s;j++)
	    	  {
	    		  if(a[i]>a[j])
	    		  {
	    			  temp=a[j];
	    			  a[j]=a[i];
	    			  a[i]=temp;
	    		  }
	    	  }
	      }
	      for(int i=0;i<s;i++)
	      {
	    	  System.out.print(a[i]+" ");
	      }
	      int sm=sc.nextInt();
	      int la=sc.nextInt();
	      System.out.println(sm+"th smallest element :"+a[sm-1]);
	      System.out.println(la+"th larges element :"+a[s-la]);

	}

}
