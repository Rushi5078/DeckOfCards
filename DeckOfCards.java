/**Setup the initial game with deck of cards and make sure we have unique cards
 * 
 */
package Cards;

/**
 * @author Rushikesh Bhosle
 *
 */
public class DeckOfCards 
{
	public static String[] suits = { "Heart", "Diamond", "Spades", "Club" };
	public static String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	public static String[][] Deck = new String[4][13];
//Define method
	public static void Deck() 
	{
		// Initialize cards
		for (int i = 0; i < suits.length; i++) 
		{
			for (int j = 0; j < rank.length; j++) 
			{
				Deck[i][j] = suits[i] + rank[j];
			}
		}

	}
	public static void main(String[] args)
	{
        System.out.println("Welcome to DeckOfCard");
      //calling method    
        Deck();		
	
	}
}
