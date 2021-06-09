package btsoccer;

public class ListPlayer {
    public static Team ManU(){
        Team team=new Team("Manchester United","Old Trafford","Solskajar",1797);
        team.addPlayer(new Player("Macus Raford",10,"FW",26 ));
        team.addPlayer(new Player("Wayne Rooney",9,"FW",28 ));
        

        return team;
    }
    public static Team Barca(){
        Team team=new Team("Barcelona","Nou Camp","Pep guardiola",1782);
        team.addPlayer(new Player("Leoniel Mesi",10,"FW",32 ));
        team.addPlayer(new Player("Neymar JR",11,"FW",28 ));
        return team;
    }
    
}
