package hr.mobster.listeners;

import hr.mobster.graphics.GameFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NextDayListener implements ActionListener {
 	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub		
		int currentDay= GameFrame.getDayValue();
		currentDay++;
		GameFrame.setDayLabel(currentDay);
	}

}
