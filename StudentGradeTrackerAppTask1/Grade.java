public class Grade {

    // Marks se grade nikalne ka method
    public String checkGrade(int marks) {
        if (marks >= 50 && marks < 60) {
            return "C Grade";
        }
        else if (marks >= 60 && marks < 70) {
            return "B Grade";
        }
        else if (marks >= 70 && marks < 80) {
            return "A Grade";
        }
        else if (marks >= 80 && marks <= 100) {
            return "A1 Grade";
        }
        else {
            return "Fail / Invalid Marks";
        }
    }
}