package bit235;

import java.util.List;

/**
 * Entry point for the BIT235 Java OOP project.
 */
public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("2026001", "Alice", 92),
                new Student("2026002", "Bob", 78),
                new Student("2026003", "Carol", 65),
                new GraduateStudent("2026004", "David", 88, "Software Engineering"));

        System.out.println("==============================================");
        System.out.println("        BIT235 - Student Score Report");
        System.out.println("==============================================");
        System.out.printf("%-10s %-12s %3s  %-10s%n", "ID", "Name", "Score", "Level");
        System.out.println("----------------------------------------------");

        for (Student student : students) {
            System.out.println(student.getDetails());
        }

        double average = students.stream()
                .mapToInt(Student::getScore)
                .average()
                .orElse(0);

        System.out.println("----------------------------------------------");
        System.out.printf("Average score: %.1f%n", average);
        System.out.println("Total students: " + students.size());
        System.out.println("==============================================");
    }
}
