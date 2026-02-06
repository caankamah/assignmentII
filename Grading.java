public class Grading{
    public static void executeGradeReport(double score){
        boolean validated = validateScore(score);
        if(!validated){
            System.out.println("Invalid Score");
            return;
        } else {
            char grade = calculateLetterGrade(score);
            System.out.println(displayPerformanceMessage(grade));
        }
    }
}
