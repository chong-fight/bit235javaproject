package bit235;

/**
 * Represents a student enrolled in the BIT235 course.
 */
public class Student {
    private final String studentId;
    private final String name;
    private int score;

    public Student(String studentId, String name, int score) {
        this.studentId = studentId;
        this.name = name;
        setScore(score);
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public final void setScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100.");
        }
        this.score = score;
    }

    public String getLevel() {
        if (score >= 90) {
            return "Excellent";
        }
        if (score >= 75) {
            return "Good";
        }
        if (score >= 60) {
            return "Pass";
        }
        return "Needs improvement";
    }

    public String getDetails() {
        return String.format("%-10s %-12s %3d  %-10s", studentId, name, score, getLevel());
    }
}
