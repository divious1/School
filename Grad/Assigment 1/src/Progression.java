/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Jose E. Hernandez
 * MCIS 503
 * N01299660
 *
 * Class for numeric progressions
 */
public class Progression {

    //First Value
    protected long first;

    //Current Value
    protected long cur;

    //Defaul Constructor
    Progression(){
        cur = first = 0;
    }

    /*reset progression to the first value
     @return first  value*/

   protected long firstValue(){
       cur = first;
       return cur;
   }

   /* Advance to next Value
    * @return next value of the progression
    */
   protected long nextValue(){
       return ++cur; //default next value
   }

   /*Prints first value
    * @param n number of values to print
    */
   public void printProgression(int n) {
       System.out.print(firstValue());
       for (int i = 2; i <= n; i ++)
           System.out.print(" " + nextValue());
       System.out.println(); //ends the line
   }

}
