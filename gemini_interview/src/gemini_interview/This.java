package gemini_interview;

public class This {
	This()
	{
		System.out.println("It is a costructor");
	}
	This(int x)
	{
		this();
		System.out.println(x);
	}
	void m()
	{
		System.out.println("hello this is m");
	}
	void n()
	{
		this.m();
		
		System.out.println("hello this is n");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      This s=new This(10);
      s.n();
	}

}
