
public class CourseManager {

    // Méthode addCourse()
    public static void addCourse(String title, int credits) {
        System.out.println("Cours ajouté : " + title + " (" + credits + " crédits)");
    }

    // Méthode main()
    public static void main(String[] args) {
        addCourse("Programmation Java", 5);
        addCourse("Structures de données", 4);
    }
}
