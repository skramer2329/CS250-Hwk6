import java.util.Scanner;

public class EfficientHomework06 
{
	public static void main(String [] args)
    {
		Scanner stdId = new Scanner(System.in);
		String userInput = "y";
		int totalPlays = 0;
		int wins = 0;
		int losses = 0;
				
		System.out.println("~Welcome to Computer Dice~");
		System.out.println("--------------------------");
		System.out.println("You will first roll your dice.");
		System.out.println();		
		System.out.println("Next, the outcome of your roll will be determined: ");
		System.out.println();
		System.out.println("Any Quad and you win.");
		System.out.println("Any Triple and you win.");
		System.out.println("Any HighPair (4's) and you win.");
		System.out.println("Any Doubles and you win.");
		System.out.println("Anything else and you lose.");
		System.out.println("--------------------------");
		System.out.println();
		
		do
		{
		int d1 = (int)(Math.random() * 4) + 1;
		int d2 = (int)(Math.random() * 4) + 1;
		int d3 = (int)(Math.random() * 4) + 1;
		int d4 = (int)(Math.random() * 4) + 1;
		totalPlays += 1;
		
		
		if (d1 == d2 && d2 == d3 && d3 == d4) 			//Quad - 1 possibility
		{
			System.out.println("Quad! You win!");
			++wins;			
		}
		
		else if( ((d1 == d2) && (d2 == d3)) || 
				 ((d2 == d3) && (d3 == d4)) ||
				 ((d3 == d4) && (d4 == d1)  ||
				 ((d4 == d1) && (d1 == d2)) ))  		//Triple - 4 possibilities
		{
			System.out.println("Triple! You win!");
			++wins;
		}
			
		else if((d1 == d2) && (d3 == d4) ||
				(d1 == d3) && (d2 == d4) ||
				(d1 == d4) && (d2 == d3)) 				//Two Pair - 3 possibilities
		{
			System.out.println("Two Pair! You win!");
			++wins;
		}
		
		
		else if((d1 == d2) && (d1 == 4) ||
				(d3 == d4) && (d3 == 4) ||
				(d1 == d3) && (d1 == 4) ||
				(d2 == d4) && (d2 == 4) ||
				(d1 == d4) && (d1 == 4) ||
				(d2 == d3) && (d2 == 4)) 				//High Pair - 6 possibilities
		{
			System.out.println("High Pair! You win!");
			++wins;
		}
				
		else											 //To catch all losses
		{
			System.out.println("You lost.");
			++losses;
		}
		
		System.out.println(d1 + " " + d2 + " " + d3 + " " + d4);
		System.out.println("Would you like to play again (y, n): ");
		userInput = stdId.next();
		} while(userInput.equals("y"));
		
		System.out.println("Total plays: " + totalPlays);
		System.out.println("Total wins: " + wins);
		System.out.println("Total losses: " + losses);
		
		stdId.close();
    }
}
