package btvn4;




public class Team {
   
    private String nameclub;
    private String stadium;
    private String coach;
    private int year;
    
    public Team(String nameclub, String stadium, String coach, int year) {
        this.nameclub = nameclub;
        this.stadium= stadium;
        this.coach= coach;
        this.year=year;
        
    }
   
   public void show() {
       System.out.println(nameclub + stadium + coach + year);
   }
   

}

