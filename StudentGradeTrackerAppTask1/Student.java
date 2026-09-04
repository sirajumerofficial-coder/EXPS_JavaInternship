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

    // Calculates average of all subjects
    public double getAverage() {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return (double) sum / marks.length;
    }

    // Finds maximum marks obtained
    public int getHighest() {
        int highest = marks[0];
        for (int m : marks) {
            if (m > highest) {
                highest = m;
            }
        }
        return highest;
    }

    // Finds minimum marks obtained
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