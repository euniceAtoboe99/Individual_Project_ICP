import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Airlines {
	// instance variables 
	
	int Airline_ID;
	String Name;
	String Alias;
	String IATA_code;
	String ICAO_code;
	String Callsign;
	String Country;
	char Active;

	//constructor declaration of class
	public Airlines(int Airline_ID, String Name, String Alias, String IATA_code, String ICAO_code, String Callsign, String Country, char Active)
	{
		this.Airline_ID = Airline_ID;
		this.Name = Name;
		this.Alias = Alias;
		this.IATA_code = IATA_code;
		this.ICAO_code = ICAO_code;
		this.Callsign = Callsign;
		this.Country = Country;
		this.Active = Active;
	}
	
	// method 1
		public int getAirline_ID()
		{
			return Airline_ID;
		}
		
	// method 2
			public String getName()
			{
				return Name;
			}
			
	// method 3
	public String getAlias()
	{
		return Alias;
	}
	
	// method 4
		public String getIATA_code()
		{
			return IATA_code;
		}
		
	// method 5
	public String getICAO_code()
	{
		return ICAO_code;
	}
	
	// method 6
	public String getCallsign()
	{
		return Callsign;
	}
	
	// method 7
	public String getCountry()
	{
		return Country;
	}
	
	// method 
		public char getActive()
		{
			return Active;
		}	
		
		public static void main(String[] args) {
			String path = "C:/Users/Eunice Atoboe/OneDrive - Ashesi University/Ashesi university/Sophomore year/Semester Two/Intermediate Computer Programming/airlines.csv";
			String line1 = "";
		
			try {
				BufferedReader br = new BufferedReader(new FileReader(path));
			
				 while((line1 = br.readLine()) != null) {
					 System.out.println(line1);
				 }
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				  e.printStackTrace();
			  }
				
			}		
		
		
}
