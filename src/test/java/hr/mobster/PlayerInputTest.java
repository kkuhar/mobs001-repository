package hr.mobster;

import static org.junit.Assert.*;

import java.io.IOException;

import hr.mobster.core.Player;
import hr.mobster.data.PlayerIO;

import org.junit.Test;

public class PlayerInputTest {
	PlayerIO save= new PlayerIO();

	
	@Test
	public void test() throws IOException, ClassNotFoundException {
		
		Player p = new Player("Mr. Soprano", "Associate" , 100.00);
		save.savePlayer(p);
		assertEquals("checks if save name works",p,save.loadPlayer(p));
	}

}
