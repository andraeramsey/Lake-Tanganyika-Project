/**
 *File Name: Interface.java 
 *Programmer: Jeffrey Ryan
 *jryan3
 *
 *Date: Sep 25, 2017
 *
 *Class: IT 179
 *Lecture Section 002
 *Lecture Instructor: Tonya Pierce
 */
package lakeTanganyika;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interface
{
	//initializes classes and the JFrame
	Language lang=new Language();
	JFrame mainInterface=new JFrame();
	//this is the main Panel in the JFrame
	JPanel UIPanel=new JPanel();
	TestInfo databaseReader = new TestInfo();
	

	public Interface(){
		
		//creates a test InfoBox
		/*InfoBox testBox=new InfoBox(lang,"Water Temperature", databaseReader.getBaseSensor(1),0,400);
		testBox.refresh("English");
		AdvInfoBox testAdvBox=new AdvInfoBox(lang,"Barometric Pressure",2000,400,400,databaseReader.getAdvancedSensor(0));
		testAdvBox.refresh("English");
		*/
		InfoBox airTemperature= new InfoBox(lang,"Air Temperature",databaseReader,0,400,0);
		airTemperature.refresh("English");
		AdvInfoBox waterTemperature=new AdvInfoBox(lang, "Water Temperature",databaseReader, 400,400,0);
		waterTemperature.refresh("English");
		InfoBox precipitationIntensity=new InfoBox(lang, "Precipitation Intensity",databaseReader,800,400,1);
		precipitationIntensity.refresh("English");
		InfoBox barometricPressure=new InfoBox(lang, "Barometric Pressure", databaseReader,1200,400,2);
		barometricPressure.refresh("English");
		InfoBox windSpeed=new InfoBox(lang,"Wind Speed", databaseReader,0,700,3);
		windSpeed.refresh("English");
		AdvInfoBox dissolvedOxygenConcentration=new AdvInfoBox(lang,"Dissolved Oxygen Concentration",
				databaseReader,400,700,1);
		dissolvedOxygenConcentration.refresh("English");
		
		mainInterface.setSize(1600, 1039);
		mainInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		UIPanel.setLayout(null);
		UIPanel.add(airTemperature.getMainPanel());
		UIPanel.add(waterTemperature.getMainPanel());
		UIPanel.add(precipitationIntensity.getMainPanel());
		UIPanel.add(barometricPressure.getMainPanel());
		UIPanel.add(windSpeed.getMainPanel());
		UIPanel.add(dissolvedOxygenConcentration.getMainPanel());
		/*
		UIPanel.add(testBox.getMainPanel());
		UIPanel.add(testAdvBox.getMainPanel());
		*/
		UIPanel.setVisible(true);
		mainInterface.add(UIPanel);
		
		mainInterface.setVisible(true);
		
		
	
	}
	

}