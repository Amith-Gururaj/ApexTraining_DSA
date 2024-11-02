import java.util.HashMap;
import java.util.Map;

public class HighestAverageMarks {

    public static double findMaxAverage(String[][] students){
        Map<String, int[]> scoreMap = new HashMap<>();

        for (String[] entry : students) {
            String name = entry[0];
            int mark = Integer.parseInt(entry[1]);

            scoreMap.putIfAbsent(name, new int[2]);
            scoreMap.get(name)[0] += mark;
            scoreMap.get(name)[1]++;
        }

        double maxAverage = Double.NEGATIVE_INFINITY;

        for (int[] scores : scoreMap.values()) {
            double average = (double) scores[0] / scores[1];
            maxAverage = Math.max(maxAverage, average);
        }

        return maxAverage;
    }
}
