package gemini_interview;
import java.util.*;
import java.util.Stack;
public class Validparanthesis {

	
	public boolean isvalid(String s)
	{
		 char[] ch=s.toCharArray();
	       Stack<Character> st=new Stack<Character>();
	       for(char c:ch)
	       {
	    	   if(c=='('||c=='{'||c=='[')
	    	   {
	    		   st.push(c);
	    	   }
	    	   else
	    	   {
	    		   if(st.isEmpty())
	    		   {
	    			   return false;
	    		   }
	    		   else
	    		   {
	    			   char cha=st.peek();
	    			   if((c=='}'&&cha=='{')||(c==')'&&cha=='(')||(c==']'&&cha=='['))
	    			   {
	    				  st.pop(); 
	    			   }
	    			   else
	    			   {
	    				   return false;
	    			   }
	    		   }
	    	   }
	       }
               return st.isEmpty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
       String s=sc.next();
       sc.nextLine();
       Validparanthesis v=new Validparanthesis();
       if(v.isvalid(s))
       {
    	   System.out.println("Given String is valid parenthesis");
       }
       else
       {
    	   System.out.println("Given String is not a valid parenthesis");
       }
   }

}
