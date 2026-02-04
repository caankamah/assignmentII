public class Average {
    public static double calculateClassAverage(double score1, double score2){
        double average = (score1 + score2) / 2;  
        return average;
    }

    public static double calculateClassAverage(double score1, double score2, double score3){
        double average = (score1 + score2  + score3) / 3;
        return average;
    }

    public static double calculateClassAverage(double[] scores){
        double totalScore = 0;
        int n = scores.length;
        for(int i = 0; i < n; i++){
            totalScore += scores[i];
        }
        double average = totalScore / n;
        return average;
    }
}
