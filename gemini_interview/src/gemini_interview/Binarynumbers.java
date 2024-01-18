package gemini_interview;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
public class Binarynumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in); 
		    int n=s.nextInt();
		    String[] r=new String[n];
		Queue<String> q=new LinkedList();
         q.offer("1");
         for(int i=0;i<n;i++)
         {
        	 r[i]=q.poll();
        	 String n1=r[i]+"0";
        	 String n2=r[i]+"1";
        	 q.offer(n1);
        	 q.offer(n2);
         }
         for(int i=0;i<n;i++)
         {
        	 System.out.println(r[i]);
         }
	}

}
