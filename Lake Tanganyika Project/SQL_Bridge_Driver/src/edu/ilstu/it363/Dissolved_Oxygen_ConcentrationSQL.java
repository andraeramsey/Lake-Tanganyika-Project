package edu.ilstu.it363;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dissolved_Oxygen_ConcentrationSQL
{
	public Class<Dissolved_Oxygen_ConcentrationSQL[]> readMethod()
	{
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(
			"jdbc:mysql://130.225.18.76:3306/cleat_ltkigoma" + "?useSSL=false","CLEATPlot","HmwZVeGJ");
			

		//107-116
		double[][]dissolved_oxygen_concentration_measure = new double[10][48];
		String[][] disolved_oxy_concentrate_time = new String[10][48];
		double[][] d_o_c_offset = new double [10][48];
				
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			int i=0;
			int j=0;
			ResultSet rs=stmt.executeQuery
			("SELECT m.StreamID, m.MeasurementValue, m.MeasurementTime, s.Offset FROM cleat_ltkigoma.measurements m JOIN cleat_ltkigoma.streams s USING (streamID) WHERE StreamID BETWEEN 107 and 116 AND (MeasurementTime LIKE '20__-__-__ __:30:__') ORDER BY MeasurementTime desc, StreamID LIMIT 480;");
			
			while(rs.next())
			{
				if (i==47){
					j++;
				}
				else
				{
				//System.out.println(rs.getDouble(1)+"\t"+rs.getString(2)+"\n");
				
				dissolved_oxygen_concentration_measure[j][i] = rs.getDouble(2);
				disolved_oxy_concentrate_time[j][i] = rs.getString(3);
				d_o_c_offset[j][i] = rs.getDouble(4);
				i++;
				}

			}  
			System.out.println(dissolved_oxygen_concentration_measure[0][0]);
			System.out.println(disolved_oxy_concentrate_time[0][0]);
			System.out.println(d_o_c_offset[0][0]);
			con.close();

		}catch(Exception e){ System.out.println(e);}
		
		return Dissolved_Oxygen_ConcentrationSQL[].class;
			
	}
}
