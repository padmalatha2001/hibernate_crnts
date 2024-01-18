package gemini_interview;

public class CircularLinkedList {
    private ListNode last;
    private int length;
    private class ListNode
    {
    	private ListNode next;
    	private int data;
    	public ListNode(int data)
    	{
    		this.data=data;
    	}
    	
    	
       }
    public CircularLinkedList()
    {
    	last=null;
    	length=0;
    }
    public int length()
    { 
    	length=0;
    	ListNode temp=last.next;
    	while(temp!=null)
    	{
    		length++;
    		temp=temp.next;
    	}
    	return length;
    }
	public boolean isEmpty()
	{
		return length==0;
	}
	public void createCll()
	{
		ListNode first=new ListNode(1);
		ListNode second=new ListNode(5);
		ListNode thi=new ListNode(10);
		ListNode fo=new ListNode(15);
		first.next=second;
		second.next=thi;
		thi.next=fo;
		fo.next=first;
		last= fo;
	}
	public void print()
	{
		if(last==null)
			  return;
		ListNode temp=last.next;
		while(temp!=last)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
			
		}
		
		System.out.println(temp.data);
		
	}
	public void insertfirst(int data)
	{
		ListNode temp=new ListNode(20);
		ListNode temp1=last.next;
		last.next=temp;
		temp.next=temp1;
		length++;
	}
	public void insertlast(int data)
	{
		ListNode temp=new ListNode(25);
         if(last==null)
         {
        	 last=temp;
        	 last.next=last;
         }
         else
         {
        	 temp.next=last.next;
        	 last.next=temp;
        	 last=temp;
         }
         length++;
	}
	public void removefirst()
	{
		last.next=last.next.next;
		length--;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList cll=new CircularLinkedList();
		  cll.createCll();
          cll.print();
          cll.insertfirst(20);
          System.out.println();
          cll.print();
          cll.insertlast(25);
          System.out.println();
          cll.print();
          cll.removefirst();
          System.out.println();
          cll.print();
          
          System.out.println(cll.length());
	}

}
