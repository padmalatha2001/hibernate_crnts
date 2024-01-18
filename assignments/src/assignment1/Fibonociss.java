//waptp even digit summation of 15 fibonocii numbers 
package assignment1;

public class Fibonociss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0,n2=1,sum=0,r,k;
		int n3=n1+n2;
		int i=4;
		while(i<=15)
		{	n1=n2;
			n2=n3;
		    n3=n1+n2;
		    k=n3;	
		   
		   while(k>0)
			{
               r=k%10;
			   if(r%2==0)
				   sum+=r;

			   k/=10;
			}
				i++;
		}
	
		System.out.println(sum);
	}

}
