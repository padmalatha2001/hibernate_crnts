package gemini_interview;

public class Vehicle {
	public int vehicleid;
	private String vehiclename;
	private static char categ;
	
	
      
   public Vehicle(int vehicleid, String vehiclename,char categ) {
		
		this.vehicleid = vehicleid;
		this.vehiclename = vehiclename;
		this.categ=categ;
		
	}
public void start()
   {
	   System.out.println(vehicleid+" "+vehiclename+" "+categ);
   }
   public static void stop(Vehicle v)
   {
	   System.out.println(v.vehicleid+" "+v.vehiclename+" "+categ);
   }
}
