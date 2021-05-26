package btvn4;


import java.util.List;

public class App {
    public static void main(String[] args){
        Team team = new Team("Barca","Noucamp","B",1876);
        team.show();
        List<Player> players= Player.ListOfClubBarca() ;
        for(Player p : players){
            p.showp();
        }


        }
        
        
    }
    

