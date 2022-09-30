import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Airport {
	// Instance variables
	int Airport_ID;
	String Name;
	String City;
	String Country;
	String IATA_code;
	String ICAO_code;
	float Latitude;
	float Longitude;
	int Altitude;
	int Timezone;
	char DST;
	String Tz;
	String type;
	String source_data;


//constructor declaration of class
	public Airport(int ID, String Name, String City, String Country, String IATA_code, String ICAO_code, float Latitude, float Longitude, int Altitude, int Timezone, char DST, String Tz,
	String type, String source_data)
	{
		this.Airport_ID = Airport_ID;
		this.Name = Name;
		this.City = City;
		this.Country = Country;
		this.IATA_code = IATA_code;
		this.ICAO_code = ICAO_code;
		this.Latitude = Latitude;
		this.Longitude = Longitude;
		this.Altitude = Altitude;
		this.Timezone = Timezone;
		this.DST = DST;
		this.Tz = Tz;
		this.type = type;
		this.source_data = source_data;
	}
	// method 1
	public int getAirport_ID()
	{
		return Airport_ID;
	}
	
	// method 2
	public String getName()
	{
		return Name;
	}

	// method 3
		public String getCity()
		{
			return City;
		}

		// method 4
		public String getCountry()
		{
			return Country;
		}
	
		
		// method 5
		public String getIATA_code()
		{
			return IATA_code;
		}
	
		
		// method 6
				public String getICAO_code()
				{
					return ICAO_code;
				}
				
		// method 7
		public float getLatitude()
		{
			return Latitude;
		}
				
				
		// method 8
		public float getLongitude()
		{
			return Longitude;
		}
			
		
		// method 9
		public int getAltitude()
		{
			return Altitude;
		}

		
		// method 10
		public int getTimezone()
		{
			return Timezone;
		}
		
		
		// method 11
				public char getDST()
				{
					return DST;
				}
				
				
		// method 12
		public String getTz()
		{
			return Tz;
		}
				
				
		
		// method 13
		public String gettype()
		{
			return type;
		}
			
			

		// method 14
		public String getsource_data()
		{
			return source_data;
		}
			
		public static void main(String[] args) {
			String path = "C:/Users/Eunice Atoboe/OneDrive - Ashesi University/Ashesi university/Sophomore year/Semester Two/Intermediate Computer Programming/airports.csv";
			String line = "";
		
			try {
				BufferedReader br = new BufferedReader(new FileReader(path));
			
				 while((line = br.readLine()) != null) {
					 System.out.println(line);
				 }
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				  e.printStackTrace();
			  }
				
			}		
		}
}
