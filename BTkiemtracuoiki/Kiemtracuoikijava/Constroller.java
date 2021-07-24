package Kiemtracuoikijava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import com.google.gson.reflect.TypeToken;

import com.google.gson.Gson;
public class Constroller {
    Scanner sc = new Scanner(System.in);
    
    public  void login(List<User> users){
        //Thực hiện đăng nhập
       
        /*FileReader reader = new FileReader("acount.json");

        users = new Gson().fromJson(reader, new TypeToken<List<User>>() {}.getType());*/

    System.out.println("Mời bạn nhập tên tài khoản:");
    
    String t= sc.nextLine();
    
    System.out.println("Mời bạn nhập mật khẩu:");
    String pass=sc.nextLine();
    for (User user : users) {
        if ((user.getPassword().equals(pass)) && (user.getUsername().equals(t))) {
            
            while (true) {
                System.out.println("Chào mừng " + t +" , bạn có thể thực hiện các công việc sau: ");
            System.out.println("1. Thay đổi user.");
            System.out.println("2, Thay đổi email.");
            System.out.println("3. Thay đổi mật khẩu.");
            System.out.println("4. Đăng xuất.");
            System.out.println("0. Thoát.");
                int m =sc.nextInt();
            switch (m) {
                case 1:changeUsername(users);
                    
                    break;
            case 2: changeEmail(users);break;
            case 3: changePassword(users);break;
            case 4:  System.out.println("Mời bạn nhập tên tài khoản:");
            user.setUsername(sc.nextLine());sc.nextLine();
            System.out.println("Mời bạn nhập mật khẩu:");
            user.setPassword(sc.nextLine());sc.nextLine();
                break;
                case 0:System.exit(0);break;

                default:
                    break;
            }
            }
            
        }else{System.out.println("Mời bạn chọn lựa:");
        System.out.println("1. Đăng nhập lại") ;
        System.out.println("2. Quên mật khẩu");
        int n=sc.nextInt();
        switch (n) {
            case 1:
            System.out.println("Mời bạn đăng nhập lại");
            System.out.println("Mời bạn nhập tên tài khoản:");
            user.setUsername(sc.nextLine());sc.nextLine();
            System.out.println("Mời bạn nhập mật khẩu:");
            user.setPassword(sc.nextLine());sc.nextLine();
                break;
        case 2: 
        forgotPassword(users);
            default:
                break;
        }
    
    }
    }
    



    }

    public void changePassword(List<User> users){
        //Thay đổi mật khẩu
        System.out.println("Nhập ID bạn muốn sửa:");
        long id = sc.nextLong();sc.nextLine();
    System.out.println("Mời bạn nhập mật khẩu mới:");
    String password = sc.nextLine();
   
   // users.stream().filter(user -> user.getId()== id).findFirst().get().setPassword(password);
    for (User user : users) {
        if (user.getId()==id) {
            user.setPassword(password);
        }
    }
    }

    

    public void changeUsername(List<User> users){
        //Thay đổi username
       
        System.out.println("Nhập ID bạn muốn sửa:");
        long id = sc.nextLong();sc.nextLine();
    System.out.println("Mời bạn nhập tài khoản mới:");
    String username = sc.nextLine();
   
    
    for (User user : users) {
        if (user.getId()==id) {
            user.setUsername(username);
        }
    }}
    public void changeEmail(List<User> users){
        //Thay đổi email
        System.out.println("Nhập ID bạn muốn sửa:");
        long id = sc.nextLong();sc.nextLine();
    System.out.println("Mời bạn nhập email mới:");
    String email = sc.nextLine();
   
    
    for (User user : users) {
        if (user.getId()==id) {
            user.setEmail(email);
        }
    }
    }


    

    public void forgotPassword(List<User> users){
        //Quên mật khẩu
System.out.println("Mời bạn nhập email:");
String s = Validate.validateEmail(sc.nextLine());
for (User user : users) {
    if (s.equals(user.getEmail())) {
        System.out.println("Mời bạn nhập mật khẩu mới:");
        user.setPassword(sc.nextLine());
    }else{System.out.println("Email bạn nhập không có.");}
}

    }
    public void show(List<User> users){
for(User user : users){
    System.out.println(user);
}
    }

    public void createNewAccount(List<User> users)
    {
        //Tạo tài khoản mới
       for (User user : users) {
        System.out.println("Mời bạn nhập tài khoản: ");
        user.setUsername(sc.nextLine());
        String t=user.getUsername();
          System.out.println("Mời bạn nhập email:");
          user.setEmail(sc.nextLine());
          String e= user.getEmail();
          System.out.println("Mời bạn nhập mật khẩu:");
          user.setPassword(sc.nextLine());
          String p = user.getPassword();
          users.add(new User(4,t,e,p));
       }
        
        
    }}

