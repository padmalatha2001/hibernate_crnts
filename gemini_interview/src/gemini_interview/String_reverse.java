package gemini_interview;
import java.util.Stack;
public class String_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String str="padma";
		Stack<Character> s=new Stack<Character>();
		char[] ar=str.toCharArray();
		for(int i=0;i<ar.length;i++)
		{
			s.push(ar[i]);
		}
		for(int i=0;i<str.length();i++)
		{
			ar[i]=s.pop();
		}
		String st=new String(ar);
		System.out.println(st);
	}

}
