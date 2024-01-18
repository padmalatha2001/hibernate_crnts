//wap to print prime digits in a given number
package assignment2;
import java.util.Scanner;
public class Prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r;
		while(n>0)
		{
			r=n%10;
			if(r==2||r==3||r==5||r==7)
				System.out.println(r);
			n/=10;
		}
		 
		
	}

}
