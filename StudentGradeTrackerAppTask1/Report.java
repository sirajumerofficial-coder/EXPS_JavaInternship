public class Report {

    public void displayReport(Student student, String[] subjects, Grade grade) {
        System.out.println("\n=========================================");
        System.out.println("         STUDENT SUMMARY REPORT          ");
        System.out.println("=========================================");
        
        System.out.println("Subject\t\tMarks\t\tGrade");
        System.out.println("-----------------------------------------");

        int[] marks = student.getMarks();
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + "\t\t" + marks[i] + "\t\t" + grade.checkGrade(marks[i]));
        }

        System.out.println("-----------------------------------------");
        System.out.println("Average Marks : " + student.getAverage());
        System.out.println("Highest Marks : " + student.getHighest());
        System.out.println("Lowest Marks  : " + student.getLowest());
        System.out.println("=========================================");
    }
}