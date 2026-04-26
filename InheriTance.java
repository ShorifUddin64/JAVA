import java.util.Scanner;

// 1. Parent Class: Encapsulation is applied here
class Person {
    private String name; 

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        // Situation 1: No 'obj.' needed inside the same class
        System.out.println("Inside Person class: Accessing 'name' directly.");
        return name;
    }
}

// 2. Child Class: Inherits from Person
class Student extends Person {
    private double cgpa;

    public Student(String name, double cgpa) {
        super(name); // Sending name to Parent constructor
        this.cgpa = cgpa;
    }

    public void setCgpa(double cgpa) {
        // Situation 2: No 'obj.' needed because getName() is inherited
        System.out.println("Inside Student class: Accessing inherited method getName().");
        if(cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        }
    }

    public double getCgpa() {
        return cgpa;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Current CGPA: " + cgpa);
    }
}

// 3. General Class: Outside the inheritance hierarchy
class AccessTester {
    public void test(Student s) {
        // Situation 3: Must use 'obj.' because this is an external class
        System.out.println("Inside General class: Accessing via object -> " + s.getName());
    }
}

// Main Class: The entry point of the program
public class InHeritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String n = sc.nextLine();
        
        System.out.print("Enter CGPA: ");
        double c = sc.nextDouble();

        // Creating Object
        Student s1 = new Student(n, c);
        AccessTester tester = new AccessTester();

        System.out.println("\n--- Execution Flow ---");
        s1.displayStudentInfo(); 

        System.out.print("\nEnter Updated CGPA: ");
        double updatedC = sc.nextDouble();
        s1.setCgpa(updatedC); // Accessing via object

        System.out.println("\n--- Testing External Access ---");
        tester.test(s1); // Passing object to another class

        sc.close();
    }
}