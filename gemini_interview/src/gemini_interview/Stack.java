package gemini_interview;

import java.util.EmptyStackException;


public class Stack {

	private ListNode top;
	private int length;
	private class ListNode{
		private ListNode next;
		private int data;
		ListNode(int data)
		{
			this.data=data;
		}
	}
	Stack()
	{
		top=null;
		length=0;
	}
	public int length()
	{
		return length;
	}
	 
	public boolean isEmpty()
	{
		return length==0;
	}
	public void push(int data)
	{
		ListNode temp=new ListNode(data);
		temp.next=top;
		top=temp;
		length++;
	}
	public int pop()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		int result=top.data;
		top=top.next;
		length--;
		return result;
	}
	public int peek()
	{
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		return top.data;
	}
	public void print()
	{
		ListNode temp=top;
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Stack s=new Stack();
      //System.out.println(s.pop());
       System.out.println(s.isEmpty());
       s.push(20);
       s.push(17);
       s.push(15);
       s.push(10);
       s.push(5);
       System.out.println(s.peek());
      
       s.pop();
       System.out.println(s.length());
       System.out.println(s.peek()+"\n");
      
		s.print();
		
		
		
		
	}

}
