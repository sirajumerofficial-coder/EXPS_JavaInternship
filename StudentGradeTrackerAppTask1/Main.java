import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grade grade = new Grade();
        Report report = new Report();

      
        


        String[] subjects = {"Maths", "Physics", "English", "Computer", "Urdu"};
        int[] marksArr = new int[subjects.length];

        System.out.println("\n------ Student Grades ------");

        // Input
        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter marks in " + subjects[i] + ": ");
            marksArr[i] = sc.nextInt();
        }

        Student student = new Student(subjects, marksArr);

        // Grades
        System.out.println("\n------ Grades ------");
        for (int i = 0; i < subjects.length; i++) {
            System.out.print(subjects[i] + ": ");
            System.out.println(grade.checkGrade(marksArr[i]));
        }

        // Result
        System.out.println("\n------ Result ------");
        System.out.println("Average Marks: " + student.getAverage());
        System.out.println("Highest Marks: " + student.getHighest());
        System.out.println("Lowest Marks: " + student.getLowest());
         report.displayReport(student, subjects, grade);
        sc.close();
    }
}