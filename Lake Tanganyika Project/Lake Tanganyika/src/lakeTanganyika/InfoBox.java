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
	
	//BufferedImage buttonIcon = ImageIO.(new File("refresh.png"));
	Language langChanger=new Language();
	//this title never changes so the class can be identified easily;
	String permaTitle="Error with permatitle in infobox";
	//this title changes depending on the language and is displayed in the infobox
	String title="Title error";
	String language="English";
	
	//these margins are to place each infobox appropriately.
	int leftMargin=0;
	int topMargin=0;
	
	//the value that we read for this info at the database
	int measurement=1000;
	
	
	//information that goes into the detail box
	String details="<html>Here's a peice thats quite perverse,<br> its the same, every verse. So for better or for worse<br> weve 16 more to go."
			+ "one by one<br> we count them all its the same off the wall so in<br> case youve lost them all weve 15 more to go.</html>";
	
	String detailLabel="Details";
	String detailHideLabel="Hide Details";
	
	//the whole infoBox essentially is in this panel and it is in a panel so it can easily be placed into the interface
	JPanel mainPanel=new JPanel();
	
	//the display for the measurement variable
	JLabel measurementLabel=new JLabel(measurement+" Celcius");

	
	//the label with the details inside it so it can be placed into the mainPanel
	JLabel detailBox=new JLabel(details);
	
	//label that has the title
	JLabel titleLabel=new JLabel(title);
	
	//font size used for the title of the infoBox
	Font bigFont=new Font("serif", Font.PLAIN, 28);
	
	//display details button
	JButton detailButton=new JButton(detailLabel);
	
	//hide details button
	JButton detailHideButton=new JButton(detailHideLabel);
	
	//refresh button
	JButton refreshButton=new JButton("Refresh");
	
	

	//constructor
	public InfoBox(Language lang, String permaTitle, TestInfo readings,int leftMargin, int topMargin,int sensor){
		this.leftMargin=leftMargin;
		this.topMargin=topMargin;
		this.permaTitle=permaTitle;
		this.title=permaTitle;
		measurement=readings.getBaseSensor(sensor);
		langChanger=lang;
		mainPanel.setBackground(Color.BLUE);
		mainPanel.setBounds(leftMargin,topMargin,400,300);
		mainPanel.setLayout(null);
		mainPanel.setVisible(true);
		
		titleLabel.setFont(bigFont);
		titleLabel.setBounds(100, 0, 300, 100);
		titleLabel.setVisible(true);
		
		measurementLabel.setBounds(170,70,300,100);
		measurementLabel.setBackground(Color.RED);
		measurementLabel.setVisible(true);
		
		detailBox.setBounds(50,155,300, 140);
		detailBox.setVisible(false);
		
		detailButton.setBounds(137,150,125,40);
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
		
		detailHideButton.setBounds(137,150,125,40);
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
		
		
		refreshButton.setBounds(350,10, 40, 40);
		refreshButton.setVisible(true);
		refreshButton.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("./refresh.png")));
		//refresh button 
		refreshButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				History frame = new History(title,readings.getHistoryTest());

				frame.setSize(400,300);
				
				frame.setVisible(true);

				frame.addNode("a", 20,50);
				frame.addNode("b", 100,100);
				frame.addNode("longNode", 200,200);
				frame.addEdge(0,1);
				frame.addEdge(1,2);
				//refresh(language);
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
		measurementLabel.setText(measurement+ " Celcius");
		measurementLabel.repaint();
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
	public void setMeasurement(int measurement){
		this.measurement=measurement;
	}
	
}

