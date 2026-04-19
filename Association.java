import java.util.*;

class Employee {
    String name;
    Employee(String name) { this.name = name; }
}

class Bank {
    String bankName;
    List<Employee> employees;

    Bank(String name) { this.bankName = name; }

    void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    void showDetails() {
        System.out.println("\n--- " + bankName + " This information");
        if (employees != null) {
            for (Employee e : employees) {
                System.out.println("Employee Name: " + e.name);
            }
        }
    }
}

public class Association {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your Bank Name: ");
        String bName = sc.nextLine();
        Bank myBank = new Bank(bName);

        System.out.print("Enter Your Employee Number ");
        int count = sc.nextInt();
        sc.nextLine(); // বাফার ক্লিয়ার করার জন্য

        List<Employee> list = new ArrayList<>();

        // ইউজারের ইনপুট অনুযায়ী লুপ চলবে
        for (int i = 1; i <= count; i++) {
            // নিচে কোটেশন ঠিক করা হয়েছে
            System.out.print(i + " Employee Namegg: "); 
            String empName = sc.nextLine();
            list.add(new Employee(empName)); 
        }

        // অ্যাসোসিয়েশন স্থাপন
        myBank.setEmployees(list);
        
        // সব প্রিন্ট করা
        myBank.showDetails();
        
        sc.close();
    }
}