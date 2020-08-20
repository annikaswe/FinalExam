
package pkgfinal.exam;

import java.util.Scanner;

public class Traveler {
     public String t_id;
    public String t_name;
    public String t_type;
    Scanner input = new Scanner(System.in);
    
    Summer s;
    Winter w;
    
    public void travelerInfo(){
        System.out.println(" Name:");
        t_name = input.nextLine();
        System.out.println(" ID:");
        t_id = input.nextLine();
        System.out.println("Traveler Type(Registerd or UnRegistered):");
        t_type = input.nextLine();
    }
    
    public String getID(){
        return t_id;
    }
    
    public boolean  checkType(String tType){
        return tType.equalsIgnoreCase("Registered");
    }
    
    public double getDiscount(double price){
        return price*.1;
    }
    public double getTax(double price){
        return price*.2;
    }
    public double payment_calcualtion(int seat,double price){
        double totalPrice=seat*price;
         
        if(checkType(t_type)){
            totalPrice=totalPrice-getDiscount(totalPrice);
        }else{
            totalPrice=totalPrice-getTax(totalPrice);
        }
        return totalPrice;
    }
   
}
