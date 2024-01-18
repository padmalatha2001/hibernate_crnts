//write a program to find largest and smallest digit in a number
package assignment2;
import java.util.Scanner;
public class LargestandSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l=0,s=9,r;
		while(n>0)
		{
			r=n%10;
			if(r>l)
			    l=r;
			if(r<s)
				s=r;
			n/=10;
		}
		System.out.println("Largest digit:"+l);
		System.out.println("Smallest digit:"+s);
	}

}
