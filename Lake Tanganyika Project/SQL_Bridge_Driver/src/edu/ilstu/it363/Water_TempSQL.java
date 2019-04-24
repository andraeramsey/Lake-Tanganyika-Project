package edu.ilstu.it363;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Water_TempSQL
{
	public Class<Water_TempSQL[]> readMethod()
	{
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(
			"jdbc:mysql://130.225.18.76:3306/cleat_ltkigoma" + "?useSSL=false","CLEATPlot","HmwZVeGJ");
		
		//117-131	
		double[][] water_temp_measure = new double[15][48];
		String[][] water_temp_time = new String[15][48];
		double[][] d_o_c_offset = new double [15][48];
				
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			int i=0;
			int j=0;
			ResultSet rs=stmt.executeQuery
			("SELECT m.StreamID, m.MeasurementValue, m.MeasurementTime, s.Offset FROM cleat_ltkigoma.measurements m JOIN cleat_ltkigoma.streams s USING (streamID) WHERE StreamID BETWEEN 117 and 131 AND (MeasurementTime LIKE '20__-__-__ __:30:__') ORDER BY MeasurementTime desc, StreamID LIMIT 720");
			
			while(rs.next())
			{
				if (i==47){
					j++;
				}
				else
				{
				//System.out.println(rs.getDouble(1)+"\t"+rs.getString(2)+"\n");
				
				water_temp_measure[j][i] = rs.getDouble(2);
				water_temp_time[j][i] = rs.getString(3);
				d_o_c_offset[j][i] = rs.getDouble(4);
				i++;
				}

			}  
			System.out.println(water_temp_measure[0][0]);
			System.out.println(water_temp_time[0][0]);
			System.out.println(d_o_c_offset[0][0]);
			con.close();

		}catch(Exception e){ System.out.println(e);}
		
		return Water_TempSQL[].class;
			
	}
}
