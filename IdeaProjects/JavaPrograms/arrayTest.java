import java.util.Scanner;
public class arrayTest {
public static void main(String[] args)
{
	Scanner keyboard = new Scanner(System.in);
	int x, y;
	System.out.print("Enter number of rows: ");
	x = keyboard.nextInt();
	System.out.print("Enter number of columns: ");
	y = keyboard.nextInt();
	int [][] numbers = new int [x][y];
for(int i =0; i<numbers.length; i++)
{for(int j =0; j<numbers[i].length; j++)
{
System.out.println("Fill the columns: ");
numbers[i][j]=keyboard.nextInt();
}
}
for(int i =0; i<numbers.length; i++)
{for(int j =0; j<numbers[i].length; j++)
{
System.out.println(numbers[i][j] +" ");
}
}
}
}