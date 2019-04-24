package edu.ilstu.it363;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Barometric_PressureSQL
{
	public Class<Barometric_PressureSQL[]> readMethod()
	{
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(
			"jdbc:mysql://130.225.18.76:3306/cleat_ltkigoma" + "?useSSL=false","CLEATPlot","HmwZVeGJ");
		
			//65
			double[] barometric_pressure_measure = new double[48];
			String[] barometric_pressure_time = new String[48];
				
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			int i=0;
			ResultSet rs=stmt.executeQuery
			("SELECT MeasurementValue,MeasurementTime FROM cleat_ltkigoma.measurements WHERE StreamID = 65 AND (MeasurementTime LIKE '20__-__-__ __:30:__') ORDER BY MeasurementTime desc LIMIT 48");
			
			while(rs.next())
			{
				barometric_pressure_measure[i] = rs.getDouble(1);
				barometric_pressure_time[i] = rs.getString(2);
				i++;
			}  
			System.out.println(barometric_pressure_measure[0]);
			System.out.println(barometric_pressure_time[0]);
			con.close();

		}catch(Exception e){ System.out.println(e);}
		
		return Barometric_PressureSQL[].class;
			
	}
}
