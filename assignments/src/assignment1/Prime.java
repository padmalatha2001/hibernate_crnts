//wapt second largest prime digit in a given number
package assignment1;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r,l=0,sl=0;
		while(n>0)
		{
           r=n%10;
		   if(r==2||r==3||r==5||r==7)
			{
			   if(r>l)
				{
				   sl=l;
				   l=r;
				}
				else if(r>sl&&r!=sl)
				{
					sl=r;
				}
				else
				{

				}
			}
			n/=10;
		}
		System.out.println(sl);
	}

}
