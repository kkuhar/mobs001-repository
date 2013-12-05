package hr.mobster.graphics;

import hr.mobster.core.Player;
import hr.mobster.listeners.NextDayListener;
import hr.mobster.listeners.SaveListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.KeyStroke;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

import javax.swing.JTabbedPane;
import javax.swing.JButton;

import java.awt.List;
import java.awt.Button;
import java.awt.Color;

public class GameFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static JLabel dayLabel = new JLabel();
	private static JLabel healthLabel = new JLabel();
	private static JLabel moneyLabel = new JLabel();
	private static JLabel rankLabel = new JLabel();
	private static JLabel nameLabel = new JLabel();
	
	public static void setNameLabel(String name){
		nameLabel.setText(name);		
	}
	
	public static void setHealthLabel(int health){
		healthLabel.setText(Integer.toString(health));		
	}
	
	public static void setMoneyLabel(double money){
		moneyLabel.setText(Double.toString(money)+"$");		
	}
	
	public static void setRankLabel(String rank){
		rankLabel.setText(rank);		
	}
	
	public static void setDayLabel(int day){
		dayLabel.setText(Integer.toString(day));		
	}
	
	
	public static String getNameValue(){
		return nameLabel.getText();
	}
	
	public static int getDayValue(){
		return (Integer.parseInt(dayLabel.getText()));
	}
	
	
	public static String getRankValue(){
		return rankLabel.getText();
	}
	
	public static double getMoneyValue(){
	//return the ammount of money without $ sign
		return (Double.parseDouble(moneyLabel.getText().substring(0, healthLabel.getText().length()-1)));
	}
	
	public static int getHealthValue(){		
		return (Integer.parseInt(healthLabel.getText()));
	}
	

	public GameFrame(Player p){		
		JPanel panel = new JPanel();		
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Name:");
		panel.add(lblNewLabel);
		
		setNameLabel(p.getName());
		nameLabel.setForeground(Color.RED);
		panel.add(nameLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Rank:");
		panel.add(lblNewLabel_2);
		
		setRankLabel(p.getRank());
		rankLabel.setForeground(Color.RED);
		panel.add(rankLabel);
		
		JLabel lblNewLabel_4 = new JLabel("Money:");
		panel.add(lblNewLabel_4);
		
		setMoneyLabel(p.getMoney());
		moneyLabel.setForeground(Color.RED);
		panel.add(moneyLabel);
		
		JLabel lblNewLabel_6 = new JLabel("Health:");
		panel.add(lblNewLabel_6);
		
		setHealthLabel(p.getHealth());
		healthLabel.setForeground(Color.RED);
		panel.add(healthLabel);
		
		JLabel lblNewLabel_8 = new JLabel("Day:");
		panel.add(lblNewLabel_8);
		dayLabel.setForeground(Color.RED);
		
		setDayLabel(p.getDay());
		panel.add(dayLabel);
		
		JButton nextDayBtn = new JButton("Next day");
		panel.add(nextDayBtn);
		nextDayBtn.addActionListener(new NextDayListener());
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Available jobs", null, panel_1, null);
		
		JButton takeJobBtn = new JButton("Take Job");
		panel_1.add(takeJobBtn);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Inventory", null, panel_3, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Shop", null, panel_2, null);
		
		List list = new List();
		panel_2.add(list);
		
		Button buyBtn = new Button("Buy");
		panel_2.add(buyBtn);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem saveItem = new JMenuItem("Save");
		saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		saveItem.addActionListener(new SaveListener());
		mnFile.add(saveItem);
		
		JMenuItem exitItem = new JMenuItem("Quit Game");
		exitItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		exitItem.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnFile.add(exitItem);
		
		JMenu mnGamble = new JMenu("Gamble");
		menuBar.add(mnGamble);
		
		JMenuItem mntmBlackjack = new JMenuItem("BlackJack");
		mnGamble.add(mntmBlackjack);
		
		JMenuItem mntmRaceTrack = new JMenuItem("Race Track");
		mnGamble.add(mntmRaceTrack);		
	}

	public void DisplayGameFrame(Player p){		
		GameFrame gframe= new GameFrame(p);
		gframe.setTitle("Mobster " + p.getName());
		gframe.setSize(800,600);
		gframe.setLocationRelativeTo(getMostRecentFocusOwner());
		gframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		gframe.setVisible(true);
		}
}
