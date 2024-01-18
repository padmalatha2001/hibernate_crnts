package gemini_interview;

public class Assignment {

	public static boolean pallindrome(int i)
	{
		int r,re=0,k=i,f=0;
		 while(i!=0)
	      {
	        r=i%10;
	        
	        re=re*10+r;
	        i/=10;
	    }
		 if(re==k)
		 {
			 return true;
		 }
		 else
			 return false;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int c=0;
		for(int i=1;i<=20;i++)
		{
		   if(pallindrome(i))
		   {
			   c++;
			   if(c==10)
				   if(i%2==0)
				      System.out.println("even");
				   else
					  System.out.println("odd");
		   }
		   
		}
		
		
	}

}
