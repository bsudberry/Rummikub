
public class gameRunner extends tiles
	{

		public static void main(String[] args)
			{
				//tiles e = new tiles();
				//e.makeBoard();
				tiles.makeBoard();
				tiles.dealCards();
				tiles.playerMove();
				checkWin();
			}

		private static void checkWin()
			{
				if(playerTiles.size()==0)
					{
						System.out.println("Nice Job!! Game is over!");
					}
				else
					{
						tiles.playerMove();
						checkWin();
					}
			}

	}
