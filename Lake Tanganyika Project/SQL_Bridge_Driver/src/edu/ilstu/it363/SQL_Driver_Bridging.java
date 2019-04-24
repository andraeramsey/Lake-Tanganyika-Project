package edu.ilstu.it363;

public class SQL_Driver_Bridging
{
	static Dissolved_Oxygen_ConcentrationSQL dissolved_oxygen_concentration=new Dissolved_Oxygen_ConcentrationSQL();	
	static Air_TempSQL air_temp=new Air_TempSQL();
	static Water_TempSQL water_temp=new Water_TempSQL();
	static Precipition_IntensitySQL percipitation_intensity=new Precipition_IntensitySQL();
	static Barometric_PressureSQL barometric_pressure=new Barometric_PressureSQL();
	static Wind_SpeedSQL wind_speed=new Wind_SpeedSQL();
	static Max_Wind_SpeedSQL max_wind_speed=new Max_Wind_SpeedSQL();
		
	public static void main(String[] args)
	{
		/*history needs parsed to 2 decimal spaces, and displayed as an int 
		(except for wind speed parsed to 3 spaces for display and 2 spaces for history)*/
		
		System.out.println("Dissolved Oxygen Concentration");
		dissolved_oxygen_concentration.readMethod();
		System.out.print("\n");
		
		System.out.println("Air Temoerature");
		air_temp.readMethod();
		System.out.print("\n");
		
		System.out.println("Water Temperature");
		water_temp.readMethod();
		System.out.print("\n");
		
		System.out.println("Precipition Intensity");
		percipitation_intensity.readMethod();
		System.out.print("\n");
		
		System.out.println("Barometric Pressure");
		barometric_pressure.readMethod();
		System.out.print("\n");
		
		System.out.println("Wind Speed");
		wind_speed.readMethod();
		System.out.print("\n");
		
		System.out.println("Max Wind Speed");
		max_wind_speed.readMethod();
		
		/*-------------------------------------------*/
		
		
	}

	/**
	 * @return the dissolved_oxygen_concentration
	 */
	public static Dissolved_Oxygen_ConcentrationSQL getDissolved_oxygen_concentration()
	{
		return dissolved_oxygen_concentration;
	}

	/**
	 * @return the air_temp
	 */
	public static Air_TempSQL getAir_temp()
	{
		return air_temp;
	}

	/**
	 * @return the water_temp
	 */
	public static Water_TempSQL getWater_temp()
	{
		return water_temp;
	}

	/**
	 * @return the percipitation_intensity
	 */
	public static Precipition_IntensitySQL getPercipitation_intensity()
	{
		return percipitation_intensity;
	}

	/**
	 * @return the barometric_pressure
	 */
	public static Barometric_PressureSQL getBarometric_pressure()
	{
		return barometric_pressure;
	}

	/**
	 * @return the wind_speed
	 */
	public static Wind_SpeedSQL getWind_speed()
	{
		return wind_speed;
	}

	/**
	 * @return the max_wind_speed
	 */
	public static Max_Wind_SpeedSQL getMax_wind_speed()
	{
		return max_wind_speed;
	}
		
}
