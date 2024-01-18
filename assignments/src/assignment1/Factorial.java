//WAP to perform summation of odd digits of the numbers b/w m-n & print factorial of second smallest digit of sum.
package assignment1;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n,m,s=9,ss=9,sum=0,r,fac=1,k;
	  	m=sc.nextInt();
		n=sc.nextInt();
		for(int i=m;i<=n;i++)
		{
		    k=i;
			while(k>0)
			{
				r=k%10;
				if(r%2==1)
					sum+=r;
				 k/=10;
			}
		}
     		//System.out.println(sum);
	      
	    while(sum>0)
		{
			r=sum%10;
			if(r<s)
			{
				ss=s;
				s=r;
			}
			else if(r<ss&&r>=s)
			{
				ss=r;
			}
			else 
			{
			}
			sum/=10;
		}
	    //System.out.println(ss);
		while(ss>1)
		{
			fac*=ss--;
		}
		System.out.println(fac);

	}

}
