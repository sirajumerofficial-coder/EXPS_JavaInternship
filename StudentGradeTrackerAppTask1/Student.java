public class Student {

    private String[] subjects;
    private int[] marks;

    public Student(String[] subjects, int[] marks) {
        this.subjects = subjects;
        this.marks = marks;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int[] getMarks() {
        return marks;
    }

    // Average nikalna
    public double getAverage() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum / (double) marks.length;
    }

    // Highest marks nikalna
    public int getHighest() {
        int highest = marks[0];
        for (int m : marks) {
            if (m > highest) {
                highest = m;
            }
        }
        return highest;
    }

    // Lowest marks nikalna
    public int getLowest() {
        int lowest = marks[0];
        for (int m : marks) {
            if (m < lowest) {
                lowest = m;
            }
        }
        return lowest;
    }
}
