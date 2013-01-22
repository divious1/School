/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Jose E. Hernandez
 * MCIS 503
 * N01299660
 *
 * ArithProgression
 */
class ArithProgression extends Progression {

    //Increment
    protected long inc;

    /*inherits variable first and cur
    Defaul constructor setting a unit increment
     */
    ArithProgression(){
        this(1);
    }
   /*Parametric constructor providing the increment */
    ArithProgression(long increment) {
        inc = increment;
    }
/*
 * advance the progression by adding the increment to the current value
 * @return next value of the progression
 */
    protected long nextValue(){
        cur += inc;
        return cur;
    }

    //inherits methods firstValue() and printProgression(int).
}
