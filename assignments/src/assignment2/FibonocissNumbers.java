//write a program to print only 2 digit fibonocii numbers
package assignment2;

public class FibonocissNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=5;
		int n2=8;
	    int n3=n1+n2;
	     System.out.println(n3);
	     while(n3<100)
	     {
	    	 n1=n2;
	    	 n2=n3;
	    	 n3=n1+n2;
	    	 if(n3>100)
	    		 break;
	    	 System.out.println(n3);
	     }
		
	}

}
