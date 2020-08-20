
package pkgfinal.exam;

import java.util.Scanner;



public class Package {
    
    public String p_id;
    public String p_name;
    public double p_price;
    public int p_seatcap=10;
    Scanner input = new Scanner(System.in);
    
    public void setPInfo(){
        System.out.println("ID:");
        p_id = input.nextLine();
        System.out.println("Name:");
        p_name = input.nextLine();
        System.out.println("Price per person:");
        p_price = input.nextDouble();
        input.nextLine();
    }
    
    public void buy_package(int seat){
        p_seatcap = p_seatcap-seat;
    }
    
    public boolean Seatavailability(int seat){
        if(seat<p_seatcap)
        {
            return true;
        }
        else
        {
            System.out.println("Not available");
            return false;
        }
    }
    
    public String getID(){
        return p_id;
    }
    
    public String getPName(){
        return p_name;
    }
    
    public double getPrice(){
        return p_price;
    }
    
    public int getSetCap(){
        return p_seatcap;
    }
}

