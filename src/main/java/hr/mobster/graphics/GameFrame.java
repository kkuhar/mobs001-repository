package hr.mobster.graphics;

import hr.mobster.core.Player;
import hr.mobster.listeners.CreatePlayerListener;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GameFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GameFrame(Player p){		
		JPanel statusPanel= new JPanel();
		JPanel infoPanel = new JPanel();
		
		JTextArea infoArea= new JTextArea("bla");
		
		statusPanel.setSize(400, 50);
		infoPanel.setSize(400,200);
		
		statusPanel.setLayout(new GridLayout(1, 6, 5, 5));
		infoPanel.setLayout(new FlowLayout(FlowLayout.LEFT,5,5));
		
		statusPanel.add(new JLabel("Name: "));
		statusPanel.add(new JLabel(p.getName()));
		statusPanel.add(new JLabel("Rank: "));
		statusPanel.add(new JLabel(p.getRank()));
		statusPanel.add(new JLabel("Money:"));
		statusPanel.add(new JLabel(Double.toString(p.getMoney())+"$"));
	  
		
		infoPanel.add(infoArea);
		infoPanel.add(statusPanel);
		add(infoPanel);
		
		
	}

	public void DisplayGameFrame(Player p){		
		GameFrame gframe= new GameFrame(p);
		gframe.setTitle("Mobster " + p.getName());
		gframe.setSize(800,600);
		gframe.setLocationRelativeTo(getMostRecentFocusOwner());
		//gframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gframe.setVisible(true);
		
	}
}
