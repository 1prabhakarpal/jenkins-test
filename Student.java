public class Student{

    String name;

    Student student(){
        System.out.println("Student Constructor");
        return this;
    }

    Student setName(String name){
        this.name = name;
        System.out.println("Setting name: " + name);
        return this;
    }

    Student getName(String name){
        System.out.println("Getting name: " + name);
        return this;
    }
    
}