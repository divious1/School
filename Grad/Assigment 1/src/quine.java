
import java.io.PrintStream;
import java.util.Locale;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Jose E. Hernandez
 * MCIS 503
 * N01299660
 */
public class quine {
   public static void main(String args[]){
        PrintStream printf = System.out.printf(Locale.FRENCH, null);
        System.out.print(printf);
    }

}
