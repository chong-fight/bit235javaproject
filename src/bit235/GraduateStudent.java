package bit235;

/**
 * A student who has already completed an undergraduate degree.
 */
public class GraduateStudent extends Student {
    private final String researchTopic;

    public GraduateStudent(String studentId, String name, int score, String researchTopic) {
        super(studentId, name, score);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    @Override
    public String getLevel() {
        return "Graduate - " + super.getLevel();
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "  [" + researchTopic + "]";
    }
}
