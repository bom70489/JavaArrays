import java.util.Arrays;
import java.util.Scanner;

public class Grading_2_Sort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int[] scores = new int[total];
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < total; i++) {
            scores[i] = sc.nextInt();                      
        }

        int percentile_90 , percentile_70 , percentile_50 , percentile_30 , percentile_10;
        percentile_10 = (10 * (total + 1)) / 100;
        percentile_30 = (30 * (total + 1)) / 100;
        percentile_50 = (50 * (total + 1)) / 100;
        percentile_70 = (70 * (total + 1)) / 100;
        percentile_90 = (90 * (total + 1)) / 100;


       // if sort    
       Arrays.sort(scores);

       for(int i = 0; i < scores.length; i++) {
           if(i < percentile_10) {
             result.append("F").append(" ");
           } else if(i < percentile_30) {
             result.append("E").append(" ");
           } else if(i < percentile_50) {
             result.append("D").append(" ");
           } else if(i < percentile_70) {
             result.append("C").append(" ");
           } else if(i < percentile_90) {
             result.append("B").append(" ");
           } else {
             result.append("A").append(" ");
           }
       }

       System.out.println(result);

        sc.close();
    }
}
