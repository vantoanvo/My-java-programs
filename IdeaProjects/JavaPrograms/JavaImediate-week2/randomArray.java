import java.util.Scanner;
public class randomArray {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int x, y; // x and y are the number of rows and columns
		System.out.println("--- This program will create a two-dimensional array of x rows and y columns ---");
		System.out.print("Please enter an integer number of rows: ");
		x = in.nextInt();
		System.out.print("Please enter an integer number of columns: ");
		y = in.nextInt();
		// Create an array with x rows and y columns
		int [][] numbers = new int[x][y];
		//The program fills out the array with random integer numbers from 1 to 9
		for(int row = 0; row<numbers.length; row++) {
			for(int column = 0; column<numbers[row].length; column++){
				numbers[row][column] = ((int)(Math.random()*9) + 1);
			}
		}
		//Print out the original array
		System.out.println("Here is the original array: ");
		for(int i = 0; i<numbers.length; i++) {
			for(int j = 0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		//Print out elements in the even array
		System.out.println("Here are elements in the even columns of the array: ");
		for(int i = 0; i<numbers.length; i++){
			for (int j = 0; (j*2) < numbers[i].length; j++){
				System.out.print(numbers[i][j*2]+ " ");
			}
			System.out.println();
		}

	}
}
