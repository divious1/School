/*Author: Jose E Hernandez - jh1798
 *CISC 640
 *
 * contructs necessary objects
 * sets intro to simulation 
 * start sim implementes logic block
 * prints results
 */

package barbershop;
//import java.util.Random;
import java.text.ParseException;
//import java.util.LinkedList;
//import java.util.Queue;
import java.util.*;
//import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
public class Main {

//Number of Chairs in Barbershop
public static final int TOTAL_NUMBER_OF_CHAIRS = 5;

/*Constructors Used*/
static Random randomizer = new Random();//Random data
static Scanner input = new Scanner(System.in); //Input grabber from the User
//static LinkedList<Customer> waitingRoom; //Creates FIFO Queue for Waiting Room
static Queue<Customer> waitingRoom=new LinkedList<Customer>();
//static Queue<Customer> waitingRoom = new Queue();
//waitingRoom = new LinkedList();

static Calendar timer;//Time Utility

//Create Barber and Cashier
static Barber barber = new Barber("Ricky Booby",false);
static Cashier cashier = new Cashier("Colber", false);

//Create amount of participating customers
static Customer customer1 = new Customer ();
static Customer customer2 = new Customer ();
static Customer customer3 = new Customer ();
static Customer customer4 = new Customer ();
static Customer customer5 = new Customer ();
static Customer currentCustomer = new Customer ();
static Customer lastCustomer = new Customer();

       
/*
public void populatingWaitingRoom(){ //Populates the Waiting Room



    for (int chairsUsed=0; chairsUsed >= TOTAL_NUMBER_OF_CHAIRS; chairsUsed++) {
       Customer Customer+'chairsUsed' = new Customer();
      waitingRoom
        }
}
*/



   public static void main(String[] args) throws ParseException {
   //Intro Message
   System.out.println("*****************************************\n" +
                      "******* Welcome To Titos Barbershop *****\n" +
                      "*****************************************\n"
                      + "Before we start the simulation lets create the customers below\n");

   //Now We create the customers (default their values)
     System.out.printf("Please enter the 1st Customers info below:\n");
      customer1.populatingCustomers();
      waitingRoom.add(customer1);

     System.out.printf("Please enter the 2nd Customers info below:\n");
      customer2.populatingCustomers();
      waitingRoom.add(customer2);
      
     System.out.printf("Please enter the 3nd Customers info below:\n");
      customer3.populatingCustomers();
      waitingRoom.add(customer3);
      
     System.out.printf("Please enter the 4nd Customers info below:\n");
      customer4.populatingCustomers();
      waitingRoom.add(customer4);
      
     System.out.printf("Please enter the 5nd Customers info below:\n");
      customer5.populatingCustomers();
      waitingRoom.add(customer5);
      
    System.out.println("\n***********Now That we Have all the Customers information.***********");
    System.out.println("Current Time " + Calendar.HOUR + ":" + Calendar.MINUTE + ":" + Calendar.SECOND);
    System.out.println("Would You Like to continue with the Simulation?" +
            "\nNote: Yes and No answer only");
   
    while (!input.hasNext("Yes") & !input.hasNext("No") & !input.hasNext("no") & !input.hasNext("yes")) //Input validation
            {
            System.out.println("Answer has to be Yes or No...Quitting");
            System.exit(1);
            }
            String inputAnswer = input.nextLine();
    if (inputAnswer.equals("yes") | inputAnswer.equals("Yes"))
         {
          //Time Keeping for the Simulation
            long startTime = System.currentTimeMillis();
            long endTime = startTime + 120000;
            
     //START OF SIMULATION
           int nextCustomerGen;
          
                     while (startTime <= endTime)
                    {
                        
                     nextCustomerGen=randomizer.nextInt(TOTAL_NUMBER_OF_CHAIRS+1);
                     switch (nextCustomerGen) {
//****************************Logic Block 1 if customer 1 gets randomly selected************************                         
                         case 1: 
                         /*Randomizing date
                         */
                         customer1.setName(customer1.customerNamesGen(randomizer.nextInt(10)));
                         System.out.println("Customer: " + customer1.getName() + "Just Entered the Waiting Room");
                         customer1.setPriority(randomizer.nextBoolean());
                         if (customer1.getPriority()==true)
                         {
                             System.out.println(customer1.getName() + " is a priority customer "); //Define if is a priority Customer
                             if (waitingRoom.size()>=TOTAL_NUMBER_OF_CHAIRS){
                             System.out.println("Waiting Room is full customer is standing up"); //Checking to see if Waiting Room is full
                             customer1.setState("Waiting");
                             customer1.setPosture(false);
                             }
                             if (barber.getState() == false)
                             System.out.println("Barber sleeping, Waking up barber");
                             barber.setState(true);
                             }
                         else {
                         System.out.println(customer1.getName() + " is a not priority customer ");  
                         if (waitingRoom.size()>=TOTAL_NUMBER_OF_CHAIRS){
                             System.out.println("Waiting Room is full customer is leaving"); //if is not a priority they leave queue is not extended
                             break;
                         }
                            else{
                                if (!waitingRoom.isEmpty()){
                                waitingRoom.add(customer1);
                                }
                                customer1.setState("Cutting");
                                customer1.setPosture(true);
                                System.out.println("There was not customer waiting " + customer1.getName() + "is now getting a Haircut");
                                break;
                            }
                         }
                         waitingRoom.add(customer1);
                         
                         break;
//****************************Logic Block 2 if customer 2 gets randomly selected************************                            
                         case 2: 
                         /*Randomizing date
                         */
                         customer2.setName(customer2.customerNamesGen(randomizer.nextInt(10)));
                         System.out.println("Customer: " + customer2.getName() + " Just Entered the Waiting Room");
                         customer2.setPriority(randomizer.nextBoolean());
                         if (customer2.getPriority()==true)
                         {
                             System.out.println(customer2.getName() + " is a priority customer "); //Define if is a priority Customer
                             if (waitingRoom.size()>=TOTAL_NUMBER_OF_CHAIRS){
                             System.out.println("Waiting Room is full customer is standing up"); //Checking to see if Waiting Room is full
                             customer2.setState("Waiting");
                             customer2.setPosture(false);
                             }
                             if (barber.getState() == false)
                             System.out.println("Barber sleeping, Waking up barber");
                             barber.setState(true);
                             }
                         else {
                         System.out.println(customer1.getName() + " is a not priority customer ");  
                         if (waitingRoom.size()>=TOTAL_NUMBER_OF_CHAIRS){
                             System.out.println("Waiting Room is full customer is leaving"); //if is not a priority they leave queue is not extended
                             break;
                         }
                            else{
                                if (!waitingRoom.isEmpty()){
                                waitingRoom.add(customer1);
                                }
                                customer2.setState("Cutting");
                                customer2.setPosture(true);
                                System.out.println("There was not customer waiting " + customer2.getName() + " is now getting a Haircut");
                                break;
                            }
                         }
                         waitingRoom.add(customer2);
                         break;                             
//****************************Logic Block 3 if customer 3 gets randomly selected************************                            
                         case 3: 
                         /*Randomizing date
                         */
                         customer3.setName(customer3.customerNamesGen(randomizer.nextInt(10)));
                         System.out.println("Customer: " + customer3.getName() + " Just Entered the Waiting Room");
                         customer3.setPriority(randomizer.nextBoolean());
                         if (customer3.getPriority()==true)
                         {
                             System.out.println(customer3.getName() + " is a priority customer "); //Define if is a priority Customer
                             if (waitingRoom.size()>=TOTAL_NUMBER_OF_CHAIRS){
                             System.out.println("Waiting Room is full customer is standing up"); //Checking to see if Waiting Room is full
                             customer3.setState("Waiting");
                             customer3.setPosture(false);
                             }
                             if (barber.getState() == false)
                             System.out.println("Barber sleeping, Waking up barber");
                             barber.setState(true);
                             }
                         else {
                         System.out.println(customer1.getName() + "is a not priority customer ");  
                         if (waitingRoom.size()>=TOTAL_NUMBER_OF_CHAIRS){
                             System.out.println("Waiting Room is full customer is leaving"); //if is not a priority they leave queue is not extended
                             break;
                         }
                            else{
                                if (!waitingRoom.isEmpty()){
                                waitingRoom.add(customer1);
                                }
                                customer3.setState("Cutting");
                                customer3.setPosture(true);
                                System.out.println("There was not customer waiting " + customer3.getName() + " is now getting a Haircut");
                                break;
                            }
                         }
                         waitingRoom.add(customer3);
                         break;  
//****************************Logic Block 4 if customer 4 gets randomly selected************************                            
                         case 4: 
                         /*Randomizing date
                         */
                         customer4.setName(customer4.customerNamesGen(randomizer.nextInt(10)));
                         System.out.println("Customer: " + customer4.getName() + "Just Entered the Waiting Room");
                         customer4.setPriority(randomizer.nextBoolean());
                         if (customer4.getPriority()==true)
                         {
                             System.out.println(customer4.getName() + " is a priority customer "); //Define if is a priority Customer
                             if (waitingRoom.size()>=TOTAL_NUMBER_OF_CHAIRS){
                             System.out.println("Waiting Room is full customer is standing up"); //Checking to see if Waiting Room is full
                             customer4.setState("Waiting");
                             customer4.setPosture(false);
                             }
                             if (barber.getState() == false)
                             System.out.println("Barber sleeping, Waking up barber");
                             barber.setState(true);
                             }
                         else {
                         System.out.println(customer1.getName() + " is a not priority customer ");  
                         if (waitingRoom.size()>=TOTAL_NUMBER_OF_CHAIRS){
                             System.out.println("Waiting Room is full customer is leaving"); //if is not a priority they leave queue is not extended
                             break;
                         }
                            else{
                                if (!waitingRoom.isEmpty()){
                                waitingRoom.add(customer1);
                                }
                                customer4.setState("Cutting");
                                customer4.setPosture(true);
                                System.out.println("There was not customer waiting " + customer4.getName() + " is now getting a Haircut");
                                break;
                            }
                         }
                         waitingRoom.add(customer4);
                         break;    
//****************************Logic Block 5 if customer 5 gets randomly selected************************                            
                         case 5: 
                         /*Randomizing date
                         */
                         customer5.setName(customer5.customerNamesGen(randomizer.nextInt(10)));
                         System.out.println("Customer: " + customer5.getName() + " Just Entered the Waiting Room");
                         customer5.setPriority(randomizer.nextBoolean());
                         if (customer5.getPriority()==true)
                         {
                             System.out.println(customer5.getName() + " is a priority customer "); //Define if is a priority Customer
                             if (waitingRoom.size()>=TOTAL_NUMBER_OF_CHAIRS){
                             System.out.println("Waiting Room is full customer is standing up"); //Checking to see if Waiting Room is full
                             customer5.setState("Waiting");
                             customer5.setPosture(false);
                             }
                             if (barber.getState() == false)
                             System.out.println("Barber sleeping, Waking up barber");
                             barber.setState(true);
                             }
                         else {
                         System.out.println(customer1.getName() + " is a not priority customer ");  
                         if (waitingRoom.size()>=TOTAL_NUMBER_OF_CHAIRS){
                             System.out.println("Waiting Room is full customer is leaving"); //if is not a priority they leave queue is not extended
                             break;
                         }
                            else{
                                if (!waitingRoom.isEmpty()){
                                waitingRoom.add(customer1);
                                }
                                customer5.setState("Cutting");
                                customer5.setPosture(true);
                                System.out.println("There was not customer waiting " + customer5.getName() + " is now getting a Haircut");
                                break;
                            }
                         }
                         waitingRoom.add(customer5);
                         break;
                      } 
                     
                     
                  /* Now We assign the top customer is the queue that we are going to work with */
                  currentCustomer = waitingRoom.poll();
                  System.out.println("Waiting customer is" + currentCustomer);
                  currentCustomer.setState("Cutting");
                  System.out.println("***Barber is now cutting " + currentCustomer.getName() + "***");
                  waitingRoom.remove();
                  System.out.println("***There are " + waitingRoom.size() + " customers in the waiting room***");
                  lastCustomer = currentCustomer;
                  System.out.println("***The Cashier " + cashier.getName() + " is cashing out " + lastCustomer.getName() + "***");
             
                     
                        //Converts Epoch Time to Regular Human Format for debugging
                       /*Debugging Clock, counts time that has passed Running SIM
                        *
                       String Date = Long.toString(startTime);
                        Date expiry = new Date(Long.parseLong(Date));
                        System.out.println("Time passed: " + expiry);
                        * 
                       */        
                       
                     
        startTime = System.currentTimeMillis();//Updating Curret Time   
   
         }
         System.out.println("Simulation Ran for 2 Minutes");//Simulation Completed

    }
    else{
        System.out.println("Thank you now exiting...So long");
        System.exit(1);
            }



  }//Main Bracket
        








}//Last Bracket






























             





