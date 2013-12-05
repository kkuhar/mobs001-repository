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
  		save.writeUTF(player.getRank());
  		save.writeDouble(player.getMoney());
  		save.writeInt(player.getHealth());
  		save.writeInt(player.getDay());
  		save.close();		
	}
	
	public Player loadPlayer(Player player) throws IOException, ClassNotFoundException{
		Player p= new Player();
		FileInputStream datoteka= new FileInputStream(player.getName()+".mob");
		ObjectInputStream load= new ObjectInputStream(datoteka);
	  p.setName(load.readUTF());
	  p.setRank(load.readUTF());
	  p.setMoney(load.readDouble());
	  p.setHealth(load.readInt());
	  p.setDay(load.readInt());
		load.close();
		return p;
		
	}

}
