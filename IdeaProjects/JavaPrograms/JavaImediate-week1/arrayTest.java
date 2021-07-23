import java.util.Scanner;
public class arrayTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, y; // x and y are the number of rows and columns
		System.out.println("--- This program will create a two-dimensional array of x rows and y columns ---");
		System.out.print("Please enter an integer number of rows: ");
		x = in.nextInt();
		System.out.print("Please enter an integer number of columns: ");
		y = in.nextInt();
		//Create an array to store x, y
		int numbers [][] = new int [x][y];
		// This loop allows users to fill out the array
			for(int i =0; i<numbers.length; i++) {
				System.out.println("--- Enter integer values for Row " + (i+1) + "---");
				for(int j =0; j<numbers[i].length; j++) {
					System.out.print("+ Column "+ (j+1)+": ");
					numbers[i][j]=in.nextInt();
				}
			}
		System.out.println("Here is the array: ");
		printArray(numbers); //Call the printArray method to print the array out.
		}
	//This printArray method shows the array.
	public static void printArray(int [][] numbers) {
		for(int i =0; i<numbers.length; i++) {
			for(int j =0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j] +" ");
				}
		System.out.println();
		}
	}
}