package gemini_interview;
import java.util.Scanner;
public class Fibonociss {


	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int n1=0,n2=1,sum=0,r;
		int n3=n1+n2,k;
		int i=4;
		while(i++<=15)
		{	n1=n2;
			n2=n3;
		    n3=n1+n2;
		   System.out.println(n3); 
		   /* k=n3;
		    while(k>0)
			{
               r=k%10;
			   if(r%2==0)
				   sum+=r;
       
			   k/=10;
			}
		    */
		}


      //System.out.println(sum);



	}
	
}
