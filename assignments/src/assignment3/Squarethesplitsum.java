package assignment3;
import java.util.Scanner;
public class Squarethesplitsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,q,sum=0;
       for(int i=1;i<10000;i++)
       {
    	   sum=0;
    	   if(i<10||(i>99&&i<1000))
    	   {
    		   continue;
    	   }
    	   if(i>9&&i<100)
    	   {
    		   r=i%10;
    		   q=i/10;
    		   sum=r+q;
    		   if(i==sum*sum)
    		   {
    			   System.out.println(i);
    		   }
    	   }
    	   if(i>999&&i<10000)
    	   {
    		   r=i%100;
    		   q=i/100;
    		   sum=r+q;
    		   if(i==sum*sum)
    		   {
    			   System.out.println(i);
    		   }
    	   }
       }
		
		
	}

}
