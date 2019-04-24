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
	
	public AdvInfoBox(Language lang,String test){
		super(lang);
		System.out.println(title);
		mainPanel.setBounds(300,350,300,400);
		
		
		leftButton.setEnabled(false);
		leftButton.setBounds(50,100,40,40);
		leftButton.setVisible(true);
		
		leftButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				measurementIndex--;;
				if(measurementIndex==0){
					leftButton.setEnabled(false);
				}
				rightButton.setEnabled(true);
				leftButton.repaint();
				rightButton.repaint();
			}
		});
		
		rightButton.setBounds(250,100,40,40);
		rightButton.setVisible(true);
		
		rightButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				leftButton.setEnabled(true);
				measurementIndex++;
				if(measurementIndex>4){
					rightButton.setEnabled(false);
				}
				leftButton.repaint();
				rightButton.repaint();
			}
		});
		
		mainPanel.add(leftButton);
		mainPanel.add(rightButton);
		
	}
	
	
}
