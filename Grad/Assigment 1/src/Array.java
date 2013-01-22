/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Jose E. Hernandez
 * MCIS 503
 * N01299660
 */
public class Array {

    public boolean isDistinct (float [] numbers){

        int duplicates = 0;

            for (int counter = 0;counter < numbers.length;counter++ ){
              float objCheck = numbers[counter];



              for (int checker = 0; checker < numbers.length; checker++){
                    if (numbers[checker] == objCheck)
                                    duplicates+=1;
               }
            }
        if (duplicates > 0)
            return false;
        else return true;

    }


}
