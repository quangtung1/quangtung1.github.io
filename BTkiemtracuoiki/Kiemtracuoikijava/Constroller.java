package Kiemtracuoikijava;

import java.util.List;
import java.util.Scanner;

public class Constroller {
    Scanner sc = new Scanner(System.in);
    public void login(List<User> users){
        //Thực hiện đăng nhập
       User user1 = new User(1,"Quangtung","tung@gmail.com","Tungking@");
        User user2 = new User(2,"Haiyen","yen@gmail.com","Yenqueen@");
        User user3 = new User(3,"Quangduy","duy@gmail.com","Quangduy@");

        users.add(user1);
        users.add(user2);
        users.add(user3);

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
        System.out.println("Mời bạn chọn ID tài khoản bạn muốn sửa:");
        long id=sc.nextLong();
for(int i=0;i<users.size();i++){
    if (id==users.get(i).getId()) {
        System.out.println("Mời bạn nhập mật khẩu mới:");
        String pass= sc.nextLine();sc.nextLine();
       String p= Validate.validatePassword(pass);
        users.get(i).setPassword(p);
    }
}

    }

    

    public void changeUsername(List<User> users){
        //Thay đổi username
        
        for (User user : users) {
            System.out.println("Mời bạn chọn ID tài khoản bạn muốn sửa:");
            long id=sc.nextLong();
            if (id==user.getId()) {
                System.out.println("Mời bạn nhập tên tài khoản  mới:");
        String username= sc.nextLine();sc.nextLine();
        user.setUsername(username);break;
       
    }
        }}
    public void changeEmail(List<User> users){
        //Thay đổi email
        System.out.println("Mời bạn chọn ID tài khoản bạn muốn sửa:");
        long id=sc.nextLong();
for(int i=0;i<users.size();i++){
    if (id==users.get(i).getId()) {
        System.out.println("Mời bạn nhập email mới:");
        String email= sc.nextLine();sc.nextLine();
        users.get(i).setEmail(email);
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

    public void createNewAccount(List<User> users){
        //Tạo tài khoản mới
        User user = new User();
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
}
