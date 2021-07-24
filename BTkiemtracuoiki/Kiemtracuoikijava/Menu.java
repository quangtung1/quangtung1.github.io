package Kiemtracuoikijava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void mainMenu(){
        Scanner sc = new Scanner(System.in);
        Constroller controller =new Constroller();
        Repositoty repository = new Repositoty();
        repository.getData();
        List<User> users = new ArrayList<User>();
        User user1 = new User(1,"Quangtung","tung@gmail.com","Quangtung@");
        User user2 = new User(2,"Haiyen","yen@gmail.com","Haiyen@");
        User user3 = new User(3,"Quangduy","duy@gmail.com","Quangduy@");

        users.add(user1);
        users.add(user2);
        users.add(user3);
       
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
