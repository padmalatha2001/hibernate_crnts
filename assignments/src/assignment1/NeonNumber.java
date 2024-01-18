//WAPT check 10 perfect square numbers,first digit is neon number or not
package assignment1;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c=0,k,j,ne,fn,s=0,r=0;
		for(int i=1;i<=10;i++)
		{

		     k=i*i;
		System.out.println(k);
		while(k>=10)
		{
		   k=k/10;
		   
		}
	     fn=k;
		ne=k*k;
		System.out.println(ne);
		s=0;
		while(ne>0)
		{

            r=ne%10;
			s+=r;
			ne/=10;
		}
		if(s==fn)
		  System.out.println("first number is neon number");
		else
           System.out.println("first number is not a neon number");
		}
	}

}
