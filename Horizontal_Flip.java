import java.util.Scanner;

public class Horizontal_Flip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int horizontal[][] = new int[row][column];
        int reverse[][] = new int[row][column];
        for(int i = 0; i < horizontal.length; i++) {
            for(int j = 0; j < horizontal[i].length; j++) {
                horizontal[i][j] = sc.nextInt();
            }
        }
        
        System.out.println();
        for(int i = 0; i < horizontal.length; i++) {
            for(int j = 0; j < horizontal[i].length; j++) {
                reverse[i][j] = horizontal[i][horizontal[i].length - 1 - j];
                System.out.print(reverse[i][j] + " ");
            }
            System.out.println();
        }


        sc.close();
    }
}
