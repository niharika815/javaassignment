class Employee {
    String name;
    int employeeId;
    double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
    }
}

public class ParameterizedConstructorDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 101, 75000.50);
        Employee emp2 = new Employee("Jane Smith", 102, 82000.75);

        System.out.println("Details of Employee 1:");
        emp1.displayDetails();
        
        System.out.println("\nDetails of Employee 2:");
        emp2.displayDetails();
    }
}