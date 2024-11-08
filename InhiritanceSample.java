class Person {
    protected String name;
    protected String address;

    
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}

class Student extends Person {
    private String program;
    private int year;

    
    public Student(String name, String address, String program, int year) {
        super(name, address); 
        this.program = program;
        this.year = year;
    }

    
    public void setProgram(String program) {
        this.program = program;
    }

    public String getProgram() {
        return program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

   
    public void displayInfo() {
        System.out.println("---------------Configuration: <Default>---------------");
        System.out.println("Student Name: " + name);
        System.out.println("Student Address: " + address);
        System.out.println("Student Program: " + program);
        System.out.println("Student Year: " + year);
        System.out.println("\nProcess completed.");
    }
}

class Staff extends Person {
    private String school;
    private double salary;

    
    public Staff(String name, String address, String school, double salary) {
        super(name, address);
        this.school = school;
        this.salary = salary;
    }

    
    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    
    public void displayInfo() {
        System.out.println("---------------Configuration: <Default>---------------");
        System.out.println("Staff Name: " + name);
        System.out.println("Staff Address: " + address);
        System.out.println("Staff School: " + school);
        System.out.println("Staff Salary: " + salary);
        System.out.println("\nProcess completed.");
    }
}

public class Main {
    public static void main(String[] args) {
       
        Student student = new Student("Villalobos Lawrence C.", "Pantay, Calaca, Batangas ", "BSIT", 2);
        student.displayInfo();

     
        Staff staff = new Staff("Mat Jannus", "Dacanlao, Calaca, Batangas", "BSIT", 3800.0);
        staff.displayInfo();
    }
}
