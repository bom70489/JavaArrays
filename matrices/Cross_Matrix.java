import java.util.Scanner;

public class Cross_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        char[][] cross_x = new char[number][number];

        for (int i = 0; i < cross_x.length; i++) {
            for (int j = 0; j < cross_x[i].length; j++) {
                if (i == j || i + j == cross_x.length - 1) {
                    cross_x[i][j] = '*';
                } else {
                    cross_x[i][j] = '.';
                }
                System.out.print(cross_x[i][j] + (j == cross_x[i].length - 1 ? "" : " "));
            }
            System.out.println();
        }
        

        sc.close();
    }
}