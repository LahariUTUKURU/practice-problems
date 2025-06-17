import java.util.*;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        // Creating list of students
        List<Student> students = new ArrayList<>();

        students.add(new Student(101, "Lahari", 89.5));
        students.add(new Student(102, "Chani", 76.0));
        students.add(new Student(103, "Subhash", 92.3));
        students.add(new Student(104, "Raju", 69.8));

        System.out.println("All Students:");
        for (Student s : students) {
            s.display();
        }

        // Sorting by marks in descending order using lambda expression
        students.sort((s1, s2) -> Double.compare(s2.marks, s1.marks));

        System.out.println("\nStudents Sorted by Marks (Descending):");
        for (Student s : students) {
            s.display();
        }

        // Filtering students who passed (marks >= 70)
        System.out.println("\nStudents Who Passed:");
        students.stream()
                .filter(s -> s.marks >= 70)
                .forEach(s -> s.display());
    }
}
