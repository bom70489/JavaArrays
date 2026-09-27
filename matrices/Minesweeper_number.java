import java.util.Scanner;

public class Minesweeper_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        char minesweeper[][] = new char[row][column];
        char result[][] = new char[row][column];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                minesweeper[i][j] = sc.next().charAt(0);
            }
        }

        System.out.println();
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                if(minesweeper[i][j] == '*') {
                    result[i][j] = '*';
                } else if(minesweeper[i][j] == '-') {
                    int count = 0;

                    // loop all col and row
                    for(int di = -1; di <= 1; di++) {
                        for(int dj = -1; dj <= 1; dj++) {
                            if(di == 0 && dj == 0) continue; // it self 

                            int ni = i + di; // find row 
                            int nj = j + dj; // find col

                            // if find += 1
                            if(ni >= 0 && ni < row && nj >= 0 && nj < column) {
                                if(minesweeper[ni][nj] == '*') {
                                    count++; 
                                }
                            }
                        }
                    }
                    
                    result[i][j] = (char)(count + '0'); 
                }
                System.out.print(result[i][j] + (j == column - 1 ? "" : " "));
            }
            System.out.println();
        }

        sc.close();
    }
}