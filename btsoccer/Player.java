package btsoccer;

public class Player {
    @Override
    public String toString() {
        return "Player [age=" + age + ", name=" + name + ", no=" + no + ", position=" + position + "]";
    }
    String name;
    int no;
    String position;
    int age;
    public Player(String name, int no, String position, int age) {
        this.name = name;
        this.no = no;
        this.position = position;
        this.age = age;
    }
    
}
