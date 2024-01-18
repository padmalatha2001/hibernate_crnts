//wap to perform sum of the armstrong numbers b/w 100-200& check the sum is pallindrome or not.
package assignment2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int temp,arm=0,r,s=0,rev=0,k;
      for(int i=100;i<=200;i++)
       {
    	   arm=0;
    	   temp=i;
            
    	   while(temp>0)
    	   {
    		   r=temp%10;
    		   arm+=r*r*r;
    		   temp/=10;
    	   }
    	   
    	   if(i	==arm)
    	   {
    		   System.out.println(arm);
    		   s=+arm;
    	   }
    	   
    	  
       }
      k=s;
      while(s>0)
      {
    	  r=s%10;
    	  rev=rev*10+r;
    	  s/=10;
      }
      if(rev==k)
      {
    	  System.out.println("The sum is pallindrome");
      }
      else
      {
    	  System.out.println("The sum is not a pallindrome");
      }
	}

}
