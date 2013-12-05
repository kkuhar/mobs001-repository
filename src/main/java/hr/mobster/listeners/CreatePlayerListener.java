package hr.mobster.listeners;

import hr.mobster.core.Player;
import hr.mobster.data.PlayerIO;
import hr.mobster.graphics.GameFrame;
import hr.mobster.graphics.MainMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class CreatePlayerListener implements ActionListener{
	private Player player=new Player();
	private PlayerIO save= new PlayerIO();
	private static GameFrame gframe= new GameFrame(new Player());	
	
	public void actionPerformed(ActionEvent e) {
		player.setName(MainMenu.getPlayerName());
		player.setRank("Associate");
		player.setMoney(100.0);
		player.setHealth(100);
		player.setDay(1);
		try {			
			save.savePlayer(player);
		} catch (IOException e1) {
				e1.printStackTrace();
		} 		
		gframe.DisplayGameFrame(player);
	}	
}
