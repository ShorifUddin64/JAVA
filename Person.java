class Person {

    private String name;
    protected int age;
    static String university;

    static {
        university = "AIUB";
        System.out.println("Static Block Executed");
    }

    Person() {
        System.out.println("Person Constructor");
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

class Student extends Person {

    int id;

    Student() {
        System.out.println("Student Constructor");
    }

    Student(int id, String name, int age) {
        this.id = id;
        this.age = age;
        setName(name);
        System.out.println("Student Parameterized Constructor");
    }

    void show() {
        System.out.println(getName() + " " + age + " " + id + " " + university);
    }
}

public class TestMain {

    public static void main(String[] args) {

        Student s[] = new Student[3];

        s[0] = new Student();
        s[1] = new Student(101,"Rahim",20);

        for(int i=0;i<s.length;i++) {

            if(s[i]==null) {
                s[i] = new Student(200+i,"Student",18);
            }
        }

        for(int i=0;i<s.length;i++) {
            s[i].show();
        }
    }
}