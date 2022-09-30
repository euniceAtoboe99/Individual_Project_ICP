import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Routes {

	// instance variables 
	
	String Airline_code;
	String Airline_ID;
	String SA_code;
	int SA_ID;
	String DA_code;
	String DA_ID;
	String Codeshare;
	int Stops;
	String Equipment;
	
	
	//constructor declaration of class
	
	public Routes(String Airline_code, String Airline_ID, String SA_code, int SA_ID, String DA_code, String DA_ID, String Codeshare, int Stops, String Equipment)
	{
		this.Airline_code = Airline_code;
		this.Airline_ID = Airline_ID;
		this.SA_code = SA_code;
		this.SA_ID = SA_ID;
		this.DA_code = DA_code;
		this.DA_ID = DA_ID;
		this.Codeshare = Codeshare;
		this.Stops = Stops;
		this.Equipment = Equipment;
	}
	
	// method 1
			public String getAirline_code()
			{
				return Airline_code;
			}
			
	// method 2
	public String getAirline_ID()
	{
		return Airline_ID;
	}
	
	// method 3
	public String getSA_code()
	{
		return SA_code;
	}
	
	// method 4
	public int getSA_ID()
	{
		return SA_ID;
	}
	
	// method 5
	public String getDA_code()
	{
		return DA_code;
	}
	
	// method 6
	public String getDA_ID()
	{
		return DA_ID;
	}
	
	// method 7
		public String getCodeshare()
		{
			return Codeshare;
		}
	
	// method 8
	public int getStops()
	{
		return Stops;
	}
	
	// method 9
		public String getEquipment()
		{
			return Equipment;
		}
		
		public static void main(String[] args) {
			String path = "C:/Users/Eunice Atoboe/OneDrive - Ashesi University/Ashesi university/Sophomore year/Semester Two/Intermediate Computer Programming/airlines.csv";
			String line2 = "";
		
			try {
				BufferedReader br = new BufferedReader(new FileReader(path));
			
				 while((line2 = br.readLine()) != null) {
					 System.out.println(line2);
				 }
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				  e.printStackTrace();
			  }
				
			}		
		
		
		
}
