package assignment3;

public class Singledigitsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int r,sum=0,temp;
		
        for(int i=1;i<1000;i++)
        {
        	if(i<9)
        	{
        		System.out.println(i+":"+i);
        	}
        	else
        	{
        		sum=0;
        		temp=i;
        		while(temp>0)
        		{
        			r=temp%10;
        			sum=sum+r;
        			temp=temp/10;
        			if(temp==0&&sum>=10)
        			{
        				temp=sum;
        				sum=0;
        			}
        		}
        		System.out.println(i+":"+sum);
        	}
        	
        }
        
	}

}
