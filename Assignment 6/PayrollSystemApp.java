import java.util.Scanner;

interface GrossInterface {
    void calculateGross();
}

class Employee {
    protected int empId;
    protected String name;

    void getEmployeeDetails(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
    }

    void displayEmployeeDetails() {
        System.out.println("\nEmployee ID: " + empId);
        System.out.println("Employee Name: " + name);
    }
}

class Salary {
    protected float basic, hra, da;

    void getSalaryDetails(Scanner sc) {
        System.out.print("Enter Basic Salary: ");
        basic = sc.nextFloat();
        System.out.print("Enter HRA: ");
        hra = sc.nextFloat();
        System.out.print("Enter DA: ");
        da = sc.nextFloat();
    }
}

class EmployeePayroll extends Employee implements GrossInterface {
    private Salary salary = new Salary();
    private float gross;

    public void getSalaryDetails(Scanner sc) {
        salary.getSalaryDetails(sc);
    }

    public void calculateGross() {
        gross = salary.basic + salary.hra + salary.da;
    }

    public void displayGross() {
        System.out.println("Gross Salary: " + gross);
    }
}

public class PayrollSystemApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeePayroll emp = new EmployeePayroll();

        emp.getEmployeeDetails(sc);
        emp.getSalaryDetails(sc);
        emp.calculateGross();

        emp.displayEmployeeDetails();
        emp.displayGross();

        sc.close();
    }
}