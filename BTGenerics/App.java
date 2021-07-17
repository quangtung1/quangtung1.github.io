package BTGenerics;

public class App {
    public static void main(String[] args) {
        Student student1 = new Student(1, 21, "Tung");
        Student student2 = new Student(2, 21, "Yen");
        Teacher teacher1 = new Teacher(1, "Duy", 8000000);
        Teacher teacher2 = new Teacher(2, "Duong", 9000000);
        PersonController<Student> personController = new PersonController<Student>();
        personController.add(student1);
        personController.add(student2);
        personController.display();
        System.out.println("___________________________________");
        System.out.println("");
        PersonController<Teacher> personController1 = new PersonController<Teacher>();
        personController1.add(teacher1);
        personController1.add(teacher2);
        personController1.display();
    }
}
