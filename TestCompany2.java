class Employee {
    private String name;
    private int salary;

    public void SetName(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }

    public void SetSalary(int salary) {
        this.salary = salary;
    }

    public int GetSalary() {
        return salary;
    }

    public void displayEmployee() {
        System.out.println("Employee created");
    }
}

class Manager extends Employee {

    private String department;
    private String experience;

    public void Setdepartment(String department) {
        this.department = department;
    }

    public String Getdepartment() {
        return department;
    }

    public void Setexperience(String experience) {
        this.experience = experience;
    }

    public String Getexperience() {
        return experience;
    }

    public Manager() {
        System.out.println("Manager created");
    }

    public void displayManager() {
        super.displayEmployee();
        System.out.println("Department: " + department);
        System.out.println("Experience: " + experience);
    }
}

class SeniorManager extends Manager {
    private String projectName;

    public void SetprojectName(String projectName) {
        this.projectName = projectName;
    }

    public String GetprojectName() {
        return projectName;
    }

    public SeniorManager() {
        System.out.println("Senior Manager created");
    }

    public void displaySeniorManager() {
        super.displayManager();
        System.out.println("Project Name: " + projectName);
    }
}

public class TestCompany2 {
    public static void main(String[] args) {

        SeniorManager s = new SeniorManager();

        s.SetName("Shorif");
        s.SetSalary(23334);
        s.Setdepartment("CSE");
        s.Setexperience("X");
        s.SetprojectName("AI Project");

        // Output show
        System.out.println("Name: " + s.GetName());
        System.out.println("Salary: " + s.GetSalary());

        s.displaySeniorManager();
    }
}