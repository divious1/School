/*
 * @author Jose E. Hernandez
 * MCIS 503
 * ASSIGMENT 1
 * R-1.7
 */

public class Flower {
    //Instance Variables
    private String name;
    private int npedals;
    private float price;

    //Constructor
    Flower (String na, int pedals, float pri){
        name = na;
        npedals = pedals;
        price = pri;
    }
    //Accessors
    public String getName (){return name;}
    public int getPedals(){return npedals;}
    public float getPrice (){return price;}

    //Action Methods
    public void setName ( String Name){
        name = Name;
    }
    public void setNumberOfPedals (int ped){
        npedals = ped;
    }
    
    public void setPrice (float currency){
        price = currency;
    }



}
