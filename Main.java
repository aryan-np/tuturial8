package week8Workshop;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("ram",19,36.5f,30,41);
        GradeCalculator calculator = new GradeCalculator();
        float grade = calculator.calculateGrade(student);
        System.out.println("Grade = "+ grade);
    }

}
