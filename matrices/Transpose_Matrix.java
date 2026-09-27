import java.util.Scanner;

public class Transpose_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int matrix[][] = new int[row][column];
        int sort[][] = new int[column][row];
        // input the matrix
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
                sort[j][i] = matrix[i][j]; 
            }
        }
        
        System.out.println();
        for(int i = 0; i < sort.length; i++) {
            for(int j = 0; j < sort[i].length; j++) {
                System.out.print(sort[i][j] + " ");
            }
            System.out.println();
        } 

        sc.close();
    }
}
