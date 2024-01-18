package gemini_interview;
import java.util.Stack;
public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] ar= {4,7,3,4,8,1};
        Stack<Integer> s=new Stack();
        int[] re=new int[ar.length];
        for(int a:ar)
        {
        	System.out.print(a+" ");
        }
		for(int i=ar.length-1;i>=0;i--)
		{
			if(!s.isEmpty())
			{
				while(!s.isEmpty()&& (s.peek() <=ar[i]))
				{
					s.pop();
				}
			}
		
		
		if(!s.isEmpty())
		{
			re[i]=-1;
		}
		else
		{
			re[i]=s.peek();
		}
		s.push(ar[i]);
	 }
		System.out.println();
		for(int a:re)
        {
        	System.out.print(a+" ");
        }
	}

}
