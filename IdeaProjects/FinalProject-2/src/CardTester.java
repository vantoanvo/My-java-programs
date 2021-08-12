/** DO NOT CHANGE FILE!! only changes allowed would be to comment/uncomment code for debugging **/

public class CardTester
{
    /**
     * TESTER ALGORITHM:
     * x	can't test isValidValue() and isValidSuit(), know why?
     * -	test toString()
     * -	test setValue()
     * 		-	valid data (data changes + return true)
     * 		-	invalid data (no data change + return false)
     * -	test setSuit()
     * 		-	valid data (data changes + return true)
     * 		-	invalid data (no data change + return false)
     * -	test setAll()
     * 		-	valid data (data changes + return true)
     * 		-	invalid data (no data change + return false)
     * -	test Default Constructor
     * -	test Full Constructor
     * 		-	valid data
     * 		-	invalid data (should shutdown program)
     * -	test getValue()
     * -	test getSuit()
     * -	test equals()
     */
    public static void main(String[] args)
    {
        Card test, test2;
        boolean setterTest;
        test = new Card(); //default constructor test (once its built, see toString test below)

        //test toString()
        System.out.println("\n==============================================");
        System.out.println("TESTING toString() METHOD:\n");
        System.out.println("If no default constructor built, should get [0  ] and toString gives: [" + test.toString() + "]. Know why?");
        System.out.println("Otherwise, the above should show the default value of: A " + Card.DEFAULT_SUIT);

		//test setValue()
		System.out.println("\n==============================================");
		System.out.println("TESTING setValue() METHOD:\n");
	 	//-	valid data (data changes + return true)
		setterTest = test.setValue(2);
		System.out.println("setValue should have changed value only to 2: " + test + ". Setter returned " + setterTest); //toString called automatically
		setterTest = test.setValue(10);
		System.out.println("setValue should have changed value only to 10: " + test + ". Setter returned " + setterTest);
		setterTest = test.setValue(11);
		System.out.println("setValue should have changed value only to J: " + test + ". Setter returned " + setterTest);
		setterTest = test.setValue(12);
		System.out.println("setValue should have changed value only to Q: " + test + ". Setter returned " + setterTest);
		setterTest = test.setValue(13);
		System.out.println("setValue should have changed value only to K: " + test + ". Setter returned " + setterTest);
	 	//-	invalid data (no data change + return false)
		setterTest = test.setValue(0);
		System.out.println("setValue should NOT have changed value from K: " + test + ". Setter returned " + setterTest);
		setterTest = test.setValue(14);
		System.out.println("setValue should NOT have changed value from K: " + test + ". Setter returned " + setterTest);



		//test setSuit()
		System.out.println("\n==============================================");
		System.out.println("TESTING setSuit() METHOD:\n");
		//-	valid data (data changes + return true)
		setterTest = test.setSuit(Card.DIAMOND);
		System.out.println("setSuit should have changed suit only to " + Card.DIAMOND + ": " + test + ". Setter returned " + setterTest);
		setterTest = test.setSuit(Card.CLUB);
		System.out.println("setSuit should have changed suit only to " + Card.CLUB + ": " + test + ". Setter returned " + setterTest);
		setterTest = test.setSuit(Card.SPADE);
		System.out.println("setSuit should have changed suit only to " + Card.SPADE + ": " + test + ". Setter returned " + setterTest);
		setterTest = test.setSuit(Card.HEART);
		System.out.println("setSuit should have changed suit only to " + Card.HEART + ": " + test + ". Setter returned " + setterTest);
		//-	invalid data (no data change + return false)
		setterTest = test.setSuit('H');
		System.out.println("setSuit should NOT have changed suit from " + Card.HEART + ": " + test + ". Setter returned " + setterTest);
		setterTest = test.setSuit((char)7);
		System.out.println("setSuit should NOT have changed suit from " + Card.HEART + ": " + test + ". Setter returned " + setterTest);



		//-	test setAll()
		System.out.println("\n==============================================");
		System.out.println("TESTING setAll() METHOD:\n");
		//-	valid data (data changes + return true)
		setterTest = test.setAll(1, Card.DIAMOND);
		System.out.println("setAll should have changed both to A " + Card.DIAMOND + ": " + test + ". Setter returned " + setterTest);
		setterTest = test.setAll(3, Card.SPADE);
		System.out.println("setAll should have changed both to 3 " + Card.SPADE + ": " + test + ". Setter returned " + setterTest);
		setterTest = test.setAll(4, Card.HEART);
		System.out.println("setAll should have changed both to 4 " + Card.HEART + ": " + test + ". Setter returned " + setterTest);
		setterTest = test.setAll(5, Card.CLUB);
		System.out.println("setAll should have changed both to 5 " + Card.CLUB + ": " + test + ". Setter returned " + setterTest);
		//-	invalid data (no data change + return false)
		setterTest = test.setAll(15, Card.DIAMOND);
		System.out.println("setAll should NOT have changed suit OR value from last valid test: " + test + ". Setter returned " + setterTest);
		setterTest = test.setAll(6, 'C');
		System.out.println("setAll should NOT have changed suit OR value from last valid test: " + test + ". Setter returned " + setterTest);
		setterTest = test.setAll(-1, '*');
		System.out.println("setAll should NOT have changed suit OR value from last valid test: " + test + ". Setter returned " + setterTest);


        //-	test Default Constructor (see toString() test)


		//-	test Full Constructor
		System.out.println("\n==============================================");
		System.out.println("TESTING Full Constructor METHOD:\n");
		//-	valid data
		test = new Card(6, Card.DIAMOND);
		System.out.println("Full constructor should have built card 6 " + Card.DIAMOND + ": " + test);
		test = new Card(7, Card.HEART);
		System.out.println("Full constructor should have built card 7 " + Card.HEART + ": " + test);
		//-	invalid data (should shutdown program)
//		test = new Card(17, Card.CLUB); //should shutdown program, test by uncommenting
//		test = new Card(11, '3'); //should shutdown program, test by uncommenting
//		test = new Card(17, Card.CLUB); //should shutdown program, test by uncommenting



		//-	test getValue()
		System.out.println("\n==============================================");
		System.out.println("TESTING getValue() METHOD:\n");
		System.out.println("getValue should be 7: " + test.getValue()); //from last valid test
		test.setAll(8, Card.CLUB);
		System.out.println("getValue should be 8: " + test.getValue());



		//-	test getSuit()
		System.out.println("\n==============================================");
		System.out.println("TESTING getSuit() METHOD:\n");
		System.out.println("getSuit should be " + Card.CLUB + ": " + test.getSuit()); //from last valid test
		setterTest = test.setAll(9, Card.SPADE);
		System.out.println("getSuit should be " + Card.SPADE + ": " + test.getSuit());



		//-	test equals()
		System.out.println("\n==============================================");
		System.out.println("TESTING equals() METHOD:\n");
		test2 = new Card(5, Card.HEART);
		System.out.println("Are card " + test + " and card " + test2 + " the same? " + test.equals(test2));
		test.setAll(5, Card.HEART);
		System.out.println("Are card " + test + " and card " + test2 + " the same now? " + test.equals(test2));

/** The tests that this CardTester class didn't account for are:

 1. The setAll() method at line 132: This method sets value and suit for the Card, but it doesn't return
 and print out the card.
The code is:

	setterTest = test.setAll(9, Card.SPADE);

 2. The drawCard() method: this method was already tested in part-1.
 The codes to test the drawCard():

 	test.drawCard();
 */
    }
}
