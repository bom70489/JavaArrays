import java.util.Scanner;

public class Checkerboard_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int checkerboard[][] = new int[number][number];

        for(int i = 0; i < checkerboard.length; i++) {
            for(int j = 0; j < checkerboard[i].length; j++) {
                if((i + j) % 2 == 0) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
        
        sc.close();
    }       
}
