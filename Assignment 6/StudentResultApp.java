interface Exam {
    void Percent_cal();
}

class Student {
    String name;
    int roll_no;
    double marks1;
    double marks2;

    Student(String name, int roll_no, double marks1, double marks2) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
    }
}

class Result extends Student implements Exam {
    double per;

    Result(String name, int roll_no, double marks1, double marks2) {
        super(name, roll_no, marks1, marks2);
    }

    public void Percent_cal() {
        per = (marks1 + marks2) / 2.0;
    }

    void display() {
        show();
        Percent_cal();
        System.out.println("Percentage: " + per + "%");
    }
}

public class StudentResultApp {
    public static void main(String[] args) {
        Result studentResult = new Result("Emma Watson", 101, 88.5, 92.0);
        
        System.out.println("--- Student Examination Result ---");
        studentResult.display();
    }
}