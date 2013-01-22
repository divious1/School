  /*  Author:  Jose Hernandez  1415865  
     Subject:       COP 3804   M-Th 5:00
     Instructor:  Norman Pestaina  ECS 364
     Assigment:  1 Formating dates    DUE Sunday 07/06;
     Oath: I certify that this work is my own and that
           none of it is the work of any other person.
*/
 
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;


public class HangMan implements GamePlayer {
    String word;
    char[] guess;
    boolean playersTurn;
    boolean playerWins;
    int errors;
    ArrayList<Character> lettersAlreadyGuessed;
    ArrayList<String> dictionary;
   
    public HangMan( ) {
        lettersAlreadyGuessed = new ArrayList<Character>();
       
        dictionary = new ArrayList<String>();
        dictionary.add("hello");
        dictionary.add("goodbye");
        dictionary.add("starwars");
        dictionary.add("jazz");
        dictionary.add("java programming is hard");
       
       
       
        errors = 0;
       
        String input = JOptionPane.showInputDialog("Do you want to go first? y or n");
        if( input.equalsIgnoreCase( "y" ) ){
            playersTurn = false;
            word = JOptionPane.showInputDialog("Pick a word");
        }
        else {
            playersTurn = true;
            Random r = new Random();
            int num = r.nextInt(dictionary.size());
            word = dictionary.get( num );
        }  
       
        guess = new char[word.length()];
    }
   
    public boolean isPlayersTurn() {
        return playersTurn;
    }
   
    public boolean isOver() {
        if( errors == 10 || word.equalsIgnoreCase(new String(guess)))
            return true;
       
        return false;
    }

    public boolean playerWins() {
        if( playersTurn && word.equalsIgnoreCase(new String(guess)) )
            return true;
        if( !playersTurn && errors == 10 )
            return true;
       
        return false;
    }
   
    public boolean isValidMove( String move ) {
        if( move.length() == 1 && Character.isLetter( move.charAt(0) ) )
            return true;
        return false;
    }
   
    public String getPlayerMove( ) {
        String input = JOptionPane.showInputDialog("Guess a letter");
        return input;
    }
   
    public void playerMoves( String move ) {
        char letter = move.charAt(0);
       
        boolean found = false;
        for( int i = 0; i < word.length(); i++ ) {
            if( word.charAt(i) == letter ) {
                found = true;
                guess[i] = letter;
            }
        }
        if( !found )
            errors++;
    }
   
    public void computerMoves( ) {
        Random r = new Random();
        char ch;
       
        do {
            ch = (char)r.nextInt(127);
        }
        while ( lettersAlreadyGuessed.contains( Character.toLowerCase(ch) ) || !isValidMove(Character.toLowerCase(ch) + "") );
       
        lettersAlreadyGuessed.add(ch);
       
        boolean found = false;
        for( int i = 0; i < word.length(); i++ ) {
            if( word.charAt(i) == Character.toLowerCase(ch) ) {
                found = true;
                guess[i] = Character.toLowerCase(ch);
            }
        }
        if( !found )
            errors++;
    }
   
    public String toString() {
        String output = " ";
       
        for( int i = 0; i < guess.length; i++ ) {
            if( guess[i] != '\u0000')
                output += guess[i] + " ";
            else
                output += "_ ";
        }
       
        output += "\nErrors: " + errors + "\n";
       
        return output;
    }
}