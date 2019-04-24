package edu.ilstu.it363;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Air_TempSQL
{
	//public static void main(String[] args)
	public Class<Air_TempSQL[]> readMethod()
	{
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(
			"jdbc:mysql://130.225.18.76:3306/cleat_ltkigoma" + "?useSSL=false","CLEATPlot","HmwZVeGJ");
			
		double [] air_temp_measure = new double[48];
		String[] air_temp_time= new String[48];
				
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			int i=0;
			ResultSet rs=stmt.executeQuery
			("SELECT MeasurementValue,MeasurementTime FROM cleat_ltkigoma.measurements WHERE StreamID = 66 AND (MeasurementTime LIKE '20__-__-__ __:30:__') ORDER BY MeasurementTime desc LIMIT 48");
			
			while(rs.next())
			{
				//System.out.println(rs.getDouble(1)+"\t"+rs.getString(2)+"\n");
				//66
				air_temp_measure[i] = rs.getDouble(1);
				air_temp_time[i] = rs.getString(2);
				i++;

			}  
			System.out.println(air_temp_measure[0]);
			System.out.println(air_temp_time[0]);
			con.close();

		}catch(Exception e){ System.out.println(e);}
		
		return Air_TempSQL[].class;
			
	}
}
