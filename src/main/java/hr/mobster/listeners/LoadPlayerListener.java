package hr.mobster.listeners;

import hr.mobster.core.Player;
import hr.mobster.data.PlayerIO;
import hr.mobster.graphics.GameFrame;
import hr.mobster.graphics.MainMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class LoadPlayerListener implements ActionListener {
	private Player player=new Player();
	private PlayerIO load= new PlayerIO();
	private static GameFrame gframe= new GameFrame(new Player());	
	public void actionPerformed(ActionEvent e) {
		player.setName(MainMenu.getSelectedPlayer());
		try {
			player.setRank(load.loadPlayer(player).getRank());
			player.setMoney(load.loadPlayer(player).getMoney());
			player.setHealth(load.loadPlayer(player).getHealth());
			player.setDay(load.loadPlayer(player).getDay());
		} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
		} catch (IOException e1) {
				e1.printStackTrace();
		}
		gframe.DisplayGameFrame(player);
	}

}
