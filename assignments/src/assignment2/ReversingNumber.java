//write a program to reverse even numbers b/w m-n
package assignment2;
import java.util.Scanner;
public class ReversingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        
        int r,rev=0,k;
        if(m%2==1)
              m=m+1;
        
        	for(int i=m;i<n;i=i+2)
        	{  k=i;
        	    rev=0;
        	    while(k>0)
        	    {
        	    	r=k%10;
        	    	rev=rev*10+r;
        	    	k/=10;
        	    }
        		System.out.println(rev);
        	}
        
       
	}

}
