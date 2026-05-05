import java.util.Scanner;

interface Department {
    String deptName = "Computer Science";
    String deptHead = "Dr. Alan Turing";
    
    void printDeptDetails();
}

class Hostel {
    String hostelName;
    String hostelLocation;
    int numberOfRooms;

    void getHostelData(Scanner sc) {
        System.out.print("Enter Hostel Name: ");
        hostelName = sc.nextLine();
        System.out.print("Enter Hostel Location: ");
        hostelLocation = sc.nextLine();
        System.out.print("Enter Number of Rooms in Hostel: ");
        numberOfRooms = sc.nextInt();
        sc.nextLine();
    }

    void printHostelData() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Total Rooms in Hostel: " + numberOfRooms);
    }
}

class Student extends Hostel implements Department {
    String studentName;
    String regdNo;
    String electiveSubject;
    double avgMarks;

    void getData(Scanner sc) {
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();
        System.out.print("Enter Registration Number: ");
        regdNo = sc.nextLine();
        System.out.print("Enter Elective Subject: ");
        electiveSubject = sc.nextLine();
        System.out.print("Enter Average Marks: ");
        avgMarks = sc.nextDouble();
        sc.nextLine();
        getHostelData(sc);
    }

    void printData() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
        printDeptDetails();
        printHostelData();
    }

    public void printDeptDetails() {
        System.out.println("Department Name: " + deptName);
        System.out.println("Department Head: " + deptHead);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100];
        int count = 0;
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Admit new student");
            System.out.println("2. Migrate a student");
            System.out.println("3. Display details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    if (count < 100) {
                        students[count] = new Student();
                        students[count].getData(sc);
                        count++;
                        System.out.println("Student admitted successfully.");
                    } else {
                        System.out.println("Admission limit reached.");
                    }
                    break;
                case 2:
                    System.out.print("Enter Registration Number to migrate: ");
                    String reg = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (students[i].regdNo.equals(reg)) {
                            System.out.println("Student found. Enter new hostel details:");
                            students[i].getHostelData(sc);
                            System.out.println("Student migrated successfully.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student with given Registration Number not found.");
                    }
                    break;
                case 3:
                    if (count == 0) {
                        System.out.println("No students to display.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("\n--- Student " + (i + 1) + " Details ---");
                            students[i].printData();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}