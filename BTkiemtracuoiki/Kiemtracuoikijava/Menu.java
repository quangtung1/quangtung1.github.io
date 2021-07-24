package Kiemtracuoikijava;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void mainMenu() throws FileNotFoundException{
        Scanner sc = new Scanner(System.in);
       
        List<User> users = new ArrayList<User>();
        User user1 = new User(1,"Quangtung","tung@gmail.com","Tungking@");
        User user2 = new User(2,"Haiyen","yen@gmail.com","Yenqueen@");
        User user3 = new User(3,"Quangduy","duy@gmail.com","Quangduy@");

        users.add(user1);
        users.add(user2);
        users.add(user3);
       Constroller controller = new Constroller();
       
        System.out.println("Lựa chọn: ");
        System.out.println("1 - Đăng nhập");
        System.out.println("2 - Đăng ký");
        System.out.println("Lựa chọn của bạn là: ");
        while (true) {
         
            int n= sc.nextInt();
            
                switch (n) {
                    case 1:
                        controller.login(users);

                        break;
                case 2: controller.createNewAccount(users);
                    default:
                        break;
   
            }        
        }
    }
}
