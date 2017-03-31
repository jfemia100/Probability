
public class Entry {

	static int [] array = new int[4];
	
	// Instance variables
	int choices;
	int c1;
	int c2;
	int c3;
	int c4;
	int attempts;

	// Constructor
	public Entry(int c, int v, int w, int x, int y){
		if( c < 1 || c > 4)
			throw new IllegalArgumentException("You don't have a valid amount of choices.");
		if(v < 0 || w < 0 || x < 0 || y < 0)
			throw new IllegalArgumentException("You didn't enter valid numbers.");
		
		choices = c;
		c1 = v;
		c2 = w;
		c3 = x;
		c4 = y;
	    attempts = v + w + x + y;

	}
	
	public void listChoices(){
		System.out.println("Choice 1 happened "+ c1 + " times.");
		System.out.println("Choice 2 happened "+ c2 + " times.");
		System.out.println("Choice 3 happened "+ c3 + " times.");
		System.out.println("Choice 4 happened "+ c4 + " times.");
		System.out.println();
	}
	
	public void Percentage(){
		array[0] = (c1*100)/attempts;
		array[1] = (c2*100)/attempts;
		array[2] = (c3*100)/attempts;
		array[3] = (c4*100)/attempts;
		
		int highest = array[0];
		int choice = 0;
		
		for(int i = 1; i < 4; i++){
			if (array[i] > highest){ 
				highest = array[i];
				choice = i;
			}
		}
		
		choice = choice +1;
		
		if(choice == 1){
			System.out.println("Out of the " + choices + " choices, choice " + choice + " happend more often.");
			System.out.println("There is a " + highest + "% chance it happens again.");
		}	
		if(choice == 2){
			System.out.println("Out of the " + choices + " choices, choice " + choice + " happend more often.");
			System.out.println("There is a " + highest + "% chance it happens again.");
		}	
		if(choice == 3){
			System.out.println("Out of the " + choices + " choices, choice " + choice + " happend more often.");
			System.out.println("There is a " + highest + "% chance it happens again.");
		}
		if(choice == 4){
			System.out.println("Out of the " + choices + " choices, choice " + choice + " happend more often.");
			System.out.println("There is a " + highest + "% chance it happens again.");
		}
	}
}
