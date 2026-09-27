import java.util.Scanner;

public class Rotate_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int matrix[][] = new int[number][number];
        int tranform[][] = new int[number][number];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();    
            }
        }
        
        System.out.println();
        for(int i = 0; i < tranform.length; i++) {
            for(int j = 0; j < tranform[i].length; j++) {
                tranform[i][j] = matrix[matrix.length - 1 - j][i];
                System.out.print(tranform[i][j] + " ");
            } 
            System.out.println();
        }



        





        sc.close();
    }
}
