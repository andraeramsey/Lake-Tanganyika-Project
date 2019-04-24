package example;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class inter {
	JFrame mainInterface=new JFrame();
	JPanel UIPanel=new JPanel();
	
	public inter(){
	firstDraft dr = new firstDraft();
	
	mainInterface.setSize(1600, 1039);
	mainInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	UIPanel.setLayout(null);
	UIPanel.add(dr.getMainpanel());
	
	UIPanel.setVisible(true);
	mainInterface.add(UIPanel);
	mainInterface.setVisible(true);
	}
}
