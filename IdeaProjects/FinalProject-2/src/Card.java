/** This is the Card class for part-2 of the project
 * This Card class builds the Card's values and its suits.
 * @author vantoanvo
 */
public class Card {
    //updated instances variables from part-1
    public static final char HEART = (char)3;
    public static final char DIAMOND = (char)4;
    public static final char CLUB = (char)5;
    public static final char SPADE = (char)6;
    public final int DEFAULT_VALUE =1;
    public final static char DEFAULT_SUIT = (char)3;
    private char suit;
    private int value;

    /**
     * No-arg constructor, initialize the card with the default value and suit
     * return a new ACE HEART
     */
    public Card(){
        this.value=DEFAULT_VALUE;
        this.suit = DEFAULT_SUIT;
    }

    /**
     * Full constructor of the Card class
     * Call the isValidValue() and isValidSuit() to check the input
     * it will shut down the program if the input value is not in the range
     * this should return a new Card with specified values or shut down the program
     * @param value the card's value from 1-13
     * @param suit the card's suit of HEART, DIAMOND, CLUB, SPADE
     */
   public Card(int value, char suit){
        this.value = value;
        this.suit = suit;
       if(!isValidValue(value) || !isValidSuit(suit)){
           System.exit(0);
       }
    }

    /**
     * Set a new value for the card
     * This might change the card's value
     * @param value input an integer number from 1-13
     * @return true or false if the value is in 1-13
     */
    public boolean setValue(int value){
        if(isValidValue(value)){
            this.value = value;
            return true;
        }
        return false;
    }
    /**
     * Set the card's suit
     * This might change the suit's value
     * @param suit input characters of HEART, DIAMOND, CLUB, SPADE
     * @return true or false depend on the suit is in the range or not
     */
    public boolean setSuit(char suit) {
        if(isValidSuit(suit)){
            this.suit = suit;
            return true;
        }
        return false;
    }

    /**
     * Set value and suit for the card
     * @param value input the value
     * @param suit input the suit
     * @return true or false depends on the data is changed or not
     */
    public boolean setAll(int value, char suit) {
        if (isValidValue(value) && isValidSuit(suit)) {
            this.suit = suit;
            this.value = value;
            return true;
        }
        value = 5;
        suit = CLUB;
        return false;
    }

    /**
     * This method changes integer values to string
     * @return the card's value in form of string
     */
    //getValue() method
    public String getValue() {
        if (value > 1 & value < 11) {
            return Integer.toString(value);
        } else if (value == 1) {
            return "A";
        } else if (value == 11){
            return "J";
        } else if(value == 12) {
            return "Q";
        } else if (value == 13){
            return "K";
        } else
            return "" +this.value;
        }

    /**
     * Get the suit after setting the value
     * @return the card's suit in form of ASCII symbols
     */
    public char getSuit(){

        return suit;
    }

    /**
     * Print out the value and suit when any card's object is created
     * @return value and suit of this card
     */
    public String toString(){

        return this.getValue() + " " + this.suit;
    }

    /**
     * This method compare two cards
     * @param otherCard is a new card
     * @return true or false depends on they are the same or not
     */
    public boolean equals(Card otherCard) {

        return (value == otherCard.value) & (suit == otherCard.suit);
    }

    /**
     * Check the input value if it is valid or not
     * Return true if it is in the range, otherwise return false
     * */
    private boolean isValidValue(int value){
        return value>=1 && value<=13;
    }

    /**
     * Check the suit value if it is value or not
     * Return true if it is valid, otherwise return false
     * */
    private boolean isValidSuit(char suit){
        switch (suit){
            case CLUB:
            case DIAMOND:
            case HEART:
            case SPADE:
                return true;
            default:
                return false;
        }
    }

    /**
     * This method draw a card with a value and a suit
     * Used in part-1
     */
    public void drawCard(){
        System.out.println("-------");
        System.out.println("|"+ suit + "   "+ suit + "|");
        if(value==10){
            System.out.println("| " + getValue() + "  |");
        } else {
            System.out.println("|  " + getValue() + "  |");
        }
        System.out.println("|"+ suit + "   "+ suit + "|");
        System.out.println("-------");
    }
}
