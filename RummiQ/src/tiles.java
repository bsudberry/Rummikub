import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class tiles
	{
		static Scanner userInput = new Scanner(System.in);
		static ArrayList<tileSpace> tile = new ArrayList<tileSpace>();
		static ArrayList<tileSpace> playerTiles = new ArrayList<tileSpace>();
		static ArrayList<tileSpace> runArray = new ArrayList<tileSpace>();
		static String straight;
		static String straight2;
		static String run;
		static String run2;
		
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
			System.out.println("These are your tiles.");
			for(int i =0; i<14;i++)
			{
				int counter = i+1;
				playerTiles.add(tile.get(i));
				System.out.println(counter + ") " + playerTiles.get(i).getName() +" " +playerTiles.get(i).getColor());
				System.out.println("--------------------|");
			}
			System.out.println(" ");
		}
		public static void buildBoard()
		{
			System.out.println("This is the current board.");
			String[] straight= {"Nine Red, Ten Red, Eleven Red, Twelve Red"};
			String[] straight2 ={"Five Green, Six Green, Seven Green, Eight Green"};
			String[] run ={"Green Three, Red Three, Yellow Three"};
			String[] run2 = {"Thirteen Blue, Thirteen Red, Thirteen Yellow, Thirteen Green"};
			for(int i = 0; i < 1; i++)
		         {
		        	 System.out.println(straight[i]);
		         }
			for(int i = 0; i < 1; i++)
		         {
		        	 System.out.println(straight2[i]);
		         }
			for(int i = 0; i < 1; i++)
		         {
		        	 System.out.println(run[i]);
		         }
			for(int i = 0; i < 1; i++)
		         {
		        	 System.out.println(run2[i]);
		         }
		}
		public static void playerMove()
		{
				{
					System.out.println(" ");
					System.out.println("What would you like to do?");
					System.out.println("1.) Place a run.");
					System.out.println("2.) Place a straight.");
					System.out.println("3.) Pull a tile.");
					System.out.println("4.) Add to the current board");
					int choice = userInput.nextInt();
					System.out.println("How many tiles would you like to put down?");
					int totalTiles = userInput.nextInt();
					if(choice == 1)
						{
							System.out.println("What tiles would you like to put down?");
						 for(int i =0; i<totalTiles; i++)
							 {
								 int userChoice = userInput.nextInt();
								 runArray.add(tile.get(userChoice-1));
							 }
						 for(int i = 0; i < totalTiles; i++)
					         {
					        	 System.out.println(runArray.get(i).getName()+ " " + runArray.get(i).getColor());
					         }
//						 tile.remove(userChoice);
//						 dealCards();
						}
					if(choice == 2)
						{
							
						}
					if(choice == 3)
						{
							
						}
					if(choice == 4)
						{
							
						}
				}
		}
	}