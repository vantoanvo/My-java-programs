import java.util.Scanner;
public class searchArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int x, y;
        System.out.println("This program will create a two-dimensional array of x rows and y columns");
        // Get the input values for row and column
        System.out.print("Enter the number of rows: ");
        x = keyboard.nextInt();
        System.out.print("Enter the number of columns: ");
        y = keyboard.nextInt();
        // Create an array to store x rows and y columns
        int randomArray[][] = new int[x][y];
        //This loop fill the array with random numbers from 1 to 100
        for (int row = 0; row < randomArray.length; row++) {
            for (int column = 0; column < randomArray[row].length; column++) {
                randomArray[row][column] = (int) (Math.random() * 100 + 1);
            }
        }
        //Print the original array
        System.out.println("This is the array filled by random integers from 1-100: \n");
        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < randomArray[i].length; j++) {
                System.out.print(randomArray[i][j] + " ");
            }
            System.out.println();
        }
        // command to search
        System.out.print("\nEnter a search key between 1-100: ");
        int key = keyboard.nextInt();
        linearsearch(randomArray, key);

    }
    // method to search
    public static void linearsearch(int[][] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (key == arr[i][j]) {
                    System.out.println("The key you entered is available at row " + (i+1) + ", column " + (j+1) + ".");
                    return;
                }
            }
        }
        System.out.println("The key you entered is not available in this array.");
    }
}
