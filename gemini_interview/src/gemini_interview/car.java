package gemini_interview;

public class car extends Vehicle {
	
	public car(int vehicleid, String vehiclename, char categ) {
		super(vehicleid, vehiclename, categ);
		// TODO Auto-generated constructor stub
	}
	public void start()
	{
		super.start();
		System.out.println("car is started"+super.vehicleid);
	}
	public static void stop()
	{
		System.out.println("car is stopped");
	}

}
