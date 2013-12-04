package hr.mobster.graphics;

import hr.mobster.core.Player;
import hr.mobster.listeners.CreatePlayerListener;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.TextArea;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.List;
import java.awt.Button;

public class GameFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GameFrame(Player p){		
		JPanel panel = new JPanel();		
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Name:");
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(p.getName());
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Rank:");
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(p.getRank());
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Money:");
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel(Double.toString(p.getMoney())+"$");
		panel.add(lblNewLabel_5);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Available jobs", null, panel_1, null);
		
		JButton btnNewButton = new JButton("Take Job");
		panel_1.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Inventory", null, panel_3, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Shop", null, panel_2, null);
		
		List list = new List();
		panel_2.add(list);
		
		Button button = new Button("Buy");
		panel_2.add(button);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnFile.add(mntmSave);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_MASK));
		mnFile.add(mntmExit);
		
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
		//gframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gframe.setVisible(true);
		
	}
}
