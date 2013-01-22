hh

/**
 *MCIS 503
 * @author Jose E. Hernandez
 * MCIS 503
 * ASSIGMENT 1
 * R-1.3
 */
public class CreditCard {
//Instance Variables
    private String number;
    private String name;
    private String bank;
    private double balance;
    private int limit;

    //Contructor
    CreditCard(String no, String nm, String bk, double bal, int lim){
        number = no;
        name = nm;
        bank = bk;
        balance = bal;
        limit = lim;
    }

    //Accessor Of creditcard
    public String getNumber() {return number; }
    public String getName() {return name;}
    public String getBank() {return bank;}
    public double getBalance() {return balance;}
    public int getLimit() {return limit;}

    /*****************
    Action methods
    *****************/

    //Make a charge
    public boolean chargetIt(double price) {
    if (price + balance > (double) limit)
        return false; //There is not enough money left to charge
    balance += price;
    return true; //The charge is posted
    }

    //Make a payment
    public void makePayment(double payment) {
        balance -= payment;
    }


    //Charge Late Fee
    public void lateFee(double fee){
        balance += fee;
    }

    //Print a cards info
    public static void printCard(CreditCard c) {
        System.out.println("Number = " + c.getNumber());
        System.out.println("Name = " + c.getName());
        System.out.println("Bank = " + c.getBank());
        System.out.println("Balance = " + c.getBalance()); //implicit cast
        System.out.println("Limit = " + c.getLimit()); //implicit cast

    }

}
