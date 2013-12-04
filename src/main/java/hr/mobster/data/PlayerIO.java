package hr.mobster.data;
import hr.mobster.core.Player;

import java.io.*;
/**
 * 
 * @Description This class writes and reads player name into the file.
 *
 */
public class PlayerIO {
	  
	public void savePlayer(Player player) throws IOException{
  	
			FileOutputStream datoteka= new FileOutputStream(player.getName()+".mob");
			ObjectOutputStream save= new ObjectOutputStream(datoteka);
  		save.writeUTF(player.getName());
  		save.writeUTF("Associate");
  		save.writeDouble(100.00);
  		save.close();		
	}
	
	public Player loadPlayer(Player player) throws IOException, ClassNotFoundException{
		Player p= new Player();
		FileInputStream datoteka= new FileInputStream(player.getName()+".mob");
		ObjectInputStream load= new ObjectInputStream(datoteka);
	  p.setName(load.readUTF());
	  p.setRank(load.readUTF());
	  p.setMoney(load.readDouble());
		load.close();
		return p;
		
	}

}
