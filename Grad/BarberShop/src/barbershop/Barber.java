/*Author: Jose E Hernandez - jh1798
 *CISC 640
 *
 * Defines Barbers accessors and setters methods
 * Sets Barber state (sleep/awake)
 */

package barbershop;

public class Barber {

private String name; // name of barber
private boolean state; //Sleep = False, True = Awake, if is awake is cutting hair

//Contructor
    Barber(String nam, boolean sta){
        name = nam;
        state = sta;
    }

//Accessors
public boolean getState ()
    {
        return state;
    }
public String getName ()
    {
        return name;
    }

//Mutators
public void setState (boolean sta)
    {
    state = sta;
    }
public void setName(String nam)
    {
    name = nam;
    }
}

