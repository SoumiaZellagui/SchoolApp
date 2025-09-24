import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;


public class Student {
    // Attributs d'un étudiant
    private String name;
    private int age;
    private int anne_nissance ;

    // Liste statique partagée entre tous les objets Student
    private static List<Student> studentList = new ArrayList<>();

    // Constructeur
    public Student(String name, int anne_nissance ) {
        this.name = name;
        this.anne_nissance = anne_nissance;
    }

    // Méthode statique pour ajouter un étudiant à la liste
    public static void addStudent(String name, int anne_nissance) {
        Student newStudent = new Student(name,anne_nissance);
        studentList.add(newStudent);
    }
 // Méthode statique pour afficher tous les étudiants
    public static void displayStudent() {
        if (studentList.isEmpty()) {
            System.out.println("Aucun étudiant enregistré.");
        } else {
            System.out.println("Liste des étudiants :");
            for (Student s : studentList) {
                System.out.println("Nom : " + s.name + ", Âge : " + s.age);
            }
        }
    }
     public static List<Student> calculateAge ()
     { if (studentList.isEmpty()) {
            System.out.println("Aucun étudiant enregistré.");
            else{
                int currentYear = LocalDate.now().getYear();
                for (Student s : studentList) {
                s.age = currentYear - s.anne_nissance;
            }
            }
        }
     }
     public static void displayStudent() {
        if (studentList.isEmpty()) {
            System.out.println("Aucun étudiant enregistré.");
        } else {
            System.out.println("Liste des étudiants :");
            for (Student s : studentList) {
                System.out.println("Nom : " + s.name + ", Âge : " + s.age);
            }
        }
    }
   
    // Méthode main pour tester
    public static void main(String[] args) {
        Student.addStudent("Alice", 2000);
        Student.addStudent("Bob", 1999);
        Student.addStudent("Claire",1998);
        Student.calculateAge();
        Student.displayStudent();
    }
}
