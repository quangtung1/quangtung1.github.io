package Hackathon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Euro {
    // Bài1
public boolean isTriangle(double a, double b, double c){
    boolean result = false;
    if ((a + b > c) || (a + c > b) || (b + c > a)) {
        System.out.println("Đây là tam giác ");result=true;
    }else{ System.out.println("Đây không phải là tam giác !") result=false;}
    return result;
}

    // Bài2
    public void Team(String str[]) {

        List<String> list = new ArrayList<>();
        for (int i = 1; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (!list.contains(str[i]) && !list.contains(str[j]) && j != i) {
                    list.add(str[i]);
                    list.add(str[j]);
                    System.out.print("{ " + str[i] + " - " + str[j] + " }");
                    for (int k = 0; k < str.length; k++) {
                        for (int l = 0; l < str.length; l++) {
                            if (!list.contains(str[k]) && !list.contains(str[l]) && k != l) {
                                list.add(str[k]);
                                list.add(str[l]);
                                System.out.println("  " + " { " + str[k] + " - " + str[l] + " }");
                            } else {
                                continue;
                            }

                        }

                    }
                } else {
                    continue;
                }

            }
            System.out.println("");
            list.clear();
        }

    }
    //Bài3
    public  String cameCase(String input){
        String s1="";
        input = input.toLowerCase();
        String[] ss = input.split(" ");
        for(String s: ss){
            if (!s.equals("")&&!s.equals(null)) {
                s1 += String.valueOf(s.charAt(0)).toUpperCase()+s.substring(1)+" ";
            }
         

        }
        if(!s1.equals("")&&!s1.equals(null)){
            s1=s1.substring(0,s1.length()-1);
        }
        return s1 ;
    }
    //Bài 4
    
}
