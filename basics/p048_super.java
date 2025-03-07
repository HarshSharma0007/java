public class p048_super {
    public static void main(String[] args) {
        Person person = new Person("Tom","Riddle");
        Student stud = new Student("Harry", "Potter", 3.34);
        Employee employee = new Employee("Rubeus", "Hagrid", 50000);
        stud.showname();
        stud.showGpa();
        employee.showSalary();


        
    }
}
class Person{
    String first;
    String last;

    Person(String first, String last){
        this.first = first;
        this.last = last;
    }
    void showname(){
        System.out.println("Your name is: " + this.first + " " + this.last);
    }
}

class Student extends Person{
    double gpa;

    Student(String first, String last, double gpa){
        // super
        super(first, last);

        this.gpa = gpa;
    }

    void showGpa(){
        System.out.println(this.first + " GPA is "+ this.gpa);
    }
}
class Employee extends Person{
    int salary;
    Employee(String first, String last, int salary){
        // super
        super(first, last);

        this.salary = salary;
    }

    void showSalary(){
        System.out.println(this.first + "'s Salary is "+ this.salary);

    }

}