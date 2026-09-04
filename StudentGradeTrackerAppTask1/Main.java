import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grade grade = new Grade();
        Report report = new Report();

        String[] subjects = {"Maths", "Physics", "English", "Computer", "Urdu"};
        int[] marksArr = new int[subjects.length];

        System.out.println("\n------ Student Marks Entry ------");

        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter marks for " + subjects[i] + " (0-100): ");
            int input = sc.nextInt();

            // Simple validation for marks range
            while (input < 0 || input > 100) {
                System.out.print("Invalid! Enter valid marks (0-100) for " + subjects[i] + ": ");
                input = sc.nextInt();
            }

            marksArr[i] = input;
        }

        // Create student object with collected data
        Student student = new Student(subjects, marksArr);

        // Display final report
        report.displayReport(student, subjects, grade);

        sc.close();
    }
}