/**
 *File Name: InfoBox.java 
 *Programmer: Jeffrey Ryan
 *jryan3
 *
 *Date: Sep 25, 2017
 *
 */
package lakeTanganyika;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * <Insert class description here>
 *
 *@author Jeffrey Ryan
 *
 */

public class InfoBox
{
	Language langChanger=new Language();
	//this title never changes so the class can be identified easily;
	String permaTitle="Air Temperature";
	//this title changes depending on the language and is displayed in the infobox
	String title="Air Temp";
	String language="English";
	
	//the value that we read for this info at the database
	String measurement="25 Celcius";
	
	
	//information that goes into the detail box
	String details="<html>Here's a peice thats quite perverse,<br> its the same, every verse. So for better or for worse<br> weve 16 more to go."
			+ "one by one<br> we count them all its the same off the wall so in<br> case youve lost them all weve 15 more to go.</html>";
	
	String detailLabel="Details";
	String detailHideLabel="Hide Details";
	
	//the whole infoBox essentially is in this panel and it is in a panel so it can easily be placed into the interface
	JPanel mainPanel=new JPanel();
	
	//the display for the measurement variable
	JLabel measurementLabel=new JLabel(measurement);

	
	//the label with the details inside it so it can be placed into the mainPanel
	JLabel detailBox=new JLabel(details);
	
	//label that has the title
	JLabel titleLabel=new JLabel(title);
	
	//font size used for the title of the infoBox
	Font bigFont=new Font("serif", Font.PLAIN, 50);
	
	//display details button
	JButton detailButton=new JButton(detailLabel);
	
	//hide details button
	JButton detailHideButton=new JButton(detailHideLabel);
	
	//refresh button
	JButton refreshButton=new JButton("Refresh");

	//constructor
	public InfoBox(Language lang){
		
		langChanger=lang;
		mainPanel.setBackground(Color.BLUE);
		mainPanel.setBounds(0,350,300,400);
		mainPanel.setLayout(null);
		mainPanel.setVisible(true);
		
		titleLabel.setFont(bigFont);
		titleLabel.setBounds(0, 0, 300, 100);
		titleLabel.setVisible(true);
		
		measurementLabel.setBounds(100,100,300,100);
		measurementLabel.setBackground(Color.RED);
		measurementLabel.setVisible(true);
		
		detailBox.setBounds(0,250,300, 100);
		detailBox.setVisible(false);
		
		detailButton.setBounds(88,200,125,40);
		detailButton.setVisible(true);
		
		//when detailButton is pressed it will hide itself, display the detailsHideButton, and display the details
		detailButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				detailButton.setVisible(false);
				detailHideButton.setVisible(true);
				detailBox.setVisible(true);
				mainPanel.repaint();
			}
		});
		
		detailHideButton.setBounds(100, 350, 125, 40);
		detailHideButton.setVisible(false);
		
		//when detailHideButton is pressed it will hide itself, display the detailButton, and hide the details
		detailHideButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				detailButton.setVisible(true);
				detailHideButton.setVisible(false);
				detailBox.setVisible(false);
				mainPanel.repaint();
			}
		});
		
		
		refreshButton.setBounds(250,10, 40, 40);
		refreshButton.setVisible(true);
		//refresh button 
		refreshButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				refresh(language);
			}
		});
		
		mainPanel.add(detailBox);
		mainPanel.add(titleLabel);
		mainPanel.add(detailButton);
		mainPanel.add(detailHideButton);
		mainPanel.add(refreshButton);
		mainPanel.add(measurementLabel);
	}
	
	
	/**
	 * @param lang
	 */

	public void refresh(String language){
		this.language=language;
		langChanger.getInfoItem(this);
		mainPanel.repaint();
		detailButton.setText(detailLabel);
		detailButton.repaint();
		detailHideButton.setText(detailHideLabel);
		detailHideButton.repaint();
		titleLabel.setText(title);
		titleLabel.repaint();
		detailBox.setText(details);
		detailBox.repaint();
		
	}
	
	//getters and setters
	public JPanel getMainPanel(){
		return mainPanel;
	}
	
	public String getPermaTitle(){
		return permaTitle;
	}
	public String getLanguage(){
		return language;
	}
	public void setLanguage(String language){
		this.language=language;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public void setDetails(String details){
		this.details=details;
	}
	public void setDetailLabel(String detailLabel){
		this.detailLabel=detailLabel;
	}
	public void setDetailHideLabel(String detailHideLabel){
		this.detailHideLabel=detailHideLabel;
	}
	
	
}

