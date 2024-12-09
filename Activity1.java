public class Activity1 {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setId(1234);
        student1.setName("Student_1");

        Book book1 = new Book();

        book1.setBookNumber(1);
        book1.setTitle("The Explorer");
        book1.setPrice(600.0);

        System.out.println("----------------Configuration: <Default>----------------");
        System.out.println("Student ID: " + student1.getId());
        System.out.println("Student Name: " + student1.getName());

        System.out.println("----------------Configuration: <Default>----------------");
        System.out.println("Book Number: " + book1.getBookNumber());
        System.out.println("Book Title: " + book1.getTitle());
        System.out.println("Book Price: " + book1.getPrice() + " php");
        System.out.println("\nProcess completed.");

    }
}

class Student {
    private int Student_Id;
    private String Name;

    public void setId(int s_id) {
        this.Student_Id = s_id;
    }

    public void setName(String s_name) {
        this.Name = s_name;
    }

    public int getId() {
        return Student_Id;
    }

    public String getName() {
        return Name;
    }
}
