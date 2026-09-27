import java.util.Scanner;

public class RC_sums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int matrix[][] = new int[row][column];
        int tranfrom[][] = new int[column][row];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
                tranfrom[j][i] = matrix[i][j];
            }            
        }
        
        for(int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for(int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Row %d sum = %d".formatted(i , sum));
        }

        for(int i = 0; i < tranfrom.length; i++) {
            int sum = 0;
            for(int j = 0; j < tranfrom[i].length; j++) { 
                sum += tranfrom[i][j];
            }
            System.out.println("Column %d sum = %d".formatted(i , sum));
        }

       
        
        sc.close();
    }
}
