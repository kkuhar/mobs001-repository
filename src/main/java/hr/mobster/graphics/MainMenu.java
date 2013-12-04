package hr.mobster.graphics;
import hr.mobster.data.SearchSavedGames;
import hr.mobster.listeners.CreatePlayerListener;
import hr.mobster.listeners.LoadPlayerListener;

import javax.swing.*;

import java.awt.GridLayout;
public class MainMenu extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton createPlayerBtn= new JButton("Create");
	private JButton loadPlayer= new JButton("Load existing player");
	
	
	
	private static JComboBox<String> savedGames= new JComboBox<String>(SearchSavedGames.findSaves("."));
	private static JTextField playerName = new JTextField();

	
	public static String getPlayerName() {
		return playerName.getText();
	}
	
	public static String getSelectedPlayer(){
		return savedGames.getSelectedItem().toString();
	}
	
	public MainMenu(){
		setLayout(new GridLayout(2, 3, 5, 5));
		add(new JLabel("Create new player:"));
		add(playerName);
		add(createPlayerBtn);
		createPlayerBtn.addActionListener(new CreatePlayerListener());
		
		add(new JLabel("Existing players: "));
		add(savedGames);
		add(loadPlayer);
		loadPlayer.addActionListener(new LoadPlayerListener());
	}

	public void DisplayMainMenu(){
		MainMenu mainDisplay= new MainMenu();
		mainDisplay.setTitle("Mobster");
		mainDisplay.setSize(600,100);
		mainDisplay.setLocationRelativeTo(null);
		mainDisplay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainDisplay.setVisible(true);		
	}

}
