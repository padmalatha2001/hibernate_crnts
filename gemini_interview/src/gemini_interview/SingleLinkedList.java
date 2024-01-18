package gemini_interview;

public class SingleLinkedList {
      private ListNode head;
      private static class ListNode{
    	  private int data;
    	  private ListNode next;
    	  ListNode(int data)
    	  {
    		  this.data=data;
    		  this.next=null;
    	  }
     }
      public void display()
      {
    	  ListNode temp=head;
    	  while(temp!=null)
    	  {
    		  System.out.print(temp.data+"->");
    		  temp=temp.next;
    	  }
      }
      public int length()
      {
    	  ListNode temp=head;
    	  int count =0;
    	  while(temp!=null)
    	  {
    		  temp=temp.next;
    		  count++;
    	  }
    	  
    	  return count;
      }
      public void insertfirst(int data)
      {
    	ListNode temp=new ListNode(data);
    	if(head==null)
    	{
    		head=temp;
    	}
    	temp.next=head;
    	head=temp;
      }
      public void insertlast(int data)
      {
    	  ListNode temp=new ListNode(data);
    	  ListNode current=head;
    	  while(current.next!=null)
    	  {
    		  current=current.next;
    	  }
    	  temp.next=null;
    	  current.next=temp;
    	  
      }
      public void insertpos(int pos,int data)
      {
    	  ListNode temp=new ListNode(data);
    	  
    	  if(pos==1)
    	  {
    		  temp.next=head;
    		  head=temp;
    	  }
    	  ListNode current=head;
    	   int count=1;
    	  while(count<pos-1)
    	  {
    		  current=current.next;
    		  count++;
    	  }
    	  ListNode la=current.next;
    	  current.next=temp;
    	  temp.next=la;
      }
      public int deletefirst()
      {
    	  ListNode temp=head;
    	  int k=head.data;
    	  head=head.next;
    	  return k;
      }
      public void deletelast()
      {
    	  ListNode pre=null;
    	  ListNode curr=head;
    	  while(curr.next!=null)
    	  {
    		  pre=curr;
    		  curr=curr.next;
    	  }
    	 
    	  pre.next=null;
   
    	  
      }
      public void deletepos(int pos)
      {
    	  if(pos==1)
    	  {
    		  head=head.next;
    	  }
    	  ListNode pre=head;
    	  int count=1;
    	  while(count<pos-1)
    	  {
    		  pre=pre.next;
    		  count++;
    	  }
    	  ListNode current=pre.next;
    	  pre.next=current.next;
    	  current.next=null;
      }
      public void reverse(ListNode head)
      {
    	  ListNode previous=null;
    	  ListNode current=head;
    	  ListNode next=null;
    	  while(current!=null)
    	  {
    		  next=current.next;
    		  current.next=previous;
    		  previous=current;
    		  current=next;
    		  
    	 }
    	  
    	  while(previous!=null)
    	  {
    		  System.out.print(previous.data+"->");
    		  previous=previous.next;
    	  }
      }
      public void middle()
      {
    	  ListNode slow=head;
    	  ListNode fast=head;
    	  while(fast!=null&&fast.next!=null)
    	  {
    		  slow=slow.next;
    		  fast=fast.next.next;
    	  }
    	  System.out.println("\n\n"+slow.data);
      }
      public void nthend(int pos)
      {
    	  ListNode nptr=head;
    	  ListNode mptr=head;
    	  int count=0;
    	  while(count<pos&&nptr!=null)
    	  {
    		  nptr=nptr.next;
    		  count++;
    	  }
    	  while(nptr!=null)
    	  {
    		  nptr=nptr.next;
    		  mptr=mptr.next;
    	  }
    	  
    	  System.out.println("  "+mptr.data);
      }
      public boolean find(int num)
      {
    	  ListNode temp=head;
    	  while(temp!=null)
    	  {
    		  if(num==temp.data)
    		  {
    			  return true;
    		  }
    		  temp=temp.next;
    	  }
    	  return false;
      }
      public void removedupli()
      {
    	  ListNode temp=head;
    	  ListNode next=null;
    	  while(temp!=null)
    	  {
    		  if(temp.data==temp.next.data)
    		  {
    			  next=temp.next.next;
    			  temp.next.next=null;
    			  temp.next=next;
    		  }
    		  temp=temp.next;
    	  }
      }
      public void insertinsorted(int k)
      {
    	  ListNode ne=new ListNode(k);
    	  ListNode temp=null;
    	  ListNode current=head;
    	  if(head==null)
    	  {
    		  head=ne;
    	  }
    	  else
    	  {
    		  while(current!=null&&current.data<ne.data)
    		  {
    			  temp=current;
    			  current=current.next;
    		  }
    		  ne.next=current;
    		  temp.next=ne;
    		  
    	  }
      }
      public void removekey(int key)
      {
    	  ListNode temp=head;
    	  ListNode cu=null;
    	  
    	  while(temp!=null&&temp.data!=key)
    	  {
    		  cu=temp;
    		  temp=temp.next;
    	  }
    	  cu.next=temp.next;
      }
   /*   public ListNode loop()
       {
    	  ListNode fptr=head;
    	  ListNode sptr=head;
    	  while(fptr!=null&&fptr.next!=null)
    	  {
    		  
    		  sptr=sptr.next;
    		  fptr=fptr.next.next;
    		  if(sptr==fptr)
    		  {
    			  return loopdata(sptr);
    		  }
    	  }
    	  return null;
      }
      public ListNode loopdata(ListNode sptr)
      {
    	  ListNode temp=head;
    	  while(temp!=sptr)
    	  {
    		temp=temp.next;
    		sptr=sptr.next;
    	  }
    	  return temp;
      }
      */
     public void loop()
     {
   	  ListNode fptr=head;
   	  ListNode sptr=head;
   	   while(fptr!=null&&fptr.next!=null)
   	   {
   		  
   		  sptr=sptr.next;
   		  fptr=fptr.next.next;
   		  if(sptr==fptr)
   		  {
   			  removeloop(sptr);
   			  return;
   		  }
   	   }
     }
     public void removeloop(ListNode sptr)
     {
    	 ListNode temp=head;
   	    while(temp.next!=sptr.next)
   	    {
   		  temp=temp.next;
   		  sptr=sptr.next;
   	    }
   	     sptr.next=null;
     }
     public void merge(ListNode a,ListNode b)
     {
    	 ListNode dum=new ListNode(0);
    	 ListNode temp=dum;
    	 while(a!=null&&b!=null)
    	 {
    		 if(a.data<=b.data)
    		 {
    			 temp.next=a;
    			 a=a.next;
    		 }
    		 else
    		 {
    			 temp.next=b;
    			 b=b.next;
    		 }
    		 temp=temp.next;
    	 }
    	 if(a!=null)
    		  temp.next=a;
    	 else if(b!=null)
    		 temp.next=b;
    	 
    	
    	 dum=dum.next;
    	 while(dum!=null)
    	 {
    		 System.out.print(dum.data+"-->");
    		 dum=dum.next;
    	 }
    	 
     }
     public void addtwo(ListNode a,ListNode b)
     {
    	 ListNode dum=new ListNode(0);
    	 ListNode tail=dum;
    	 int c=0;
    	 while(a!=null || b!=null)
    	 {
    		 int x= (a!=null)?a.data:0;
    		 int y=(b!=null)?b.data:0;
    		 int sum=x+y+c;
    		 c=sum/10;
    		 tail.next=new ListNode(sum%10);
    		 tail=tail.next;
    		 if(a!=null)
    			 a=a.next;
    		 if(b!=null)
    			 b=b.next;
    		 
    	 }
    	 if(c>0)
    		 tail.next=new ListNode(c);
    	 
    	 dum=dum.next;
    	 System.out.print("\n");
    	 while(dum!=null)
    	 {
    		 System.out.print(dum.data+"-->");
    		 dum=dum.next;
    	 }
    	 
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SingleLinkedList ln=new SingleLinkedList();
    /*  head =new ListNode(1);
      ListNode sec=new ListNode(2);
      ListNode thi=new ListNode(3);
      ListNode fou=new ListNode(5);
      head.next=sec;
      sec.next=thi;
      thi.next=fou;
      ln.insertfirst(1);
      ln.insertlast(5);
     // ln.insertpos(5, 17);
      //ln.insertpos(4, 25);
      ln.removedupli();
      System.out.println(ln.length());
        ln.insertinsorted(4);
       ln.removekey(3);
     ln.display();
      //ln.middle();
       
       */
      
     // ln.nthend(1);
     // ln.reverse(head);
      
      //System.out.println(ln.find(3));
      ln.head=new ListNode(7);
      ListNode se=new ListNode(4);
      ListNode th=new ListNode(9);
      
      SingleLinkedList sl1=new SingleLinkedList();
      sl1.head=new ListNode(5);
      ListNode fo=new ListNode(6);
      /*ListNode fi=new ListNode(5);
      ListNode six=new ListNode(7);
      ListNode seve=new ListNode(8);
      */
      
      ln.head.next=se;
      se.next=th;
      th.next=null;
      
      sl1.head.next=fo;
      fo.next=null;
      /* fi.next=six;
      six.next=seve;
      seve.next=null;
     */
     
        //ln.loop();
        ln.display();
        System.out.println("\n");
        sl1.display();
        System.out.println("\n");
        //ln.merge(ln.head,sl1.head);
        ln.addtwo(ln.head, sl1.head);
	}

}
