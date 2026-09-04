public class Grade {

    // Helper method to determine the letter grade based on marks
    public String checkGrade(int marks) {
        if (marks < 0 || marks > 100) {
            return "Invalid Marks";
        } else if (marks >= 80) {
            return "A1 Grade";
        } else if (marks >= 70) {
            return "A Grade";
        } else if (marks >= 60) {
            return "B Grade";
        } else if (marks >= 50) {
            return "C Grade";
        } else {
            return "Fail";
        }
    }
}