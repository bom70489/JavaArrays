import java.util.Scanner;

public class Nested_Border {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        String border[][] = new String[row][column];
        int count = 0;
        for(int i = 0; i < border.length; i++) {
            for(int j = 0; j < border[i].length; j++) {
                if(i == 0 || j == 0 || j == border[i].length - 1 || i == border.length - 1) {
                    border[i][j] = "1";
                    count++;
                } else {
                    border[i][j] = "0";
                }
            }
        }

        for(int i = 0; i < border.length; i++) {
            for(int j = 0; j < border[i].length; j++) {
                System.out.print(border[i][j] + (j == border[i].length - 1 ? "" : " "));
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("Total sum = " + count);

        sc.close();
    }
}
