/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Jose E. Hernandez
 * MCIS 503
 * N01299660
 */
 class TestProgression {
    public static void main(String[] args){
        Progression prog;
        //test ArithProgression
        System.out.println("Arithmetic progression with default increment:");
        prog = new ArithProgression();
        prog.printProgression(10);
        System.out.println("Arithmetic progression with increment 5:");
        prog = new ArithProgression(128);
        prog.printProgression(1000000000);
    }
}

