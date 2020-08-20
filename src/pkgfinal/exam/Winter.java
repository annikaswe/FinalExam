package pkgfinal.exam;

public class Winter extends Package{
        public String season;

     public void winterPack(){
        setPInfo();
        System.out.println("[New Year or Xmas]:");
        String jSeason = input.nextLine();
        checkSeason(jSeason);
    }
    
    private void checkSeason(String Season){
        if(Season.equalsIgnoreCase("New Year") || Season.equalsIgnoreCase("Xmas"))
        {
            season = Season;
        }
        else
        {
            System.out.println("Invalid Input");
            winterPack();
        }
    }
}
