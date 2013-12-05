package hr.mobster.listeners;

import hr.mobster.core.Player;
import hr.mobster.data.PlayerIO;
import hr.mobster.graphics.GameFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class SaveListener implements ActionListener {
	private PlayerIO save= new PlayerIO();
	private Player p= new Player();
	public void actionPerformed(ActionEvent e) {
		
		p.setName(GameFrame.getNameValue());
		p.setDay(GameFrame.getDayValue());
		p.setHealth(GameFrame.getHealthValue());
		p.setMoney(GameFrame.getMoneyValue());
		p.setRank(GameFrame.getRankValue());

		try {
			save.savePlayer(p);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
