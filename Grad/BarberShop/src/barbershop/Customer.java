/*Author: Jose E Hernandez - jh1798
 *CISC 640
 *
 * Defines Customers accessors and setters methods
 * Sets Customer state (...)
 * Sets Customer Priority level
 *
 */

package barbershop;
import java.util.Scanner;
public class Customer {

private String name; //Customer Name
private String state; //waiting,cutting,sleeping,cashing out, leaving, entering
private boolean priority;
private boolean posture; //False = Standing (cutting) True=Sitting
public String response_name;
public String response_priority;

Scanner input = new Scanner(System.in);
//Contructor
    Customer(String nam, String sta, boolean pri, boolean post){
        //Validation that priority was set correctly

       
        priority = pri;
        name = nam;
        state = sta;
        post = posture;
    }

//Empty Constructor if we decide to Populate customers with build in function
    Customer(){
        name = "";
        state = "";
        priority = false;
        posture = false;
    }


//Accessors
public String getName ()
    {
    return name;
    }
public String getState ()
    {
        return state;
    }

public boolean getPriority()
    {
        return priority;
    }

public boolean getPosture()
    {
        return posture;
    }

//Mutators
public void setName (String nam)
    {
    name = nam;
    }
public void setState (String sta)
    {
    state = sta;
    }
public void setPosture(boolean post)
    {
    posture = post;
    }
public void setPriority(boolean pri)
    {
    priority = pri;
    }

public String customerNamesGen ( int name)
{
    String customerName = null;
    switch (name){
        case 1: customerName = "Arnold";  break;
        case 2: customerName = "Tom";  break;
        case 3: customerName = "Obama";  break;
        case 4: customerName = "Jesus";  break;
        case 5: customerName = "Oscar";  break;
        case 6: customerName = "Ziti";  break;
        case 7: customerName = "Amber";  break;
        case 8: customerName = "Ross";  break;
        case 9: customerName = "Stuart";  break;
        default: customerName = "Anonymous"; break;
    }
    return customerName;
}
public void populatingCustomers()
    {
/*We only need the priority and name to beging with,
 we assume that the customer is ready for a haircut
 unless the barber is busy, This is tested on the populatingWaitingRoom
 *
 */

//Gets the customer Name
System.out.println("Please enter customers name:");
        try {
         response_name = input.nextLine();
      } catch (Exception io) {
         System.out.println("Error Trying to Read customer Name:");
         System.exit(1);
      }

//Get the Customer Priority
System.out.println("Is it a priority customer\n"
        + "Note: Yes and No answer only");
         try {
            while (!input.hasNext("Yes") & !input.hasNext("No") & !input.hasNext("no") & !input.hasNext("yes")) //Input validation
            {
            System.out.println("Priorty has to be Yes or No...Quitting");
            System.exit(1);
            }
         response_priority = input.nextLine();
         
                   
                } catch (Exception io)
                  {
                  System.out.println("Error Trying to Read customer Priority");
                  System.exit(1);
                  }
         if (response_priority.equals("yes") | response_priority.equals("Yes"))
        {
         Customer.this.setPriority(true);
        }
        else {
         Customer.this.setPriority(false);
        }
         Customer.this.setName(response_name);
         Customer.this.setState("entering"); //Customer just entered the barbershop
         Customer.this.setPosture(true); //Set standing as the default Value

      }





}



