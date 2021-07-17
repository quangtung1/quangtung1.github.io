package BTGenerics;

public class App {
    public static void main(String[] args) {
        Student student1=new Student(1,21,"Tung");
        Student student2=new Student(2,21,"Yen");
        Teacher teacher1=new Teacher(1,"Duy",8000000);
        Teacher teacher2=new Teacher(2,"Duong",9000000);

        PersonController personController = new PersonController();
        personController.add(teacher1);
        personController.add(teacher2);
        personController.add(student1);
        personController.add(student2);
        personController.display();
    }
}
