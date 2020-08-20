package pkgfinal.exam;

import java.util.Scanner;

public class FinalExam {

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Input Summer Package");
        Summer s=new Summer();
        s.summerPInfo();
        
        System.out.println("Input Winter Package");
        Winter w=new Winter();
        w.winterPack();
        
        System.out.println("Input Traveller Info");
        Traveler t=new Traveler();
        t.travelerInfo();
        
        System.out.println("Packages\n1.Summer\n 2.Winter\nWhich Package You want to Buy:");
        int type=input.nextInt();
      
       if(type==1){
           System.out.println("Seat Available "+s.getSetCap());
       }else{
           System.out.println("Seat Available "+w.getSetCap());
       }
       
        System.out.println("Total Number of Seat You want to buy:");
        int seat=input.nextInt();
        if(type==1){
            if(s.Seatavailability(seat)){
                s.buy_package(seat);           
               double toalPrice= t.payment_calcualtion(seat, s.getPrice());
                System.out.println("You Have to Pay "+toalPrice);
                
            }else{
                System.out.println("Seat Not available");
            }
       }else{
            if(w.Seatavailability(seat)){
                w.buy_package(seat);
              
               double toalPrice= t.payment_calcualtion(seat, w.getPrice());
                System.out.println("You Have to Pay "+toalPrice);
                
            }else{
                System.out.println("Seat Not available");
            }
       }
        
    }
    
}
