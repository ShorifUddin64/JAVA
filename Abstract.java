import java.util.Scanner;

// ১. প্যারেন্ট ক্লাস (Abstract Class)
abstract class University {
    // এখানে ২টি প্রাইভেট ভেরিয়েবল রাখা হয়েছে (Encapsulation)
    private String studentName;
    private String studentID;

    // কনস্ট্রাক্টর: জন্মের সময় ডাটা ইনিশিয়েলাইজ করার জন্য
    public University(String name, String id) {
        this.studentName = name;
        this.studentID = id;
    }

    // গেটার এবং সেটার (প্যারেন্ট ক্লাসের ডাটা মেইন থেকে কন্ট্রোল করার জন্য)
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String id) {
        this.studentID = id;
    }

    // অ্যাবস্ট্রাক্ট মেথড (এটি চাইল্ড ক্লাসে অবশ্যই থাকতে হবে)
    abstract void showTask();
}

// ২. চাইল্ড ক্লাস
class Student extends University {
    private double cgpa;

    public Student(String name, String id, double cgpa) {
        super(name, id); // বাবার কনস্ট্রাক্টরে ২টা ভ্যালু পাঠানো হলো
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    void showTask() {
        // বাবার গেটার ব্যবহার করে আউটপুট দেখানো হচ্ছে
        System.out.println("\n--- Student Profile ---");
        System.out.println("Name: " + getStudentName());
        System.out.println("ID: " + getStudentID());
        System.out.println("Current CGPA: " + cgpa);
        System.out.println("Task: Preparing for Higher Education.");
    }
}

// ৩. মেইন ক্লাস
public class Abstract {
    public static void main(String[] args) {
        // ১. কনস্ট্রাক্টর দিয়ে শুরুতে ডাটা সেট করা
        Student s1 = new Student("Shorif", "24-56789-1", 3.80);
        
        // ২. সরাসরি আউটপুট দেখা (Abstraction & Inheritance)
        s1.showTask();

        // ৩. মেইন ক্লাস থেকে সেটার ব্যবহার করে ডাটা আপডেট করা
        System.out.println("\nUpdating records from Main class...");
        s1.setStudentName("MD Shorif Uddin"); // নাম আপডেট
        s1.setCgpa(3.95);                     // সিজিপিএ আপডেট

        // ৪. গেটার ব্যবহার করে আলাদাভাবে প্রিন্ট করা
        System.out.println("Updated Name: " + s1.getStudentName());
        System.out.println("Updated CGPA: " + s1.getCgpa());
        
        // ফাইনাল চেক
        s1.showTask();
    }
}