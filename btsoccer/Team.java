package btsoccer;

import java.util.ArrayList;
import java.util.List;

public class Team {
    
    
    String name;
    String stadium;
    String coach;
    int year;
    List<Player> players=new ArrayList<>();
    public Team(String name, String stadium, String coach, int year) {
        this.name = name;
        this.stadium= stadium;
        this.coach=coach;
        this.year=year;
    }
   /*public String info() {
        return "Team [coach=" + coach + ", name=" + name + ", stadium=" + stadium + ", year=" + year + "]";
    }*/
    public void addPlayer(Player player) {
        players.add(player);
    }
    public void showPlayer(){
        System.out.println("coach=" + coach + ", name=" + name + ", stadium=" + stadium + ", year=" + year);
        System.out.println("");
        System.out.println("Danh sách cầu thủ của đội" + " " + name + ":" );
        for(Player p : players){
            System.out.println(p);
        }
        System.out.println("");
    }
    
}
