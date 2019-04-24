/**
 *File Name: AdvInfoBox.java 
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

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * Like the info box but will have arrows on either side that can cycle through measurments for the 2 that have that function
 *
 *@author Jeffrey Ryan
 *
 */
public class AdvInfoBox extends InfoBox
{
	JButton leftButton=new JButton();
	JButton rightButton=new JButton();
	int measurementIndex=0;
	int[] measurements;
	//all but the last parameter is for the infoBox class and the final measurement is the array of measurements for this class
	public AdvInfoBox(Language lang, String permaTitle, TestInfo readings,int leftMargin, int topMargin,int sensor){
		super(lang, permaTitle, readings,leftMargin, topMargin,sensor);
		
		measurements=readings.getAdvancedSensor(sensor);
		measurement=this.measurements[0];
		
		leftButton.setEnabled(false);
		leftButton.setBounds(33,100,40,40);
		leftButton.setVisible(true);
		leftButton.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("./leftArrow.png")));
		//changes the value in the advInfoBox and turns button on/off as needed
		leftButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				measurementIndex--;;
				
				if(measurementIndex==0){
					leftButton.setEnabled(false);
				}
				setMeasurement(measurements[measurementIndex]);
				refresh(language);
				rightButton.setEnabled(true);
				leftButton.repaint();
				rightButton.repaint();
			}
		});
		
		rightButton.setBounds(325,100,40,40);
		rightButton.setVisible(true);
		rightButton.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("./rightArrow.png")));
		
		rightButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				leftButton.setEnabled(true);
				measurementIndex++;
				if(measurementIndex>=measurements.length-1){
					rightButton.setEnabled(false);
				}
				setMeasurement(measurements[measurementIndex]);
				refresh(language);
				leftButton.repaint();
				rightButton.repaint();
			}
		});
		
		mainPanel.add(leftButton);
		mainPanel.add(rightButton);
		mainPanel.setBackground(Color.CYAN);
		refresh(language);
		
	}
	
	
}
