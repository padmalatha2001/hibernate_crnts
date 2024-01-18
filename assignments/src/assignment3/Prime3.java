package assignment3;
import java.util.Scanner;
public class Prime3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int m=sc.nextInt();
       int n=sc.nextInt();
       int rev,r,co,k,c=0;
       for(int i=m;i<=n;i++)
       {
    	   k=i;
    	    co=0;
    	   for(int j=2;j<i;j++)
    	   {
    		   if(i%j==0)
    		   {
    			   co++;
    		   }
    	   }
    	   
    	   if(co==0)
    	   {
    		   c=0;
    		   rev=0;
    		   while(k>0)
    		   {
    			   r=k%10;
    			   rev=rev*10+r;
    			   k=k/10;
    		   }
    		   for(int p=2;p<rev;p++)
    		   {
    			   if(rev%p==0)
    				   c++;
    		   }
    		   if(c==0)
    		   {
    			   System.out.println(i);
    		   }
    	   }
       }
		
	}

}
