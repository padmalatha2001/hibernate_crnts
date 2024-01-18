package gemini_interview;

public class Hello {

	public static int check(int i)
	{
		int r,f=0;
		
	    if(i%5==0)
	    {
	        while(i!=0)
	        {
	            r=i%10;
	            if(r%2==0)
	                f=1;
	            
	            i/=10;
	         }
	    }
	    else
	    {
	    	f=0;
	    }
	    
		return f;

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=10;i<=30;i=i+5)
		{
		 int re=check(i);
		 if(re==1)
			 System.out.println(i);
		     
		}

	}

}
