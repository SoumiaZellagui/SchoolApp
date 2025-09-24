import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Student {
    // Attributs d'un étudiant
    private String name;
    private int age;
    private int  anne_nissance ;

    // Liste statique partagée entre tous les objets Student
    private static List<Student> studentList = new ArrayList<>();

    // Constructeur
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Méthode pour ajouter un étudiant
    public static void addStudent(String name, int age) {
        Student newStudent = new Student(name, age);
        studentList.add(newStudent);
    }

    // Méthode pour remplir l'année de naissance d'un étudiant
    public static void rempliNaissance(String name, int  anne_nissance ) {
        if (studentList.isEmpty()) {
            System.out.println("Aucun étudiant enregistré.");
            return;
        }

        for (Student s : studentList) {
            if (s.name.equals(name)) {
                s.anne_nissance  = anne_nissance ;
                return;
            }
        }

        System.out.println("Étudiant non trouvé : " + name);
    }

    // Méthode pour calculer l'âge à partir de l'année de naissance
    public static void calculateAge() {
        if (studentList.isEmpty()) {
            System.out.println("Aucun étudiant enregistré.");
            return;
        }

        int currentYear = LocalDate.now().getYear();

        for (Student s : studentList) {
            
               if (s.anne_nissance  > 0) {

                s.age = currentYear - s.anne_nissance ;
            }

            
        }
    }

    // Méthode pour afficher tous les étudiants
    public static void displayStudent() {
        if (studentList.isEmpty()) {
            System.out.println("Aucun étudiant enregistré.");
        } else {
            System.out.println("Liste des étudiants :");
            for (Student s : studentList) {
                System.out.println("Nom : " + s.name + ", Âge : " + s.age + ", Année de naissance : " + s.anne_nissance ) {

                s.age = currentYear - s. anne_nissance ;
            }
;
            }
        }
    }
    // Méthode main pour tester
    public static void main(String[] args) {
        addStudent("Alice", 21);
        addStudent("Bob", 22);
        addStudent("Claire", 20);

        rempliNaissance("Alice", 1999);
        rempliNaissance("Bob", 1998);
        rempliNaissance("Claire", 2000);

        calculateAge();
        displayStudent();
    }
}
