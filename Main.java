import java.util.Date;
public class Main{
    public static void main(String[] args){
        System.out.println("This is java program");
        System.out.println("output from java program");
        System.out.println(new Date());
        System.out.println("Added files");

        Student student = new Student();
        student.setName("John Doe");
        System.out.println("Student Name: " + student.getName());
    }
}