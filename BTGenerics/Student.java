package BTGenerics;

public class Student {
    @Override
    public String toString() {
        return "Student [age=" + age + ", id=" + id + ", name=" + name + "]";
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Student(long id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
    long id;
    int age;
    String name;
    
}
