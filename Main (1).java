import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);
	    int sticks = (int)(Math.random()*10) + 21 ;
	    System.out.println("There are " + sticks + " sticks.");
	    System.out.println("Select  1 to go first, select 2 to go second.");
	    boolean turn; //true means player turn, false means computer turn
	    if (reader.nextInt() == 1)
	    turn = true;
	    else 
	    turn = false;
	    
	    //game stops when we get to 0 sticks
	    //so the game must continue to run as long as the number of sticks is > 0
	    
	    while (stick > 0){
	        if (turn)
	        sticks = playerMove(sticks, reader);
	        else 
	        sticks = computerMove(sticks);
	    
	    if (sticks ==0 && turn )
	        System.out.println("Player Wins!");
	    if(sticks == 0 && !turn) //! means false
	        System.out.println("Computer Wins.");
        turn = !turn;
	}
	}
	public status int playerMove(int s, Scanner Reader){
	    System.out.println("Select how many sticks to take.");
	    int take = reader.nextInt();
	    if(take < 1)
	    take = 1;
	    if (take > 3)
	    take = 3;
	    else if (take > sticks)
	    take = sticks;
	    System.out.println("You took " + take + " sticks.");
	    return sticks - take;
	}
	
	public static int computerMove(int sticks){
	    int take;
	    if(sticks%4 != 0) //if number of sticks is not a multiple of 4
	        take = s % 4;
	    else //number of sticks is a multiple of 4
	        take = (int)(3*Math.random()) + 1;
	   System.out.println("The computer took "+ take + " sticks.");
	   return sticks - take;
	}
	
	
}
