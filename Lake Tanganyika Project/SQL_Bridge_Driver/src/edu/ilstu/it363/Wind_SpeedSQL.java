package edu.ilstu.it363;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Wind_SpeedSQL
{
	public Class<Wind_SpeedSQL[]> readMethod()
	{
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(
			"jdbc:mysql://130.225.18.76:3306/cleat_ltkigoma" + "?useSSL=false","CLEATPlot","HmwZVeGJ");
		
			//63
			double[] wind_velo_avg_measure = new double[48];
			String[] wv_measure_time = new String[48];
				
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			int i=0;
			ResultSet rs=stmt.executeQuery
			("SELECT MeasurementValue,MeasurementTime FROM cleat_ltkigoma.measurements WHERE StreamID = 63 AND (MeasurementTime LIKE '20__-__-__ __:30:__') ORDER BY MeasurementTime desc LIMIT 48");
			
			while(rs.next())
			{				
				wind_velo_avg_measure[i] = rs.getDouble(1);
				wv_measure_time[i] = rs.getString(2);
				i++;
			}  
			System.out.println(wind_velo_avg_measure[0]);
			System.out.println(wv_measure_time[0]);
			con.close();

		}catch(Exception e){ System.out.println(e);}
		
		return Wind_SpeedSQL[].class;
			
	}
}
