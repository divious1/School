========================
Barbershop - Readme
========================
Contact developer at:
Jose E Hernandez
http://www.josehelps.com
jh1798@nova.edu (bugs, problems, questions)
305-490-1539(M-F, 9 AM-4 PM EST)
Dec-2011

--------------------
Purpose:
--------------------
The application Barbershop purpose is to simmulate various function of a
Barbershop with the initiation variables taken from the user. The application
will simmulate for a 2 minute period various customers entering the barbershop,
getting a haircut then cashing out. The barbershop takes into consideration
customers that are priority customers and tends to them first.

Please click on the link below for the flow diagram:
http://www.gliffy.com/pubdoc/3094827/L.png

------------------------
Application Breakdown:
------------------------
Classes:
Class Customer - defines the customers functions (name, state, and priority)
also constains subrutine to generate customer name and populate
the value of the first customers.

Class Cashier - Sets the cashiers name, states whether is sleeping or not
if is not sleeping it is assumed that charging

Class Barber - Sets the Barbers name and also modifies its state wether he is
sleepingg or cutting hair.

Class Main - In order: Constructs necesary tools and classes in order to run.
Creates initial customer objects, populates the first customers using the
method in the customer class. Runs simulation for 2 mins, prints results.

Methods:
Customer:
setState (waiting, cutting, sleeping, cashing out, leaving, entering)
setPriority - False = Not Priority, True=Priority
setPosture - False = Standing (cutting) True=Sitting
getState - returns state
getPriority - returns Priority
getPosture - resturns Posture
customerNameGen - Returns a name giving a random number from 1-9.
populatingCustomers - Function that takes input from user to populate above
mutators

Barber:
setName - Barber Name
setState (Sleep/Awake) - if Awake is cutting hair
getState - returns state

Cashier
setState (Sleep/Awake) - if Awake is charging
getState - returns state

Main:
Has not method everything is done in the Main Class.

-------------------------------------------------
Important Information/Application Disambiguation:
-------------------------------------------------
* Main class - uses internal system time and the calendar utility to calculate
the time the simulation has to run, this is done block labled
"Time Keeping for the Simulation"

*Main class - instatiates - Random class is used to generate names, and
random state changes for the simulation.

*Main class - Before the Simulation start the time is printed as a reference

*Main class - the variable TOTAL_NUMBER_OF_CHAIRS is used to define the queue
size of the waiting room.

*Main class - the logic blocks is what test and implements the logic of the
simulation per customer instance wrapped in the while loop that keeps track of
the time the application is running.

*Main class - currentCustomer object keeps track of the current customer passing
through the loop.

*Customer class - customerGenName is a function that when fed a integer it
returns a name, the maximum number that it can be fed is interger 9.
Will take any number from 1 -9 and return a valid name. If giving any other
number will return "Anonymous".

----------------------
How-To:
----------------------
To run the project from the command line, go to the dist folder and
type the following:

java -jar "BarberShop.jar" 

The .jar file is located in /dist/ folder

You will be asked to input some initial values, please make sure that you type 
yes or no, only as the program will crash if any other value is inputed in 
there questions. 

-----

Known Issues:
* Program simulation now runs for only a few seconds, crashes soon after -
This is believe to be due to a memory issue although at the moment is being
looked at. If the logic blocks are removed and the application is ran again it
works for 2 mintues as its meant to.


* Error handeling is not fully implemented - some function have input validation
while some don't.

* Error on line 308 - seem in some cases when simulation tries to add to the
currentCustomer object a null value. The application crashes, this is being
looked at, the logic blocks must be debuged.






