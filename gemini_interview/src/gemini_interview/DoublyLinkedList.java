package gemini_interview;

public class DoublyLinkedList {
	    private ListNode head;
	    private ListNode tail;
	    private int length;
	    class ListNode{
	    	private int data;
	    	private ListNode previous;
	    	private ListNode next;
	    	ListNode(int data)
	    	{
	    		this.data=data;
	    	}
	    }
	    DoublyLinkedList()
	    {
	    	this.head=null;
	    	this.tail=null;
	    	this.length=0;
	    }
	    public boolean isEmpty()
	    {
	    	return length==0;
	    }
	    public int length()
	    {
	      /*	ListNode temp=head;
	    	int count=0;
	    	while(temp!=null)
	    		{
	    		   count++;
	    		   temp=temp.next;
	    		}
	    		*/
	    		
	    	return length;
	    }
	    public void insertbig(int data)
	    {
	    	ListNode ne=new ListNode(data);
	    	if(isEmpty())
	    	{
	    		tail=ne;
	    		length++;
	    	}
	    	else
	    	{
	    		head.previous=ne;
	    	}
	    	ne.next=head;
	    	head=ne;
	    	length++;
	    }
	    public void insertla(int data)
	    {
	    	ListNode ne=new ListNode(data);
	    	if(isEmpty())
	    	{
	    		head=ne;
	    	}
	    	else
	    	{
	           tail.next=ne;
	           ne.previous=tail;
	    	}
	    	tail=ne;
	    	length++;
	    }
	    public void insertpos(int pos,int data)
	    {
	    	ListNode ne=new ListNode(data);
	    	if(pos==1)
	    	{
	    		ne.next=head;
	    		head.previous=ne;
	    		head=ne;
	    		length++;
	    	}
	    	else
	    	{
	    		int count=1;
	    		ListNode previous=null;
	    		ListNode current=head;
	    		while(current!=null&&count!=pos)
	    		{
	    				current=current.next;
	    				previous=current.previous;
	    				count++;
	    		}
	    		previous.next=ne;
	    		ne.next=current;
	    		current.previous=ne;
	    		ne.previous=previous;
	    		length++;
	    		
	    	}
	    }
       public void displayfo()
       {
    	   ListNode temp=head;
    	   while(temp!=null)
    	   {
    		   System.out.print(temp.data+"-->");
    		   temp=temp.next;
    	   }
    	   System.out.print("null");
    		    
       }
       public void displayba()
       {
    	   ListNode temp=tail;
    	   while(temp!=null)
    	   {
    		   System.out.print(temp.data+"-->");
    		   temp=temp.previous;
    		   
    	   }
    	   System.out.print("null");
       }
       public void deletefi()
       {
    	   
    	   head=head.next;
    	   head.previous=null;
    	   length--;
       }
       public void deletela()
       {
    	  tail=tail.previous;
    	  tail.next=null;
    	  length--;
       }
       public void deletepos(int pos)
       {
    	   if(pos==1)
    	   {
    		   head=head.next;
        	   head.previous=null;
        	   length--;   
    	   }
    	   else
    	   {
    		   ListNode temp=head;
    		   ListNode pre=null;
    		   while(temp!=null&& pos>0)
    		   {
    			   pre=temp;
    			   temp=temp.next;
    			   pos--;
    		   }
    		   pre.previous.next=temp.next;
    		   temp.previous=pre.previous;
    		   length--;
    	   }
       }
       public void middle()
       {
    	   ListNode temp=head;
    	   ListNode temp1=tail;
    	   while(temp!=null && temp1!=null)
    	   {
    		   if(temp==temp1)
    			    System.out.println(temp.data);
    		   else if(temp.next==temp1)
    			     System.out.println(temp1.data);
    		   
    			   temp=temp.next;
    			   temp1=temp1.previous;
    			   
    		   
    	   }
       }
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.insertbig(10);
		dll.insertbig(9);
		dll.insertbig(8);
		dll.insertbig(7);
		dll.insertbig(6);
		dll.insertla(11);
		dll.insertpos(3, 15);
		dll.displayfo();
		
		System.out.print("\n\n");
		//dll.deletefi();
		//dll.deletela();
 
//dll.displayba();
 dll.middle();
		
		
		System.out.println(dll.length());
		

	}

}
