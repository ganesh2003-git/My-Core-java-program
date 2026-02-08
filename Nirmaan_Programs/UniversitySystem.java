import java.util.Scanner;

// University Class
class University {
    private String name;
    private String location;

    public University(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "University Name: " + name + ", Location: " + location;
    }
}

// College Class
class College {
    private String code;
    private String name;
    private String location;
    private University university;

    public College(String code, String name, String location, University university) {
        this.code = code;
        this.name = name;
        this.location = location;
        this.university = university;
    }

    @Override
    public String toString() {
        return "College Code: " + code + ", College Name: " + name + ", Location: " + location + ", " + university;
    }
}

// Student Class
class Student {
    private String hallTicket;
    private String name;
    private String courseType;
    private College college;

    public Student(String hallTicket, String name, String courseType, College college) {
        this.hallTicket = hallTicket;
        this.name = name;
        this.courseType = courseType;
        this.college = college;
    }

    @Override
    public String toString() {
        return "Hall Ticket: " + hallTicket + ", Student Name: " + name + ", Course Type: " + courseType + ", " + college;
    }
}

// Main Application Class
public class UniversitySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input University Details
        System.out.print("Enter University Name: ");
        String universityName = scanner.nextLine();
        System.out.print("Enter University Location: ");
        String universityLocation = scanner.nextLine();
        University university = new University(universityName, universityLocation);

        // Input College Details
        System.out.print("Enter College Code: ");
        String collegeCode = scanner.nextLine();
        System.out.print("Enter College Name: ");
        String collegeName = scanner.nextLine();
        System.out.print("Enter College Location: ");
        String collegeLocation = scanner.nextLine();
        College college = new College(collegeCode, collegeName, collegeLocation, university);

        // Input Student Details
        System.out.print("Enter Hall Ticket: ");
        String hallTicket = scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter Course Type: ");
        String courseType = scanner.nextLine();
        Student student = new Student(hallTicket, studentName, courseType, college);

        // Display Information
        System.out.println("\n--- University Information ---");
        System.out.println(university);

        System.out.println("\n--- College Information ---");
        System.out.println(college);

        System.out.println("\n--- Student Information ---");
        System.out.println(student);

    }
}