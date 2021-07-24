package Kiemtracuoikijava;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws  Exception {  
        List<User> users = new ArrayList<User>();
        User user1 = new User(1,"Quangtung","tung@gmail.com","Tungking@");
        User user2 = new User(2,"Haiyen","yen@gmail.com","Yenqueen@");
        User user3 = new User(3,"Quangduy","duy@gmail.com","Quangduy@");

        users.add(user1);
        users.add(user2);
        users.add(user3);
     //   Constroller con =new Constroller();
      /*  con.changePassword(users);
        users.stream().forEachOrdered(u->System.out.println(u));*/
        Menu.mainMenu();
        

        
        
      
        
     //Menu.mainMenu();
    }
}
