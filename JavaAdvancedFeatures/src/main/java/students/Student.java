package students;

public class Student extends Person implements Examiner,Average {
    int mathGrade;
    int infoGrade;
    int phisGrade;
    boolean acceptedPol;


    public Student(String name, String lastName, int mathGrade, int infoGrade, int phisGrade) {
        this.name = name;
        this.lastName = lastName;
        this.infoGrade = infoGrade;
        this.mathGrade = mathGrade;
        this.phisGrade = phisGrade;

    }

    public Student() {

    }

    @Override
    public void computeAverage() throws BadGradeException{
        int average = (this.mathGrade + this.infoGrade + this.phisGrade) / 3;
        if (average < 6) {
            throw new BadGradeException("Studentul este repetent");
        } else if (average > 6 && average < 9) {
            this.acceptedPol = false;
        } else {
            this.acceptedPol = true;
        }
    }

    @Override
    public void inputGrades() throws InvalidGradeException, PerfectScoreException {
            if ((this.phisGrade < 1 || this.phisGrade > 10) || (this.mathGrade < 1 || this.mathGrade > 10)
                    || (this.infoGrade < 1 || this.infoGrade > 10)) {
                throw new InvalidGradeException("You have entered an invalid grade");
            }else if(this.phisGrade ==10 && this.infoGrade == 10 && this.mathGrade==10 ){
                throw new PerfectScoreException("Congratulation, you have a perfect score!!!");
            }
        }

    public boolean getAcceptedPol() {
        return this.acceptedPol;
    }

    public void acceptedInfo() throws PerfectScoreException{
        if(averageMathInfo() > 8){
            System.out.println("Accepted to ComputerScience");
        }
        if(averageMathInfo() == 10){
            throw new PerfectScoreException("Congratulation, you have a perfect score!!!");
        }
    }

    public void acceptedPhis() throws PerfectScoreException{
        if(averageMathPhis() >= 9){
            System.out.println("Accepted to faculty of Physics");
        }
        if(averageMathPhis() ==10){
            throw new PerfectScoreException("Congratulation, you have a perfect score!!!");
        }
    }

    @Override
    public int averageMathPhis() {
        return (this.phisGrade + this.mathGrade)/2;
    }

    @Override
    public int averageMathInfo() {
        return (this.mathGrade+this.infoGrade)/2;
    }
}
