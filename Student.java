import java.util.ArrayList;
import java.util.List;

public class Student {
    // Attributs d'un étudiant
    private String name;
    private int age;

    // Liste statique partagée entre tous les objets Student
    private static List<Student> studentList = new ArrayList<>();

    // Constructeur
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Méthode statique pour ajouter un étudiant à la liste
    public static void addStudent(String name, int age) {
        Student newStudent = new Student(name, age);
        studentList.add(newStudent);
    }

   
    // Méthode main pour tester
    public static void main(String[] args) {
        Student.addStudent("Alice", 21);
        Student.addStudent("Bob", 22);
        Student.addStudent("Claire", 20);

        Student.displayStudent();
    }
}
