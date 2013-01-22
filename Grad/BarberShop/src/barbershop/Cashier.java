/*Author: Jose E Hernandez - jh1798
 *CISC 640
 *
 * Defines Cashier accessors and setters methods
 * Sets Cashier state (sleep/awake)
 */

package barbershop;

public class Cashier {

private String name; // name of Cashier
private boolean state; //Sleep = False, True = Awake, if is awake is charging customer

//Contructor
    Cashier(String nam, boolean sta){
        name = nam;
        state = sta;
    }

//Accessors
public String getName ()
    {
        return name;
    }
public boolean getState ()
    {
        return state;
    }
//Mutators
public void setName (String nam)
    {
    name = nam;
    }
public void setState (boolean sta)
    {
    state = sta;
    }
}
