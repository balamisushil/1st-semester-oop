package assignment_1_part_2;
import java.util.Date;

class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Class: Person, Name: " + name;
    }
}

class Student extends Person {
    public enum Status {
        FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
    }

    private Status status;

    public Student(String name, String address, String phoneNumber, String email, Status status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Class: Student, Name: " + super.toString();
    }
}


class Employee extends Person {
    private String office;
    private double salary;
    private Date dateHired;

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, Date dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Class: Employee, Name: " + super.toString();
    }
}

class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, Date dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Class: Faculty, Name: " + super.toString();
    }
}

class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, Date dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Class: Staff, Name: " + super.toString();
    }
}

class FullTime extends Staff {
    public FullTime(String name, String address, String phoneNumber, String email, String office, double salary, Date dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired, title);
    }

    @Override
    public String toString() {
        return "Class: FullTime, Name: " + super.toString();
    }
}

class PartTime extends Staff {
    private int hoursWorked;

    public PartTime(String name, String address, String phoneNumber, String email, String office, double hourlyRate, int hoursWorked, Date dateHired, String title) {
        super(name, address, phoneNumber, email, office, hourlyRate * hoursWorked, dateHired, title);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "Class: PartTime, Name: " + super.toString();
    }
}


public class TestHierarchy {
    public static void main(String[] args) {
        Person person = new Person("Ram Bahadur", "Kathmandu", "980-123-4567", "rambahadur@example.com");
        Student student = new Student("Shyam Thapa", "Pokhara", "980-123-4568", "shyamthapa@example.com", Student.Status.SENIOR);
        Employee employee = new Employee("Hari Prasad", "Biratnagar", "980-123-4569", "hariprasad@example.com", "Office 101", 50000, new Date());
        Faculty faculty = new Faculty("Dr. Bishnu", "Dharan", "980-123-4570", "drbishnu@example.com", "Office 202", 60000, new Date(), "9-5", "Professor");
        Staff staff = new Staff("Sita Devi", "Butwal", "980-123-4571", "sitadevi@example.com", "Office 303", 40000, new Date(), "Manager");
        FullTime fullTimeStaff = new FullTime("Gopal Lama", "Hetauda", "980-123-4572", "gopallama@example.com", "Office 404", 45000, new Date(), "Director");
        PartTime partTimeStaff = new PartTime("Mina Kumari", "Birgunj", "980-123-4573", "minakumari@example.com", "Office 505", 20, 25, new Date(), "Assistant");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
        System.out.println(fullTimeStaff);
        System.out.println(partTimeStaff);
    }
}


