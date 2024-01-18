package gemini_interview;

import java.util.NoSuchElementException;

public class Queue {
       private ListNode front;
       private ListNode rear;
       int length;
       public Queue()
       {
    	   this.front=null;
    	   this.rear=null;
    	   this.length=0;
       }
       private class ListNode{
    	  private int data;
    	  private ListNode next;
    	   public ListNode(int data)
    	   {
    		   this.data=data;
    		   this.next=null;
    	   }
       }
       public boolean isEmpty()
       {
    	   return length==0;
       }
       public int length()
       {
    	  return length;
       }
       public void enqueue(int data)
       {
    	   ListNode temp=new ListNode(data);
    	   if(isEmpty())
    		   front=temp;
    	   else
    		   rear.next=temp;
    	   
    	   rear=temp;
    	   length++;
       }
       public int deque()
       {
    	   if(isEmpty())
    	   {
    		   throw new NoSuchElementException();
    	   }
    	   int d=front.data;
    	   if(front==null)
    		    rear=null;
    	   front=front.next;
    	   length--;
    	   return d;
       }
       public void print()
       {
    	   ListNode temp=front;
    	   while(temp!=null)
    	   {
    		   System.out.print(temp.data+"-->");
    		   temp=temp.next;
    	   }
    	   System.out.print("null");
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue q=new Queue();
        System.out.println(q.isEmpty());
       q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.print();
        
        System.out.println(q.length());
        
        System.out.println(q.deque());
        System.out.println();
        System.out.println(q.length());
        System.out.println();
        q.print();
        
	}

}
