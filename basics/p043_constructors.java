public class p043_constructors {
    public static void main(String[] args) {
        Student stud1 = new Student("h",20, 8.8);
        Student stud2 = new Student(null, 0, 0);

        System.out.println(stud1.name);
        stud1.study();
        System.out.println(stud2.name);
        stud2.study();
    }
}

class Student{
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void study(){
        System.out.println(this.name + " is studying.");
    }
}