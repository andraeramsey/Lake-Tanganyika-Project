package example;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class firstDraft {
	
	JPanel mainPanel = new JPanel();
	
	JLabel titleLabel = new JLabel("LAKE TANGANYIKA");
	
	JLabel details = new JLabel("Lake Statistics");
	
	JLabel timeLabel = new JLabel("Time Last Updated");
	JLabel langLabel = new JLabel("Lugha/Language: ");
	JLabel researchLabel = new JLabel("Reseacher Profile");
	
	JButton refreshButton = new  JButton("Refresh");
	
	JButton englishButton = new JButton();
	JButton swahiliButton = new JButton("Swahili");
	
	JLabel clock = new JLabel();
	
	Font bigFont= new Font("serif", Font.PLAIN, 50);
	Font lakeFont = new Font("serif", Font.PLAIN, 20);
	
	
	public firstDraft()
	{
		
		mainPanel.setBackground(Color.gray);
		mainPanel.setBounds(0, 0, 1400, 400);
		mainPanel.setLayout(null);
		mainPanel.setVisible(true);
		
		titleLabel.setFont(bigFont);
		titleLabel.setBounds(100, 0, 1000, 200);
		titleLabel.setVisible(true);
		
		details.setFont(lakeFont);
		details.setBounds(100,110,300,100);
		details.setVisible(true);
		
		researchLabel.setBounds(1000,300,300,100);
		researchLabel.setVisible(true);
		
		timeLabel.setBounds(137,200,300,100);
		timeLabel.setVisible(true);
		
		clock.setBounds(137,225,300,100);
		clock.setVisible(true);
		
		refreshButton.setBounds(137,300,70,20);
		refreshButton.setVisible(true);
		refreshButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				mainPanel.repaint();
				titleLabel.setText("LAKE TANGANYIKA");
				titleLabel.repaint();
				details.setText("Lake Statistics");
				details.repaint();
				timeLabel.setText("Time Last Updated: ");
				timeLabel.repaint();
				clock();
				clock.repaint();
			
			}
		});
		
		langLabel.setFont(lakeFont);
		langLabel.setBounds(850,75,300,100);
		langLabel.setVisible(true);
		
		englishButton.setBounds(1000, 100, 50, 50);
		englishButton.setVisible(true);
		englishButton.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("./american.png")));
		englishButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				mainPanel.repaint();
				titleLabel.setText("LAKE TANGANYIKA");
				titleLabel.repaint();
				details.setText("Lake Statistics");
				details.repaint();
				timeLabel.setText("Time Last Updated: ");
				timeLabel.repaint();
			
			
			}
		});
		
		swahiliButton.setBounds(1050, 100, 50, 50);
		swahiliButton.setVisible(true);
		swahiliButton.setIcon(new javax.swing.ImageIcon(this.getClass().getResource("./Swahili.png")));
		swahiliButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				mainPanel.repaint();
				titleLabel.setText("Ziwa Tanganyika");
				titleLabel.repaint();
				details.setText("Hali ya hewa ya ziwa kwa sasa");
				details.repaint();
				timeLabel.setText("Mara ya mwisho mwisho: ");
				timeLabel.repaint();
				
			
			}
		});
		 clock();
		mainPanel.add(titleLabel);
		mainPanel.add(details);
		mainPanel.add(timeLabel);
		mainPanel.add(clock);
		mainPanel.add(researchLabel);
		mainPanel.add(refreshButton);
		mainPanel.add(langLabel);
		mainPanel.add(englishButton);
		mainPanel.add(swahiliButton);
	}
	
	public void clock()
	{
		Calendar cal = new GregorianCalendar();
		 
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int seconds = cal.get(Calendar.SECOND);
		
		
		clock.setText(hour + ":" + min + ":"+ seconds);
	}
	public JPanel getMainpanel() {
		return mainPanel;
	}

}
