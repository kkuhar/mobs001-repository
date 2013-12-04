package hr.mobster.data;
import java.io.*;
public class SearchSavedGames implements Serializable {
	private static final long serialVersionUID = 1L;
	private static String[] saves= new String[100];
	public SearchSavedGames(){}	
	/**
	 * 
	 * @param path
	 * @return returnSaves
	 * @Description Method takes path and returns names of saved mob files on that path.
	 */
	public static String[] findSaves(String path){		
		int i=0;
		File mobFile=new File(path);
		File[] lista= mobFile.listFiles();
		for(File f:lista){
		  if(f.getName().endsWith(".mob"))
		  {
		  	saves[i]=(f.getName()).substring(0, f.getName().length()-4);
		  	i++;
		  }
		}
		String[] returnSaves= new String[i];
		for(int j=0;j<i;j++)
			returnSaves[j]=saves[j];
		return returnSaves;	
		}	
}
