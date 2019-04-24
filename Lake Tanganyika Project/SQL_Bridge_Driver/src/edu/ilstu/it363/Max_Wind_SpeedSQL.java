package edu.ilstu.it363;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Max_Wind_SpeedSQL
{
	public Class<Max_Wind_SpeedSQL[]> readMethod()
	{
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(
			"jdbc:mysql://130.225.18.76:3306/cleat_ltkigoma" + "?useSSL=false","CLEATPlot","HmwZVeGJ");
			
			//64
			double wind_velo_max_measure = 0;
			
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs=stmt.executeQuery("SELECT MAX(MeasurementValue) FROM cleat_ltkigoma.measurements WHERE StreamID = 64 GROUP BY MeasurementTime HAVING MAX(MeasurementValue) ORDER BY MeasurementTime desc LIMIT 48");	

			while(rs.next())
			{
				wind_velo_max_measure = rs.getDouble(1);
				break;
			}
			System.out.println(wind_velo_max_measure);
			con.close();
			
		}catch(Exception e){ System.out.println(e);}
		
		return Max_Wind_SpeedSQL[].class;
			
	}

}
