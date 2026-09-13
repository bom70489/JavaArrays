import java.util.Scanner;

public class HotandCool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        for(int i = 1; i <= 30; i++) {
            if(i % 2 == 0 && i % 3 == 0) {
                System.out.println("Super-Hot : " + i);
                count++;
            } else if(i % 2 == 0) {
                System.out.println("Warm : " + i);
            } else if (i % 3 == 0) {
                System.out.println("Cool : " + i);
            } else {
                System.out.println("Cold : " + i);
            }
        }

        System.out.println("Super-Hot have " + count);

        sc.close();
    }
}
