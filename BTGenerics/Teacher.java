package BTGenerics;

public class Teacher {
    @Override
    public String toString() {
        return "Teacher [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    public Teacher(long id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    long id;
    String name;
    long salary;
}
