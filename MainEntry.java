import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args){
		
		
		// you could use this option, and type in numbers before you run the program
		// (# of choices/ # of attempts for choice 1/ choice 2/ choice 3/ choice 4)
		Entry e1 = new Entry(4, 3, 3, 4, 1);
		e1.listChoices();
		e1.Percentage();
		
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();
		
		// or you could use this option where you have to run the program first
		// and it asks for each number and then outputs an answer
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of choices: ");
		int a = input.nextInt();
		System.out.println("Enter the amount of times choice 1 happened: ");
		int b = input.nextInt();
		System.out.println("Enter the amount of times choice 2 happened: ");
		int c = input.nextInt();
		System.out.println("Enter the amount of times choice 3 happened: ");
		int d = input.nextInt();
		System.out.println("Enter the amount of times choice 4 happened: ");
		int e = input.nextInt();
		
		System.out.println();
		
		Entry e2 = new Entry(a, b, c, d, e);
		e2.listChoices();
		e2.Percentage();
		
		input.close();
	}
	
}
