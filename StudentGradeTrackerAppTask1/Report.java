public class Report {
    

    public void displayReport(Student student, String[] subjects, Grade grade) {

        System.out.println("\n=================================");
        System.out.println("       STUDENT SUMMARY REPORT");
        System.out.println("=================================");

        System.out.println("\nSubject       Marks       Grade");
        System.out.println("---------------------------------");

        for (int i = 0; i < subjects.length; i++) {

            System.out.println(
                subjects[i] + "          " +
                student.getMarks()[i] + "          " +
                grade.checkGrade(student.getMarks()[i])
            );
        }

        System.out.println("---------------------------------");

        System.out.println("Average Marks : " + student.getAverage());
        System.out.println("Highest Marks : " + student.getHighest());
        System.out.println("Lowest Marks  : " + student.getLowest());

        System.out.println("=================================");
    }
}

