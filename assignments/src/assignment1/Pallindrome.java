//wapt count no.of primes present in first 10 pallindrome numbers
package assignment1;

public class Pallindrome {

	public static void main(String[] args) {
		  int k,r,c=0,cou=0,re=0;
			for(int i=2;i<15;i++)
			{
				k=i;
				re=0;
				while(k>0)
				{
					r=k%10;
	                re=re*10+r;
					k/=10;
				}
				if(re==i)
				{
				    
				   c=0;
	               for(int j=2;j<i;j++)
					{
					   if(i%j==0)
						{
						   c++;
						   break;
						}
		            }
					if(c==0)
					{
						cou++;
						
					}
				}
			}
			System.out.println(cou);

	}

}
