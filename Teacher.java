public class Teacher{
    private String name;
    private String subject;


// Method to display teacher details
    public void displayTeacher() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Subject: " + subject);
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void addTeacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    
}