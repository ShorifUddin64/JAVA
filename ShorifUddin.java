import java.util.Scanner;

class Student {
    // Encapsulation: Private variables
    private String name;
    private int id;
    private int age;

    // Constructor to initialize Name and ID
    public Student(String n, int i) {
        this.name = n;
        this.id = i;
    }

    // Setter method for Age (Encapsulation)
    public void setAge(int a) {
        this.age = a;
    }

    // Method to display information
    public void display() {
        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Age: " + this.age);
    }
}

public class ShorifUddin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        // User Input
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter your ID: ");
        int id = sc.nextInt();

        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        // Object creation using Constructor
        Student s = new Student(name, id);
        // Using Setter method
        s.setAge(age);

        // Displaying information
        s.display();

        sc.close();
    }
}

  