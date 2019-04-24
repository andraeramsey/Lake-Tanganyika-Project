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
	

	public Interface(){
		
		//creates a test InfoBox
		InfoBox testBox=new InfoBox(lang);
		AdvInfoBox testAdvBox=new AdvInfoBox(lang,"Barometric Pressure");
		mainInterface.setSize(1500, 1300);
		mainInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		UIPanel.setLayout(null);
		UIPanel.add(testBox.getMainPanel());
		UIPanel.add(testAdvBox.getMainPanel());
		UIPanel.setVisible(true);
		mainInterface.add(UIPanel);
		
		mainInterface.setVisible(true);
		
		
	
	}
	

}