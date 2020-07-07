package students;

public interface Examiner {
    public void computeAverage() throws BadGradeException, PerfectScoreException;
    public void inputGrades() throws InvalidGradeException, PerfectScoreException;

}

