class Student{
    private String name;
    private int age; 
    private double cgpa; // private means this variable is accessible only within this class

    // private variables cannot be used directly outside this class

    // the way to access these private variables is thru public methods.
    // so basically we are binding the data (private variables) and methods (public methods) together in a single unit. this is called encapsulation.

    // getter methods
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
     public double getCGPA(){
        return cgpa;
    }

    //setter methods
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setCGPA(double cgpa){
        this.cgpa = cgpa;
    }
}

public class Encapsulation {
    public static void main(String[] args){
        Student student = new Student();
        student.setName("Tinku Badmosh");
        student.setAge(22);
        student.setCGPA(6.9);
        System.out.println( student.getName());
        System.out.println( student.getAge());
        System.out.println( student.getCGPA());
    }
}
