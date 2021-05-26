package btvn4;
import java.util.ArrayList;
import java.util.List;

public class Player {
    
      
        String name;
        int no;
        String position;
        int age;
        public Player(String name, int no, String position, int age) {
            this.name = name;
            this.no = no;
            this.position=position;
            this.age = age;
        }
        
        public static List<Player> ListOfClubBarca(){
            List<Player> players = new ArrayList<Player>();
            players.add(new Player("Messi",10,"FW",32));
            players.add(new Player("Neymar",11,"FW",26));
            players.add(new Player("Pique",3,"DF",33));
            players.add(new Player("Stergen",1,"GK",29));
            return players;
        }
        public void showp(){
            System.out.println("Tên cầu thủ:" + name + "Số áo " + no + "Vị trí " + position + "Tuổi " + age);
        }
        
    
   
    
}
