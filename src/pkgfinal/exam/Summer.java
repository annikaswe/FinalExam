
package pkgfinal.exam;

public class Summer extends Package{
      public String month;
    
    public void summerPInfo(){
        setPInfo();
        System.out.println("[January or June]:");
        String jmonth  = input.nextLine();
        checkMonth(jmonth);
    }
    
    private void checkMonth(String Month){
        if(Month.equalsIgnoreCase("january") || Month.equalsIgnoreCase("june"))
        {
            month=Month;
        }
        else
        {
            System.out.println("Invalid Input");
            summerPInfo();
        }
    }
}
