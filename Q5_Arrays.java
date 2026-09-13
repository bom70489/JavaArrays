import java.util.Scanner;

public class Q5_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        char seats[][] = new char[row][column];

        for(int i = 0; i < seats.length; i++) {
            for(int j = 0; j < seats[i].length; j++) {
                if(i == 0) {
                    seats[i][j] = 'V';
                } else if(j == 0 || j == seats[i].length - 1) {
                    seats[i][j] = 'A';
                } else if(i == j) {
                    seats[i][j] = 'L';
                } else {
                    seats[i][j] = 'N';
                }
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
