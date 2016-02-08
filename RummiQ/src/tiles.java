import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class tiles
	{
		static ArrayList<tileSpace> tile = new ArrayList<tileSpace>();
		static ArrayList<tileSpace> playerTiles = new ArrayList<tileSpace>();
		
		static void makeBoard()
			{
				
				tile.add(new tileSpace("One","Green",1));
				tile.add(new tileSpace("One","Blue",1));
				tile.add(new tileSpace("One","Yellow",1));
				tile.add(new tileSpace("One","Red",1));
				tile.add(new tileSpace("Two","Green",2));
				tile.add(new tileSpace("Two","Blue",2));
				tile.add(new tileSpace("Two","Yellow",2));
				tile.add(new tileSpace("Two","Red",2));
				tile.add(new tileSpace("Three","Green",3));
				tile.add(new tileSpace("Three","Blue",3));
				tile.add(new tileSpace("Three","Yellow",3));
				tile.add(new tileSpace("Three","Red",3));
				tile.add(new tileSpace("Four","Green",4));
				tile.add(new tileSpace("Four","Blue",4));
				tile.add(new tileSpace("Four","Yellow",4));
				tile.add(new tileSpace("Four","Red",4));
				tile.add(new tileSpace("Five","Green",5));
				tile.add(new tileSpace("Five","Blue",5));
				tile.add(new tileSpace("Five","Yellow",5));
				tile.add(new tileSpace("Five","Red",5));
				tile.add(new tileSpace("Six","Green",6));
				tile.add(new tileSpace("Six","Blue",6));
				tile.add(new tileSpace("Six","Yellow",6));
				tile.add(new tileSpace("Six","Red",6));
				tile.add(new tileSpace("Seven","Green",7));
				tile.add(new tileSpace("Seven","Blue",7));
				tile.add(new tileSpace("Seven","Yellow",7));
				tile.add(new tileSpace("Seven","Red",7));
				tile.add(new tileSpace("Eight","Green",8));
				tile.add(new tileSpace("Eight","Blue",8));
				tile.add(new tileSpace("Eight","Yellow",8));
				tile.add(new tileSpace("Eight","Red",8));
				tile.add(new tileSpace("Nine","Green",9));
				tile.add(new tileSpace("Nine","Blue",9));
				tile.add(new tileSpace("Nine","Yellow",9));
				tile.add(new tileSpace("Nine","Red",9));
				tile.add(new tileSpace("Ten","Green",10));
				tile.add(new tileSpace("Ten","Blue",10));
				tile.add(new tileSpace("Ten","Yellow",10));
				tile.add(new tileSpace("Ten","Red",10));
				tile.add(new tileSpace("Eleven","Green",11));
				tile.add(new tileSpace("Eleven","Blue",11));
				tile.add(new tileSpace("Eleven","Yellow",11));
				tile.add(new tileSpace("Eleven","Red",11));
				tile.add(new tileSpace("Twelve","Green",12));
				tile.add(new tileSpace("Twelve","Blue",12));
				tile.add(new tileSpace("Twelve","Yellow",12));
				tile.add(new tileSpace("Twelve","Red",12));
				tile.add(new tileSpace("Thirteen","Green",13));
				tile.add(new tileSpace("Thirteen","Blue",13));
				tile.add(new tileSpace("Thirteen","Yellow",13));
				tile.add(new tileSpace("Thirteen","Red",13));
				Collections.shuffle(tile);
			}
		public static void dealCards()
		{
			for(int i =0; i<15;i++)
			{
				playerTiles.add(tile.get(i));
				System.out.println(playerTiles.get(i).getName());
			}
			
		}
	}