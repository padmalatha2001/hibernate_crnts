package gemini_interview;

public class methodoverloading {

	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         methodoverloading me=new methodoverloading();
         me.add(10, 20);
         me.add(10, 20,30);
	}

}
