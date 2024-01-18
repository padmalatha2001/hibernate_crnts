//wapt seperate prime and composite numbers into two different arraya?
package arrays;
import java.util.Scanner;
public class Array {
	
	public static boolean isprime(int n)
	{
		int c=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				 c++;
		}
		if(c==0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc =new Scanner(System.in);
      int s=sc.nextInt();
      int[] a=new int[s];
      int p=0,co=0;
      for(int i=0;i<s;i++)
      {
    	  a[i]=sc.nextInt();
    	  if(Array.isprime(a[i]))
    		  p++;
    	  else
    		  co++;
      }
    int[] pri=new int[p];
    int[] com=new int[co];
    int pr=0,comp=0;
      for(int i=0;i<s;i++)
      {
    	  if(Array.isprime(a[i]))
    		  pri[pr++]=a[i];
    	  else
    		  com[comp++]=a[i];
      }
      for(int i=0;i<p;i++)
      {
    	  System.out.print(pri[i]+" ");
      }
      System.out.println();
      for(int i=0;i<co;i++)
      {
    	  System.out.print(com[i]+" ");
      }
	}

}
